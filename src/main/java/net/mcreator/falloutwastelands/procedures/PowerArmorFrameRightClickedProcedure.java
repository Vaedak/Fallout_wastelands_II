package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PowerArmorFrameRightClickedProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
Entity sourceentity
) {
if(
entity == null ||
sourceentity == null
) return ;
if (sourceentity.isShiftKeyDown()==true) {if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
}else{if (==false) {if(sourceentity instanceof Player _player) _player.closeContainer();if (sourceentity instanceof Player _player) {
ItemStack _setstack = (sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD):ItemStack.EMPTY);
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}if (sourceentity instanceof Player _player) {
ItemStack _setstack = (sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST):ItemStack.EMPTY);
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}if (sourceentity instanceof Player _player) {
ItemStack _setstack = (sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS):ItemStack.EMPTY);
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}if (sourceentity instanceof Player _player) {
ItemStack _setstack = (sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET):ItemStack.EMPTY);
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}{
Entity _entity = sourceentity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(3, (new Object(){
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
_living.setItemSlot(EquipmentSlot.HEAD, (new Object(){
public ItemStack getItemStack(int sltid, Entity entity) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
_retval.set(capability.getStackInSlot(sltid).copy());
});
return _retval.get();
}
}.getItemStack(3, entity)));
}
}{
Entity _entity = sourceentity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(2, (new Object(){
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
_living.setItemSlot(EquipmentSlot.CHEST, (new Object(){
public ItemStack getItemStack(int sltid, Entity entity) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
_retval.set(capability.getStackInSlot(sltid).copy());
});
return _retval.get();
}
}.getItemStack(2, entity)));
}
}{
Entity _entity = sourceentity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(1, (new Object(){
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
_living.setItemSlot(EquipmentSlot.LEGS, (new Object(){
public ItemStack getItemStack(int sltid, Entity entity) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
_retval.set(capability.getStackInSlot(sltid).copy());
});
return _retval.get();
}
}.getItemStack(1, entity)));
}
}{
Entity _entity = sourceentity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(0, (new Object(){
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
_living.setItemSlot(EquipmentSlot.FEET, (new Object(){
public ItemStack getItemStack(int sltid, Entity entity) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
_retval.set(capability.getStackInSlot(sltid).copy());
});
return _retval.get();
}
}.getItemStack(0, entity)));
}
}if(!entity.level().isClientSide()) entity.discard();}else{if(sourceentity instanceof Player _player) _player.closeContainer();if (sourceentity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("\u00A7lCurrently In Power Armor\u00A7l"), true);}}
}
}
