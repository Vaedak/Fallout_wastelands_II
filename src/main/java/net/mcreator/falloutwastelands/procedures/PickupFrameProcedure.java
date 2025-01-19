package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PickupFrameProcedure {
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
if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame"))))) {if (world instanceof ServerLevel _level) {
ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY));
entityToSpawn.setPickUpDelay(5);
entityToSpawn.setUnlimitedLifetime();
_level.addFreshEntity(entityToSpawn);
}}if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame"))))) {if (world instanceof ServerLevel _level) {
ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY));
entityToSpawn.setPickUpDelay(5);
entityToSpawn.setUnlimitedLifetime();
_level.addFreshEntity(entityToSpawn);
}}if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame"))))) {if (world instanceof ServerLevel _level) {
ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
entityToSpawn.setPickUpDelay(5);
entityToSpawn.setUnlimitedLifetime();
_level.addFreshEntity(entityToSpawn);
}}if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:pa_frame"))))) {if (world instanceof ServerLevel _level) {
ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
entityToSpawn.setPickUpDelay(5);
entityToSpawn.setUnlimitedLifetime();
_level.addFreshEntity(entityToSpawn);
}}{
final Vec3 _center = new Vec3(, , );
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
for (Entity entityiterator : _entfound) {
if (entityiterator instanceof PowerArmorFrameEntity) {if (==entityiterator.getX()&&==entityiterator.getY()&&==entityiterator.getZ()) {if(!entityiterator.level().isClientSide()) entityiterator.discard();}}
}
}
}
}
