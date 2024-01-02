package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CanUseRangedItemProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return false;
		double AmmoCount = 0;
		if (itemstack.getDamageValue() == itemstack.getMaxDamage() - 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.goat.hurt")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.goat.hurt")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		return itemstack.getDamageValue() < itemstack.getMaxDamage() - 1 == true && entity.getPersistentData().getBoolean("ReloadGun") == false;
	}
}
