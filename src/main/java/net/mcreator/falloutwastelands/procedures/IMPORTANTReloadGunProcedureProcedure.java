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
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("fallout_wastelands_:gun")))) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.REVOLVER_32.get()) {
					RevolverReloadProcedure.execute(world, x, y, z, entity);
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.NINEMMPISTOL.get()) {
					NineMMReloadProcedure.execute(world, x, y, z, entity);
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.TENMMPISTOL.get()) {
					Reload10mmPistolProcedure.execute(world, x, y, z, entity);
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FalloutWastelandsModItems.TENMMHOMEMADEASSAULTRIFLE.get()) {
					Reload10mmHomemadeProcedure.execute(world, x, y, z, entity);
				}
			} else {
				entity.getPersistentData().putBoolean("ReloadGun", false);
				entity.getPersistentData().putDouble("timer", 0);
			}
		}
	}
}
