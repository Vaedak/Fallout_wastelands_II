package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BASEMenuUIWhileThisGUIIsOpenTickProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		return new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), "BASEblockName");
	}
}
