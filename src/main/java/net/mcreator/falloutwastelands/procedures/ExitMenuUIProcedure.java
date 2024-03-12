package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ExitMenuUIProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
