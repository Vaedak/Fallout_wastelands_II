package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.level.LevelAccessor;

public class BASEcoreUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ParticleSquareProcedure.execute(world, x, y, z);
	}
}
