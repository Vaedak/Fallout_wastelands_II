
package net.mcreator.falloutwastelands.block;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.world.inventory.LockerStorageMenu;

import java.util.List;
import java.util.Collections;

import io.netty.buffer.Unpooled;

public class MetalShelfBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public MetalShelfBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.75f, 1.5f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean shouldDisplayFluidOverlay(BlockState state, BlockAndTintGetter world, BlockPos pos, FluidState fluidstate) {
		return true;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(11, 0, 12, 13, 32, 14), box(3, 0, 12, 5, 32, 14), box(3, 0, -14, 5, 32, -12), box(11, 0, -14, 13, 32, -12));
			case NORTH -> Shapes.or(box(3, 0, 2, 5, 32, 4), box(11, 0, 2, 13, 32, 4), box(11, 0, 28, 13, 32, 30), box(3, 0, 28, 5, 32, 30));
			case EAST -> Shapes.or(box(12, 0, 3, 14, 32, 5), box(12, 0, 11, 14, 32, 13), box(-14, 0, 11, -12, 32, 13), box(-14, 0, 3, -12, 32, 5));
			case WEST -> Shapes.or(box(2, 0, 11, 4, 32, 13), box(2, 0, 3, 4, 32, 5), box(28, 0, 3, 30, 32, 5), box(28, 0, 11, 30, 32, 13));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		if (entity instanceof ServerPlayer player) {
			NetworkHooks.openScreen(player, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Metal Shelf");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new LockerStorageMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
				}
			}, pos);
		}
		return InteractionResult.SUCCESS;
	}
}
