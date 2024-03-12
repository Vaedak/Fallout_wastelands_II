package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ZoneMobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, 0, 0));
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, (entity.getPersistentData().getDouble("entityzoneSize")), (entity.getPersistentData().getDouble("entityzoneSize")), (entity.getPersistentData().getDouble("entityzoneSize")),
					0.001);
	}
}
