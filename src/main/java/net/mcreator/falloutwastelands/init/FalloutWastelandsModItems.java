
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.falloutwastelands.item.WastelandsItem;
import net.mcreator.falloutwastelands.item.RaiderdusterItem;
import net.mcreator.falloutwastelands.item.ClothItem;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FalloutWastelandsMod.MODID);
	public static final RegistryObject<Item> WASTELAND_STONE = block(FalloutWastelandsModBlocks.WASTELAND_STONE);
	public static final RegistryObject<Item> WASTELAND_DIRT = block(FalloutWastelandsModBlocks.WASTELAND_DIRT);
	public static final RegistryObject<Item> WASTELANDS = REGISTRY.register("wastelands", () -> new WastelandsItem());
	public static final RegistryObject<Item> WASTELANDGRASSBLOCK = block(FalloutWastelandsModBlocks.WASTELANDGRASSBLOCK);
	public static final RegistryObject<Item> WASTELAND_CONCRETE = block(FalloutWastelandsModBlocks.WASTELAND_CONCRETE);
	public static final RegistryObject<Item> CRACKED_WASTELAND_CONCRETE = block(FalloutWastelandsModBlocks.CRACKED_WASTELAND_CONCRETE);
	public static final RegistryObject<Item> WASTELAND_CONCRETE_STAIRS = block(FalloutWastelandsModBlocks.WASTELAND_CONCRETE_STAIRS);
	public static final RegistryObject<Item> WASTELAND_CONCRETE_SLAB = block(FalloutWastelandsModBlocks.WASTELAND_CONCRETE_SLAB);
	public static final RegistryObject<Item> WASTELAND_CONCRETE_WALL = block(FalloutWastelandsModBlocks.WASTELAND_CONCRETE_WALL);
	public static final RegistryObject<Item> CRACKED_WASTELAND_CONCRETE_STAIRS = block(FalloutWastelandsModBlocks.CRACKED_WASTELAND_CONCRETE_STAIRS);
	public static final RegistryObject<Item> CRACKED_WASTELAND_CONCRETE_SLABS = block(FalloutWastelandsModBlocks.CRACKED_WASTELAND_CONCRETE_SLABS);
	public static final RegistryObject<Item> CRACKED_WASTELAND_CONCRETE_WALL = block(FalloutWastelandsModBlocks.CRACKED_WASTELAND_CONCRETE_WALL);
	public static final RegistryObject<Item> WASTELAND_COBBLESTONE = block(FalloutWastelandsModBlocks.WASTELAND_COBBLESTONE);
	public static final RegistryObject<Item> STAIR_WASTELAND_COBBLESTONE = block(FalloutWastelandsModBlocks.STAIR_WASTELAND_COBBLESTONE);
	public static final RegistryObject<Item> SLAB_WASTELAND_COBBLESTONE = block(FalloutWastelandsModBlocks.SLAB_WASTELAND_COBBLESTONE);
	public static final RegistryObject<Item> WALL_WASTELAND_COBBLESTONE = block(FalloutWastelandsModBlocks.WALL_WASTELAND_COBBLESTONE);
	public static final RegistryObject<Item> THE_GLOW_DIRT = block(FalloutWastelandsModBlocks.THE_GLOW_DIRT);
	public static final RegistryObject<Item> UTSOL = block(FalloutWastelandsModBlocks.UTSOL);
	public static final RegistryObject<Item> WASTELAND_BRICK = block(FalloutWastelandsModBlocks.WASTELAND_BRICK);
	public static final RegistryObject<Item> MOLDER_WOOD_WOOD = block(FalloutWastelandsModBlocks.MOLDER_WOOD_WOOD);
	public static final RegistryObject<Item> MOLDER_WOOD_LOG = block(FalloutWastelandsModBlocks.MOLDER_WOOD_LOG);
	public static final RegistryObject<Item> MOLDER_WOOD_PLANKS = block(FalloutWastelandsModBlocks.MOLDER_WOOD_PLANKS);
	public static final RegistryObject<Item> MOLDER_WOOD_STAIRS = block(FalloutWastelandsModBlocks.MOLDER_WOOD_STAIRS);
	public static final RegistryObject<Item> MOLDER_WOOD_SLAB = block(FalloutWastelandsModBlocks.MOLDER_WOOD_SLAB);
	public static final RegistryObject<Item> MOLDER_WOOD_FENCE = block(FalloutWastelandsModBlocks.MOLDER_WOOD_FENCE);
	public static final RegistryObject<Item> MOLDER_WOOD_FENCE_GATE = block(FalloutWastelandsModBlocks.MOLDER_WOOD_FENCE_GATE);
	public static final RegistryObject<Item> MOLDER_WOOD_PRESSURE_PLATE = block(FalloutWastelandsModBlocks.MOLDER_WOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> MOLDER_WOOD_BUTTON = block(FalloutWastelandsModBlocks.MOLDER_WOOD_BUTTON);
	public static final RegistryObject<Item> MOLDER_WOOD_DOOR = doubleBlock(FalloutWastelandsModBlocks.MOLDER_WOOD_DOOR);
	public static final RegistryObject<Item> MOLDER_WOOD_TRAPDOOR = block(FalloutWastelandsModBlocks.MOLDER_WOOD_TRAPDOOR);
	public static final RegistryObject<Item> WASTELANDGRASSBUSH = block(FalloutWastelandsModBlocks.WASTELANDGRASSBUSH);
	public static final RegistryObject<Item> WASTELANDBURNTGRASS = block(FalloutWastelandsModBlocks.WASTELANDBURNTGRASS);
	public static final RegistryObject<Item> WASTELANDSHORTBURNTGRASS = block(FalloutWastelandsModBlocks.WASTELANDSHORTBURNTGRASS);
	public static final RegistryObject<Item> WASTELAND_BRICK_STAIRS = block(FalloutWastelandsModBlocks.WASTELAND_BRICK_STAIRS);
	public static final RegistryObject<Item> WASTELANDGRAVEL = block(FalloutWastelandsModBlocks.WASTELANDGRAVEL);
	public static final RegistryObject<Item> CLOTH = REGISTRY.register("cloth", () -> new ClothItem());
	public static final RegistryObject<Item> WASTELAND_BRICKSLAB = block(FalloutWastelandsModBlocks.WASTELAND_BRICKSLAB);
	public static final RegistryObject<Item> WASTELANDPEBBLE = block(FalloutWastelandsModBlocks.WASTELANDPEBBLE);
	public static final RegistryObject<Item> WASTELANDCOALORE = block(FalloutWastelandsModBlocks.WASTELANDCOALORE);
	public static final RegistryObject<Item> WASTELANDIRONORE = block(FalloutWastelandsModBlocks.WASTELANDIRONORE);
	public static final RegistryObject<Item> WASTELANDCOPPERORE = block(FalloutWastelandsModBlocks.WASTELANDCOPPERORE);
	public static final RegistryObject<Item> WASTELANDREDSTONEORE = block(FalloutWastelandsModBlocks.WASTELANDREDSTONEORE);
	public static final RegistryObject<Item> WASTELANDLAPISORE = block(FalloutWastelandsModBlocks.WASTELANDLAPISORE);
	public static final RegistryObject<Item> WASTELANDDIAMONDORE = block(FalloutWastelandsModBlocks.WASTELANDDIAMONDORE);
	public static final RegistryObject<Item> WASTELAND_GOLDORE = block(FalloutWastelandsModBlocks.WASTELAND_GOLDORE);
	public static final RegistryObject<Item> WASTELANDEMERALDORE = block(FalloutWastelandsModBlocks.WASTELANDEMERALDORE);
	public static final RegistryObject<Item> RAIDERDUSTER_HELMET = REGISTRY.register("raiderduster_helmet", () -> new RaiderdusterItem.Helmet());
	public static final RegistryObject<Item> RAIDERDUSTER_CHESTPLATE = REGISTRY.register("raiderduster_chestplate", () -> new RaiderdusterItem.Chestplate());
	public static final RegistryObject<Item> RAIDERDUSTER_LEGGINGS = REGISTRY.register("raiderduster_leggings", () -> new RaiderdusterItem.Leggings());
	public static final RegistryObject<Item> RAIDERDUSTER_BOOTS = REGISTRY.register("raiderduster_boots", () -> new RaiderdusterItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
