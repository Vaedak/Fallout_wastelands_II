package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerInPowerArmorProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

private static void execute(
@Nullable Event event,
Entity entity
) {
if(
entity == null
) return ;
if (==true) {if(entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.JUMP,20,255, false, false));if (entity.getPersistentData().getBoolean("inventoryOpen")==true) {if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD):ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_HELMET.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 2, _player.inventoryMenu.getCraftSlots());
}{
Entity _entity = entity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(3, new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_HELMET.get()));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_HELMET.get()));
}
}}else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD):ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame")))==false) {if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_HELMET.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST):ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_CHESTPLATE.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 2, _player.inventoryMenu.getCraftSlots());
}{
Entity _entity = entity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(2, new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_CHESTPLATE.get()));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_CHESTPLATE.get()));
}
}}else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST):ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame")))==false) {if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_CHESTPLATE.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS):ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_LEGGINGS.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 2, _player.inventoryMenu.getCraftSlots());
}{
Entity _entity = entity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(1, new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_LEGGINGS.get()));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_LEGGINGS.get()));
}
}}else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS):ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame")))==false) {if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_LEGGINGS.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET):ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_BOOTS.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 2, _player.inventoryMenu.getCraftSlots());
}{
Entity _entity = entity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(0, new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_BOOTS.get()));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_BOOTS.get()));
}
}}else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET):ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame")))==false) {if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_BOOTS.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}}}
}
}
