package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ExitPowerArmorKeyPressedProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if (==true) {if (world instanceof ServerLevel _level) {
Entity entityToSpawn = FalloutWastelandsModEntities.POWER_ARMOR_FRAME.get().spawn(_level, BlockPos.containing(x,y,z), MobSpawnType.MOB_SUMMONED);
if (entityToSpawn != null) {
entityToSpawn.setYRot(entity.getYRot());
entityToSpawn.setYBodyRot(entity.getYRot());
entityToSpawn.setYHeadRot(entity.getYRot());
entityToSpawn.setXRot(entity.getXRot());
entityToSpawn.setDeltaMovement(0, 0, 0);
}
}
if (!world.getEntitiesOfClass(PowerArmorFrameEntity.class,
AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true)
.isEmpty()) {for (int index0 = 0; index0<10; index0++) {{
Entity _ent = ((Entity) world.getEntitiesOfClass(PowerArmorFrameEntity.class,
AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null));
_ent.setYRot(entity.getYRot());
_ent.setXRot(entity.getXRot());
_ent.setYBodyRot(_ent.getYRot());
_ent.setYHeadRot(_ent.getYRot());
_ent.yRotO = _ent.getYRot();
_ent.xRotO = _ent.getXRot();
if (_ent instanceof LivingEntity _entity) {
_entity.yBodyRotO = _entity.getYRot();
_entity.yHeadRotO = _entity.getYRot();
}
}}if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("spawnedframe"), false);{
final int _slotid = 3;
final ItemStack _setstack = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD):ItemStack.EMPTY);
_setstack.setCount(1);
((Entity) world.getEntitiesOfClass(PowerArmorFrameEntity.class,
AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)).getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
if (capability instanceof IItemHandlerModifiable _modHandler)
_modHandler.setStackInSlot(_slotid, _setstack);
});
}{
final int _slotid = 2;
final ItemStack _setstack = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST):ItemStack.EMPTY);
_setstack.setCount(1);
((Entity) world.getEntitiesOfClass(PowerArmorFrameEntity.class,
AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)).getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
if (capability instanceof IItemHandlerModifiable _modHandler)
_modHandler.setStackInSlot(_slotid, _setstack);
});
}{
final int _slotid = 1;
final ItemStack _setstack = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS):ItemStack.EMPTY);
_setstack.setCount(1);
((Entity) world.getEntitiesOfClass(PowerArmorFrameEntity.class,
AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)).getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
if (capability instanceof IItemHandlerModifiable _modHandler)
_modHandler.setStackInSlot(_slotid, _setstack);
});
}{
final int _slotid = 0;
final ItemStack _setstack = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET):ItemStack.EMPTY);
_setstack.setCount(1);
((Entity) world.getEntitiesOfClass(PowerArmorFrameEntity.class,
AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)).getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
if (capability instanceof IItemHandlerModifiable _modHandler)
_modHandler.setStackInSlot(_slotid, _setstack);
});
}((Entity) world.getEntitiesOfClass(PowerArmorFrameEntity.class,
AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("displayArmor", true);{
Entity _entity = entity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
}
}{
Entity _entity = entity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(2, new ItemStack(Blocks.AIR));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Blocks.AIR));
}
}{
Entity _entity = entity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
}
}{
Entity _entity = entity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
}
}}}
}
}
