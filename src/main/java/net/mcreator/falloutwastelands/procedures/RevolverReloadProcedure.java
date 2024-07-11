package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RevolverReloadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double ammoCount = 0;
		boolean ammoChecked = false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.REVOLVER_32.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() > 0) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FalloutWastelandsModItems.BOTTLE_CAP.get())) : false) {
					if (entity.getPersistentData().getDouble("timer") == 10) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).setDamageValue((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() + -1));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_break")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_break")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						entity.getPersistentData().putDouble("timer", 0);
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.BOTTLE_CAP.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
					entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 1));
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_bottle.throw")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_bottle.throw")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					entity.getPersistentData().putBoolean("ReloadGun", false);
					entity.getPersistentData().putDouble("timer", 0);
				}
			} else {
				entity.getPersistentData().putBoolean("ReloadGun", false);
				entity.getPersistentData().putDouble("timer", 0);
			}
		}
	}
}
