
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.falloutwastelands.world.features.ores.WastelandDirtFeature;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

@Mod.EventBusSubscriber
public class FalloutWastelandsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FalloutWastelandsMod.MODID);
	public static final RegistryObject<Feature<?>> WASTELAND_DIRT = REGISTRY.register("wasteland_dirt", WastelandDirtFeature::new);
}
