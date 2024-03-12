package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ZoneMobEntityVisualScaleProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FalloutWastelandsModItems.DELETED_MOD_ELEMENT.get()) {
			entity.getPersistentData().putDouble("entityzoneSize", (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
			return entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1;
		}
		return 0;
	}
}
