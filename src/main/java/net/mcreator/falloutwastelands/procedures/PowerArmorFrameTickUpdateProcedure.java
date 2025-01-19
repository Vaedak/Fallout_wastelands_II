package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PowerArmorFrameTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle()) {
			if ((entity.getFirstPassenger()) instanceof ArmorStand) {
				{
					Entity _ent = (entity.getFirstPassenger());
					_ent.setYRot(entity.getYRot());
					_ent.setXRot(0);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				if ((entity.getFirstPassenger()) instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(FalloutWastelandsModMobEffects.DELETED_MOD_ELEMENT.get(), 20, 1, false, false));
				if (entity.getPersistentData().getBoolean("displayArmor") == true) {
					if ((((entity.getFirstPassenger()) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) == true) {
						{
							Entity _entity = (entity.getFirstPassenger());
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(3, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(3, entity)));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.HEAD, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(3, entity)));
							}
						}
					}
					if ((((entity.getFirstPassenger()) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) == true) {
						{
							Entity _entity = (entity.getFirstPassenger());
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(2, entity)));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(2, entity)));
							}
						}
					}
					if ((((entity.getFirstPassenger()) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) == true) {
						{
							Entity _entity = (entity.getFirstPassenger());
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(1, entity)));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(1, entity)));
							}
						}
					}
					if ((((entity.getFirstPassenger()) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) == true) {
						{
							Entity _entity = (entity.getFirstPassenger());
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(0, entity)));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, (new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(0, entity)));
							}
						}
					}
					entity.getPersistentData().putBoolean("displayArmor", false);
				}
			}
		} else {
		}
	}
}
