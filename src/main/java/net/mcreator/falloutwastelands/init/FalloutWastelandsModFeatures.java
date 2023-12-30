
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.falloutwastelands.world.features.plants.WastelandshortburntgrassFeature;
import net.mcreator.falloutwastelands.world.features.plants.WastelandgrassbushFeature;
import net.mcreator.falloutwastelands.world.features.plants.WastelandburntgrassFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandrockydirtFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandgravelFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandDirtFeature;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

@Mod.EventBusSubscriber
public class FalloutWastelandsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FalloutWastelandsMod.MODID);
	public static final RegistryObject<Feature<?>> WASTELAND_DIRT = REGISTRY.register("wasteland_dirt", WastelandDirtFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDGRASSBUSH = REGISTRY.register("wastelandgrassbush", WastelandgrassbushFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDBURNTGRASS = REGISTRY.register("wastelandburntgrass", WastelandburntgrassFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDSHORTBURNTGRASS = REGISTRY.register("wastelandshortburntgrass", WastelandshortburntgrassFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDROCKYDIRT = REGISTRY.register("wastelandrockydirt", WastelandrockydirtFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDGRAVEL = REGISTRY.register("wastelandgravel", WastelandgravelFeature::new);
}
