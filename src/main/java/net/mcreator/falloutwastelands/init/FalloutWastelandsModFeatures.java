
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
import net.mcreator.falloutwastelands.world.features.plants.WastelandpebbleFeature;
import net.mcreator.falloutwastelands.world.features.plants.WastelandgrassbushFeature;
import net.mcreator.falloutwastelands.world.features.plants.WastelandburntgrassFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandlapisoreFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandironoreFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandhardstoneFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandgravelFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandemeraldoreFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelanddiamondoreFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandcopperoreFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandcoaloreFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandStoneFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandGoldoreFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandDirtFeature;
import net.mcreator.falloutwastelands.world.features.ores.WastelandCobblestoneFeature;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

@Mod.EventBusSubscriber
public class FalloutWastelandsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FalloutWastelandsMod.MODID);
	public static final RegistryObject<Feature<?>> WASTELAND_STONE = REGISTRY.register("wasteland_stone", WastelandStoneFeature::new);
	public static final RegistryObject<Feature<?>> WASTELAND_DIRT = REGISTRY.register("wasteland_dirt", WastelandDirtFeature::new);
	public static final RegistryObject<Feature<?>> WASTELAND_COBBLESTONE = REGISTRY.register("wasteland_cobblestone", WastelandCobblestoneFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDGRASSBUSH = REGISTRY.register("wastelandgrassbush", WastelandgrassbushFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDBURNTGRASS = REGISTRY.register("wastelandburntgrass", WastelandburntgrassFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDSHORTBURNTGRASS = REGISTRY.register("wastelandshortburntgrass", WastelandshortburntgrassFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDGRAVEL = REGISTRY.register("wastelandgravel", WastelandgravelFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDPEBBLE = REGISTRY.register("wastelandpebble", WastelandpebbleFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDCOALORE = REGISTRY.register("wastelandcoalore", WastelandcoaloreFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDIRONORE = REGISTRY.register("wastelandironore", WastelandironoreFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDCOPPERORE = REGISTRY.register("wastelandcopperore", WastelandcopperoreFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDLAPISORE = REGISTRY.register("wastelandlapisore", WastelandlapisoreFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDDIAMONDORE = REGISTRY.register("wastelanddiamondore", WastelanddiamondoreFeature::new);
	public static final RegistryObject<Feature<?>> WASTELAND_GOLDORE = REGISTRY.register("wasteland_goldore", WastelandGoldoreFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDEMERALDORE = REGISTRY.register("wastelandemeraldore", WastelandemeraldoreFeature::new);
	public static final RegistryObject<Feature<?>> WASTELANDHARDSTONE = REGISTRY.register("wastelandhardstone", WastelandhardstoneFeature::new);
}
