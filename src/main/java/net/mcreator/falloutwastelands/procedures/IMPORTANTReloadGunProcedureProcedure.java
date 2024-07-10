package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.falloutwastelands.init.FalloutWastelandsModItems;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;

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
		boolean ammoChecked = false;
		double ammoCount = 0;
		if (entity.getPersistentData().getBoolean("ReloadGun") == true) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.BASE_GUN_ITEM.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.REVOLVER_32.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.TENMMPISTOL.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.NINEMMPISTOL.get()) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.REVOLVER_32.get()) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() > 0) {
						if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FalloutWastelandsModItems.BOTTLE_CAP.get())) : false) {
							if (entity.getPersistentData().getDouble("timer") == 10) {
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
										.setDamageValue((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() + -1));
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
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.NINEMMPISTOL.get()) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() > 0) {
						if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FalloutWastelandsModItems.NINEMMAMMO.get())) : false) {
							if (ammoChecked == false) {
								{
									AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
									entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
									if (_iitemhandlerref.get() != null) {
										for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
											ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
											if (itemstackiterator.getItem() == FalloutWastelandsModItems.NINEMMAMMO.get()) {
												ammoCount = ammoCount + itemstackiterator.getCount();
											}
											ammoChecked = true;
										}
									}
								}
								if (entity instanceof Player _player) {
									ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.NINEMMAMMO.get());
									_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue(),
											_player.inventoryMenu.getCraftSlots());
								}
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
										.setDamageValue((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() - ammoCount));
								entity.getPersistentData().putBoolean("ReloadGun", false);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_break")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_break")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 40);
								entity.getPersistentData().putDouble("cooldown", 40);
							}
						} else {
							entity.getPersistentData().putBoolean("ReloadGun", false);
						}
					} else {
						entity.getPersistentData().putBoolean("ReloadGun", false);
					}
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.TENMMPISTOL.get()) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() > 0) {
						if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FalloutWastelandsModItems.TENMMAMMO.get())) : false) {
							if (ammoChecked == false) {
								{
									AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
									entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
									if (_iitemhandlerref.get() != null) {
										for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
											ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
											if (itemstackiterator.getItem() == FalloutWastelandsModItems.TENMMAMMO.get()) {
												ammoCount = ammoCount + itemstackiterator.getCount();
											}
											ammoChecked = true;
										}
									}
								}
								if (entity instanceof Player _player) {
									ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.TENMMAMMO.get());
									_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue(),
											_player.inventoryMenu.getCraftSlots());
								}
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
										.setDamageValue((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() - ammoCount));
								entity.getPersistentData().putBoolean("ReloadGun", false);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_break")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_break")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 40);
								entity.getPersistentData().putDouble("cooldown", 40);
							}
						} else {
							entity.getPersistentData().putBoolean("ReloadGun", false);
						}
					} else {
						entity.getPersistentData().putBoolean("ReloadGun", false);
					}
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.TENMMHOMEMADEASSAULTRIFLE.get()) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() > 0) {
						if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FalloutWastelandsModItems.TENMMAMMO.get())) : false) {
							if (ammoChecked == false) {
								{
									AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
									entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
									if (_iitemhandlerref.get() != null) {
										for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
											ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
											if (itemstackiterator.getItem() == FalloutWastelandsModItems.TENMMAMMO.get()) {
												ammoCount = ammoCount + itemstackiterator.getCount();
											}
											ammoChecked = true;
										}
									}
								}
								if (entity instanceof Player _player) {
									ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.TENMMAMMO.get());
									_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue(),
											_player.inventoryMenu.getCraftSlots());
								}
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
										.setDamageValue((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() - ammoCount));
								entity.getPersistentData().putBoolean("ReloadGun", false);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_break")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_break")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 40);
								entity.getPersistentData().putDouble("cooldown", 40);
							}
						} else {
							entity.getPersistentData().putBoolean("ReloadGun", false);
						}
					} else {
						entity.getPersistentData().putBoolean("ReloadGun", false);
					}
				}
			} else {
				entity.getPersistentData().putBoolean("ReloadGun", false);
				entity.getPersistentData().putDouble("timer", 0);
			}
		}
	}
}
