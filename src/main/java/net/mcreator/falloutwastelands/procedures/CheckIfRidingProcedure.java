package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CheckIfRidingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ArmorStand) {
			if (!entity.isPassenger()) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
