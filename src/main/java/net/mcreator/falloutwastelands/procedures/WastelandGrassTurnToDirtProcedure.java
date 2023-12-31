package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class WastelandGrassTurnToDirtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world.getBlockState(BlockPos.containing(x, y + 1, z)).getLightBlock(world, BlockPos.containing(x, y + 1, z)) == 0 && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER)) {
			world.setBlock(BlockPos.containing(x, y, z), FalloutWastelandsModBlocks.WASTELAND_DIRT.get().defaultBlockState(), 3);
		}
	}
}
