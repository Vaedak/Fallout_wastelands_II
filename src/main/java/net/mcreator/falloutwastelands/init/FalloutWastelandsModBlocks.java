
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.falloutwastelands.block.WastelandsPortalBlock;
import net.mcreator.falloutwastelands.block.WastelandStoneBlock;
import net.mcreator.falloutwastelands.block.WastelandDirtBlock;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FalloutWastelandsMod.MODID);
	public static final RegistryObject<Block> WASTELAND_STONE = REGISTRY.register("wasteland_stone", () -> new WastelandStoneBlock());
	public static final RegistryObject<Block> WASTELAND_DIRT = REGISTRY.register("wasteland_dirt", () -> new WastelandDirtBlock());
	public static final RegistryObject<Block> WASTELANDS_PORTAL = REGISTRY.register("wastelands_portal", () -> new WastelandsPortalBlock());
}
