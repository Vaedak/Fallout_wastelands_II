package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SpawnBASEfieldProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = FalloutWastelandsModEntities.ZONE_MOB.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
	}
}
