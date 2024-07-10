package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class WhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		boolean found = false;
		double Xposition = 0;
		double Yposition = 0;
		double Zposition = 0;
		if (immediatesourceentity.getPersistentData().getBoolean("enableGravity") == false) {
			immediatesourceentity.setNoGravity(true);
		} else {
			immediatesourceentity.setNoGravity(false);
		}
		FalloutWastelandsMod.queueServerWork(200, () -> {
			immediatesourceentity.getPersistentData().putBoolean("enableGravity", true);
		});
		Xposition = -1;
		Yposition = -1;
		Zposition = -1;
		for (int index0 = 0; index0 < 2; index0++) {
			if (world.getBlockState(BlockPos.containing(immediatesourceentity.getX() + Xposition, immediatesourceentity.getY(), immediatesourceentity.getZ())).getDestroySpeed(world,
					BlockPos.containing(immediatesourceentity.getX() + Xposition, immediatesourceentity.getY(), immediatesourceentity.getZ())) < 0.1) {
				world.destroyBlock(BlockPos.containing(immediatesourceentity.getX() + Xposition, y, z), false);
			}
			Xposition = Xposition + 1;
			for (int index1 = 0; index1 < 2; index1++) {
				if (world.getBlockState(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY() + Yposition, immediatesourceentity.getZ())).getDestroySpeed(world,
						BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY() + Yposition, immediatesourceentity.getZ())) < 0.1) {
					world.destroyBlock(BlockPos.containing(x, immediatesourceentity.getY() + Yposition, z), false);
				}
				Yposition = Yposition + 1;
				for (int index2 = 0; index2 < 2; index2++) {
					if (world.getBlockState(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ() + Zposition)).getDestroySpeed(world,
							BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ() + Zposition)) < 0.1) {
						world.destroyBlock(BlockPos.containing(x, y, immediatesourceentity.getZ() + Zposition), false);
					}
					Zposition = Zposition + 1;
				}
			}
		}
	}
}
