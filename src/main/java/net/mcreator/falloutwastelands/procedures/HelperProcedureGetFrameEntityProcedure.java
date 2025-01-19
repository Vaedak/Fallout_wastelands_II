package net.mcreator.falloutwastelands.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HelperProcedureGetFrameEntityProcedure {
public static Entity execute(
LevelAccessor world
) {
Entity entityIterated = null;
{
final Vec3 _center = new Vec3(, , );
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
for (Entity entityiterator : _entfound) {
if (entityiterator instanceof ArmorStand) {entityIterated = entityiterator;}
}
}return
entityIterated;
}
}
