package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.entity.Entity;

public class WhileProjectileFlyingTickProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (immediatesourceentity.getPersistentData().getBoolean("enableGravity") == false) {
			immediatesourceentity.setNoGravity(true);
		} else {
			immediatesourceentity.setNoGravity(false);
		}
		if (immediatesourceentity.getPersistentData().getBoolean("enableCounter") == false) {
			immediatesourceentity.getPersistentData().putDouble("enableGravityCounter", 200);
			immediatesourceentity.getPersistentData().putBoolean("enableCounter", true);
		}
		if (0 < immediatesourceentity.getPersistentData().getDouble("enableGravityCounter")) {
			immediatesourceentity.getPersistentData().putDouble("enableGravityCounter", (immediatesourceentity.getPersistentData().getDouble("enableGravityCounter") - 1));
		} else {
			immediatesourceentity.getPersistentData().putBoolean("enableGravity", true);
		}
	}
}
