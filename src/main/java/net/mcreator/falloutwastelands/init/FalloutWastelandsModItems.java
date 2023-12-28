
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.falloutwastelands.item.WastelandsItem;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FalloutWastelandsMod.MODID);
	public static final RegistryObject<Item> WASTELAND_STONE = block(FalloutWastelandsModBlocks.WASTELAND_STONE);
	public static final RegistryObject<Item> WASTELAND_DIRT = block(FalloutWastelandsModBlocks.WASTELAND_DIRT);
	public static final RegistryObject<Item> WASTELANDS = REGISTRY.register("wastelands", () -> new WastelandsItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
