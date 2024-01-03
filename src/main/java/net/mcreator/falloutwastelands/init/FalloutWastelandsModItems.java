
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
import net.mcreator.falloutwastelands.item.WastelandbrickitemItem;
import net.mcreator.falloutwastelands.item.TestWeaponItem;
import net.mcreator.falloutwastelands.item.TatoItem;
import net.mcreator.falloutwastelands.item.Revolver32Item;
import net.mcreator.falloutwastelands.item.RaiderdusterItem;
import net.mcreator.falloutwastelands.item.RaiderblastmasterItem;
import net.mcreator.falloutwastelands.item.RaiderbasherItem;
import net.mcreator.falloutwastelands.item.JerricanItem;
import net.mcreator.falloutwastelands.item.CopperwiresItem;
import net.mcreator.falloutwastelands.item.CombatarmorItem;
import net.mcreator.falloutwastelands.item.ClothItem;
import net.mcreator.falloutwastelands.item.CapsItem;
import net.mcreator.falloutwastelands.item.BaseGunItemItem;
import net.mcreator.falloutwastelands.item.AsbestosItem;
import net.mcreator.falloutwastelands.item.AntiradclothingItem;
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
	public static final RegistryObject<Item> WASTELAND_BRICKSLAB = block(FalloutWastelandsModBlocks.WASTELAND_BRICKSLAB);
	public static final RegistryObject<Item> WASTELANDPEBBLE = block(FalloutWastelandsModBlocks.WASTELANDPEBBLE);
	public static final RegistryObject<Item> CLOTH = REGISTRY.register("cloth", () -> new ClothItem());
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
	public static final RegistryObject<Item> TATO = REGISTRY.register("tato", () -> new TatoItem());
	public static final RegistryObject<Item> RAIDERBASHER_HELMET = REGISTRY.register("raiderbasher_helmet", () -> new RaiderbasherItem.Helmet());
	public static final RegistryObject<Item> RAIDERBASHER_CHESTPLATE = REGISTRY.register("raiderbasher_chestplate", () -> new RaiderbasherItem.Chestplate());
	public static final RegistryObject<Item> RAIDERBASHER_LEGGINGS = REGISTRY.register("raiderbasher_leggings", () -> new RaiderbasherItem.Leggings());
	public static final RegistryObject<Item> RAIDERBASHER_BOOTS = REGISTRY.register("raiderbasher_boots", () -> new RaiderbasherItem.Boots());
	public static final RegistryObject<Item> WASTELAND_BRICK_WALL = block(FalloutWastelandsModBlocks.WASTELAND_BRICK_WALL);
	public static final RegistryObject<Item> RAIDERBLASTMASTER_HELMET = REGISTRY.register("raiderblastmaster_helmet", () -> new RaiderblastmasterItem.Helmet());
	public static final RegistryObject<Item> RAIDERBLASTMASTER_CHESTPLATE = REGISTRY.register("raiderblastmaster_chestplate", () -> new RaiderblastmasterItem.Chestplate());
	public static final RegistryObject<Item> RAIDERBLASTMASTER_LEGGINGS = REGISTRY.register("raiderblastmaster_leggings", () -> new RaiderblastmasterItem.Leggings());
	public static final RegistryObject<Item> RAIDERBLASTMASTER_BOOTS = REGISTRY.register("raiderblastmaster_boots", () -> new RaiderblastmasterItem.Boots());
	public static final RegistryObject<Item> WASTELAND_BROKEN_GLASS = block(FalloutWastelandsModBlocks.WASTELAND_BROKEN_GLASS);
	public static final RegistryObject<Item> LOCKER = block(FalloutWastelandsModBlocks.LOCKER);
	public static final RegistryObject<Item> LANDMINE = block(FalloutWastelandsModBlocks.LANDMINE);
	public static final RegistryObject<Item> WORN_METAL = block(FalloutWastelandsModBlocks.WORN_METAL);
	public static final RegistryObject<Item> HANGARDOOR = doubleBlock(FalloutWastelandsModBlocks.HANGARDOOR);
	public static final RegistryObject<Item> COMBATARMOR_HELMET = REGISTRY.register("combatarmor_helmet", () -> new CombatarmorItem.Helmet());
	public static final RegistryObject<Item> COMBATARMOR_CHESTPLATE = REGISTRY.register("combatarmor_chestplate", () -> new CombatarmorItem.Chestplate());
	public static final RegistryObject<Item> COMBATARMOR_LEGGINGS = REGISTRY.register("combatarmor_leggings", () -> new CombatarmorItem.Leggings());
	public static final RegistryObject<Item> COMBATARMOR_BOOTS = REGISTRY.register("combatarmor_boots", () -> new CombatarmorItem.Boots());
	public static final RegistryObject<Item> WASTELAND_CRACKED_BRICK = block(FalloutWastelandsModBlocks.WASTELAND_CRACKED_BRICK);
	public static final RegistryObject<Item> WIREFENCE = block(FalloutWastelandsModBlocks.WIREFENCE);
	public static final RegistryObject<Item> ASBESTOS = REGISTRY.register("asbestos", () -> new AsbestosItem());
	public static final RegistryObject<Item> ANTIRADCLOTHING = REGISTRY.register("antiradclothing", () -> new AntiradclothingItem());
	public static final RegistryObject<Item> JERRICAN = REGISTRY.register("jerrican", () -> new JerricanItem());
	public static final RegistryObject<Item> CAPS = REGISTRY.register("caps", () -> new CapsItem());
	public static final RegistryObject<Item> COPPERWIRES = REGISTRY.register("copperwires", () -> new CopperwiresItem());
	public static final RegistryObject<Item> REVOLVER_32 = REGISTRY.register("revolver_32", () -> new Revolver32Item());
	public static final RegistryObject<Item> TEST_WEAPON = REGISTRY.register("test_weapon", () -> new TestWeaponItem());
	public static final RegistryObject<Item> STRIPPEDMOLDERWOODLOG = block(FalloutWastelandsModBlocks.STRIPPEDMOLDERWOODLOG);
	public static final RegistryObject<Item> WASTELANDBRICKS = block(FalloutWastelandsModBlocks.WASTELANDBRICKS);
	public static final RegistryObject<Item> BASE_GUN_ITEM = REGISTRY.register("base_gun_item", () -> new BaseGunItemItem());
	public static final RegistryObject<Item> WASTELANDBRICKITEM = REGISTRY.register("wastelandbrickitem", () -> new WastelandbrickitemItem());
	public static final RegistryObject<Item> SUBWAYBRICKS = block(FalloutWastelandsModBlocks.SUBWAYBRICKS);
	public static final RegistryObject<Item> CAGE = block(FalloutWastelandsModBlocks.CAGE);
	public static final RegistryObject<Item> DOUBLE_SCAFFOLD_BLOCK = block(FalloutWastelandsModBlocks.DOUBLE_SCAFFOLD_BLOCK);
	public static final RegistryObject<Item> SCAFFOLDING_WALKWAYS_BLOCK = block(FalloutWastelandsModBlocks.SCAFFOLDING_WALKWAYS_BLOCK);
	public static final RegistryObject<Item> STEEL_POLE = block(FalloutWastelandsModBlocks.STEEL_POLE);
	public static final RegistryObject<Item> ROOF_METAL = block(FalloutWastelandsModBlocks.ROOF_METAL);
	public static final RegistryObject<Item> BARRICADEPLANKS = block(FalloutWastelandsModBlocks.BARRICADEPLANKS);
	public static final RegistryObject<Item> REINFORCED_PLANKS = block(FalloutWastelandsModBlocks.REINFORCED_PLANKS);
	public static final RegistryObject<Item> SHEETMETALBLOCK = block(FalloutWastelandsModBlocks.SHEETMETALBLOCK);
	public static final RegistryObject<Item> RUSTY_SHEETMETALBLOCK = block(FalloutWastelandsModBlocks.RUSTY_SHEETMETALBLOCK);
	public static final RegistryObject<Item> BARRICADESHEETMETALBLOCK = block(FalloutWastelandsModBlocks.BARRICADESHEETMETALBLOCK);
	public static final RegistryObject<Item> BURNISHED_GLASS = block(FalloutWastelandsModBlocks.BURNISHED_GLASS);
	public static final RegistryObject<Item> BLASTED_GLASS = block(FalloutWastelandsModBlocks.BLASTED_GLASS);
	public static final RegistryObject<Item> BLASTED_GLASS_PANE = block(FalloutWastelandsModBlocks.BLASTED_GLASS_PANE);
	public static final RegistryObject<Item> BURNISHED_GLASS_PANE = block(FalloutWastelandsModBlocks.BURNISHED_GLASS_PANE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
