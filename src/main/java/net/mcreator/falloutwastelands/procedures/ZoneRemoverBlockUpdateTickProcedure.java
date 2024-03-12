package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ZoneRemoverBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.EMERALD_BLOCK) {
			world.setBlock(BlockPos.containing(x + 1, y, z), FalloutWastelandsModBlocks.ZONE_REMOVER_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.EMERALD_BLOCK) {
			world.setBlock(BlockPos.containing(x - 1, y, z), FalloutWastelandsModBlocks.ZONE_REMOVER_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.EMERALD_BLOCK) {
			world.setBlock(BlockPos.containing(x, y + 1, z), FalloutWastelandsModBlocks.ZONE_REMOVER_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.EMERALD_BLOCK) {
			world.setBlock(BlockPos.containing(x, y - 1, z), FalloutWastelandsModBlocks.ZONE_REMOVER_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.EMERALD_BLOCK) {
			world.setBlock(BlockPos.containing(x, y, z + 1), FalloutWastelandsModBlocks.ZONE_REMOVER_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.EMERALD_BLOCK) {
			world.setBlock(BlockPos.containing(x, y, z - 1), FalloutWastelandsModBlocks.ZONE_REMOVER_BLOCK.get().defaultBlockState(), 3);
		}
		FalloutWastelandsMod.queueServerWork(20, () -> {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		});
	}
}
