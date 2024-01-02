package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class IMPORTANTReloadGunProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("ReloadGun") == true) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.BASE_GUN_ITEM.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.BASE_GUN_ITEM.get()) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.BASE_GUN_ITEM.get()) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() > 0) {
						if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FalloutWastelandsModItems.CAPS.get())) : false) {
							{
								AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
								entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
								if (_iitemhandlerref.get() != null) {
									for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
										ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
										if (itemstackiterator.getItem() == FalloutWastelandsModItems.CAPS.get()) {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_break")), SoundSource.NEUTRAL, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_break")), SoundSource.NEUTRAL, 1, 1, false);
												}
											}
											FalloutWastelandsMod.queueServerWork(25, () -> {
												if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.BASE_GUN_ITEM.get()) {
													if (entity instanceof Player _player) {
														ItemStack _stktoremove = itemstackiterator;
														_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(),
																(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue(), _player.inventoryMenu.getCraftSlots());
													}
													(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
															.setDamageValue((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() - itemstackiterator.getCount()));
													entity.getPersistentData().putBoolean("ReloadGun", false);
												}
											});
											entity.getPersistentData().putBoolean("ReloadGun", false);
										}
									}
								}
							}
						} else {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_bottle.throw")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_bottle.throw")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							entity.getPersistentData().putBoolean("ReloadGun", false);
						}
					} else {
						entity.getPersistentData().putBoolean("ReloadGun", false);
						entity.getPersistentData().putDouble("timer", 0);
					}
				}
			} else {
				entity.getPersistentData().putBoolean("ReloadGun", false);
				entity.getPersistentData().putDouble("timer", 0);
			}
		}
	}
}
