package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PowerArmorFrameGUIWhileThisGUIIsOpenTickProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
Entity paFrame = null;
if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_HELMET.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 5, _player.inventoryMenu.getCraftSlots());
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_HELMET.get());
_setstack.setCount(1);
((Slot) _slots.get(3)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}else{if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_HELMET.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_CHESTPLATE.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 5, _player.inventoryMenu.getCraftSlots());
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_CHESTPLATE.get());
_setstack.setCount(1);
((Slot) _slots.get(2)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}else{if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_CHESTPLATE.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_LEGGINGS.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 5, _player.inventoryMenu.getCraftSlots());
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_LEGGINGS.get());
_setstack.setCount(1);
((Slot) _slots.get(1)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}else{if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_LEGGINGS.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_BOOTS.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 5, _player.inventoryMenu.getCraftSlots());
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_BOOTS.get());
_setstack.setCount(1);
((Slot) _slots.get(0)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}else{if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(FalloutWastelandsModItems.DELETED_MOD_ELEMENT_BOOTS.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}if (!world.getEntitiesOfClass(PowerArmorFrameEntity.class,
AABB.ofSize(new Vec3(, , ), 2, 2, 2), e -> true)
.isEmpty()) {paFrame = (Entity) world.getEntitiesOfClass(PowerArmorFrameEntity.class,
AABB.ofSize(new Vec3(, , ), 2, 2, 2), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(, , )).findFirst().orElse(null);if (paFrame.isVehicle()) {{
Entity _entity = (paFrame.getFirstPassenger())
;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(3, (new Object(){
public ItemStack getItemStack(int sltid, Entity entity) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
_retval.set(capability.getStackInSlot(sltid).copy());
});
return _retval.get();
}
}.getItemStack(3, paFrame)));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.HEAD, (new Object(){
public ItemStack getItemStack(int sltid, Entity entity) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
_retval.set(capability.getStackInSlot(sltid).copy());
});
return _retval.get();
}
}.getItemStack(3, paFrame)));
}
}{
Entity _entity = (paFrame.getFirstPassenger())
;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(2, (new Object(){
public ItemStack getItemStack(int sltid, Entity entity) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
_retval.set(capability.getStackInSlot(sltid).copy());
});
return _retval.get();
}
}.getItemStack(2, paFrame)));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.CHEST, (new Object(){
public ItemStack getItemStack(int sltid, Entity entity) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
_retval.set(capability.getStackInSlot(sltid).copy());
});
return _retval.get();
}
}.getItemStack(2, paFrame)));
}
}{
Entity _entity = (paFrame.getFirstPassenger())
;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(1, (new Object(){
public ItemStack getItemStack(int sltid, Entity entity) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
_retval.set(capability.getStackInSlot(sltid).copy());
});
return _retval.get();
}
}.getItemStack(1, paFrame)));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.LEGS, (new Object(){
public ItemStack getItemStack(int sltid, Entity entity) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
_retval.set(capability.getStackInSlot(sltid).copy());
});
return _retval.get();
}
}.getItemStack(1, paFrame)));
}
}{
Entity _entity = (paFrame.getFirstPassenger())
;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(0, (new Object(){
public ItemStack getItemStack(int sltid, Entity entity) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
_retval.set(capability.getStackInSlot(sltid).copy());
});
return _retval.get();
}
}.getItemStack(0, paFrame)));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.FEET, (new Object(){
public ItemStack getItemStack(int sltid, Entity entity) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
_retval.set(capability.getStackInSlot(sltid).copy());
});
return _retval.get();
}
}.getItemStack(0, paFrame)));
}
}}}
}
}
