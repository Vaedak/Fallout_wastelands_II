package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModBlocks;

public class ZoneMobEntityVisualScaleProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FalloutWastelandsModBlocks.BAS_ECORE.get()) {
			entity.getPersistentData().putDouble("entityzoneSize", (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
			return entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1;
		}
		return 0;
	}
}
