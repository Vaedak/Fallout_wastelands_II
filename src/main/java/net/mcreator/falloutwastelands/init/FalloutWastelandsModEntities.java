
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.falloutwastelands.entity.RipperProjectileEntity;
import net.mcreator.falloutwastelands.entity.Cannibal00Entity;
import net.mcreator.falloutwastelands.entity.BaseGunItemEntity;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FalloutWastelandsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FalloutWastelandsMod.MODID);
	public static final RegistryObject<EntityType<BaseGunItemEntity>> BASE_GUN_ITEM = register("projectile_base_gun_item",
			EntityType.Builder.<BaseGunItemEntity>of(BaseGunItemEntity::new, MobCategory.MISC).setCustomClientFactory(BaseGunItemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Cannibal00Entity>> CANNIBAL_00 = register("cannibal_00",
			EntityType.Builder.<Cannibal00Entity>of(Cannibal00Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Cannibal00Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RipperProjectileEntity>> RIPPER_PROJECTILE = register("projectile_ripper_projectile", EntityType.Builder.<RipperProjectileEntity>of(RipperProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RipperProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Cannibal00Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CANNIBAL_00.get(), Cannibal00Entity.createAttributes().build());
	}
}
