
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.falloutwastelands.item.WrenchItem;
import net.mcreator.falloutwastelands.item.WastelandsItem;
import net.mcreator.falloutwastelands.item.WastelandbrickitemItem;
import net.mcreator.falloutwastelands.item.UraniumNuggetItem;
import net.mcreator.falloutwastelands.item.UraniumIngotItem;
import net.mcreator.falloutwastelands.item.TireIronItem;
import net.mcreator.falloutwastelands.item.TinnuggetItem;
import net.mcreator.falloutwastelands.item.TiningotItem;
import net.mcreator.falloutwastelands.item.ThirtytwoammoItem;
import net.mcreator.falloutwastelands.item.TestWeaponItem;
import net.mcreator.falloutwastelands.item.TenmmpistolItem;
import net.mcreator.falloutwastelands.item.TenmmhomemadeassaultrifleItem;
import net.mcreator.falloutwastelands.item.TenmmammoItem;
import net.mcreator.falloutwastelands.item.TatoItem;
import net.mcreator.falloutwastelands.item.TaloncombatarmorItem;
import net.mcreator.falloutwastelands.item.T45PAItem;
import net.mcreator.falloutwastelands.item.StimpackItem;
import net.mcreator.falloutwastelands.item.SteelnuggetItem;
import net.mcreator.falloutwastelands.item.SteelIngotItem;
import net.mcreator.falloutwastelands.item.ScrapmetalItem;
import net.mcreator.falloutwastelands.item.RollingpinItem;
import net.mcreator.falloutwastelands.item.RipperProjectileItem;
import net.mcreator.falloutwastelands.item.RipperItem;
import net.mcreator.falloutwastelands.item.Revolver32Item;
import net.mcreator.falloutwastelands.item.RawUraniumItem;
import net.mcreator.falloutwastelands.item.RawTinItem;
import net.mcreator.falloutwastelands.item.RawLeadItem;
import net.mcreator.falloutwastelands.item.RawAluminumItem;
import net.mcreator.falloutwastelands.item.RaiderdusterItem;
import net.mcreator.falloutwastelands.item.RaiderblastmasterItem;
import net.mcreator.falloutwastelands.item.RaiderbasherItem;
import net.mcreator.falloutwastelands.item.PsychoItem;
import net.mcreator.falloutwastelands.item.PowerArmorFrameArmorItem;
import net.mcreator.falloutwastelands.item.PlasmarifleItem;
import net.mcreator.falloutwastelands.item.PipboyItem;
import net.mcreator.falloutwastelands.item.NukaColaQuantumItem;
import net.mcreator.falloutwastelands.item.NukaColaItem;
import net.mcreator.falloutwastelands.item.NinemmpistolItem;
import net.mcreator.falloutwastelands.item.NinemmammoItem;
import net.mcreator.falloutwastelands.item.NeutronadeItem;
import net.mcreator.falloutwastelands.item.NeutronadeCapItem;
import net.mcreator.falloutwastelands.item.NailgunItem;
import net.mcreator.falloutwastelands.item.NailedWrenchItem;
import net.mcreator.falloutwastelands.item.NailItem;
import net.mcreator.falloutwastelands.item.LeadNuggetItem;
import net.mcreator.falloutwastelands.item.LeadIngotItem;
import net.mcreator.falloutwastelands.item.LaserrifleItem;
import net.mcreator.falloutwastelands.item.JerricanItem;
import net.mcreator.falloutwastelands.item.IndustrialshovelItem;
import net.mcreator.falloutwastelands.item.IndustrialhammerItem;
import net.mcreator.falloutwastelands.item.HachetItem;
import net.mcreator.falloutwastelands.item.FivemmminigunItem;
import net.mcreator.falloutwastelands.item.FivemmAmmoItem;
import net.mcreator.falloutwastelands.item.EnergyCellItem;
import net.mcreator.falloutwastelands.item.EmptyNukaColaBottleItem;
import net.mcreator.falloutwastelands.item.EmptyNeutronadeBottleItem;
import net.mcreator.falloutwastelands.item.CornItem;
import net.mcreator.falloutwastelands.item.CopperwiresItem;
import net.mcreator.falloutwastelands.item.CombatarmorItem;
import net.mcreator.falloutwastelands.item.ClothItem;
import net.mcreator.falloutwastelands.item.ChinesepistolItem;
import net.mcreator.falloutwastelands.item.BottleCapItem;
import net.mcreator.falloutwastelands.item.BaseGunItemItem;
import net.mcreator.falloutwastelands.item.BASENameItemItem;
import net.mcreator.falloutwastelands.item.BASECapBundleItem;
import net.mcreator.falloutwastelands.item.AsbestosItem;
import net.mcreator.falloutwastelands.item.AntiradsuitItem;
import net.mcreator.falloutwastelands.item.AntiradclothingItem;
import net.mcreator.falloutwastelands.item.AluminumIngotItem;
import net.mcreator.falloutwastelands.item.AluminiumnuggetItem;
import net.mcreator.falloutwastelands.block.display.BASEcoreDisplayItem;
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
	public static final RegistryObject<Item> WASTELAND_ROOTY_DIRT = block(FalloutWastelandsModBlocks.WASTELAND_ROOTY_DIRT);
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
	public static final RegistryObject<Item> TININGOT = REGISTRY.register("tiningot", () -> new TiningotItem());
	public static final RegistryObject<Item> ALUMINUM_INGOT = REGISTRY.register("aluminum_ingot", () -> new AluminumIngotItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new LeadIngotItem());
	public static final RegistryObject<Item> URANIUM_INGOT = REGISTRY.register("uranium_ingot", () -> new UraniumIngotItem());
	public static final RegistryObject<Item> NUKA_COLA = REGISTRY.register("nuka_cola", () -> new NukaColaItem());
	public static final RegistryObject<Item> EMPTY_NUKA_COLA_BOTTLE = REGISTRY.register("empty_nuka_cola_bottle", () -> new EmptyNukaColaBottleItem());
	public static final RegistryObject<Item> NUKA_COLA_QUANTUM = REGISTRY.register("nuka_cola_quantum", () -> new NukaColaQuantumItem());
	public static final RegistryObject<Item> BOTTLE_CAP = REGISTRY.register("bottle_cap", () -> new BottleCapItem());
	public static final RegistryObject<Item> NINEMMPISTOL = REGISTRY.register("ninemmpistol", () -> new NinemmpistolItem());
	public static final RegistryObject<Item> NEUTRONADE = REGISTRY.register("neutronade", () -> new NeutronadeItem());
	public static final RegistryObject<Item> NEUTRONADE_CAP = REGISTRY.register("neutronade_cap", () -> new NeutronadeCapItem());
	public static final RegistryObject<Item> EMPTY_NEUTRONADE_BOTTLE = REGISTRY.register("empty_neutronade_bottle", () -> new EmptyNeutronadeBottleItem());
	public static final RegistryObject<Item> CANNIBAL_00_SPAWN_EGG = REGISTRY.register("cannibal_00_spawn_egg", () -> new ForgeSpawnEggItem(FalloutWastelandsModEntities.CANNIBAL_00, -11382217, -9939410, new Item.Properties()));
	public static final RegistryObject<Item> WASTELANDTILES = block(FalloutWastelandsModBlocks.WASTELANDTILES);
	public static final RegistryObject<Item> BAS_ECORE = REGISTRY.register(FalloutWastelandsModBlocks.BAS_ECORE.getId().getPath(), () -> new BASEcoreDisplayItem(FalloutWastelandsModBlocks.BAS_ECORE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BASE_CAP_BUNDLE = REGISTRY.register("base_cap_bundle", () -> new BASECapBundleItem());
	public static final RegistryObject<Item> BASE_NAME_ITEM = REGISTRY.register("base_name_item", () -> new BASENameItemItem());
	public static final RegistryObject<Item> MILITARY_METAL_PLATE = block(FalloutWastelandsModBlocks.MILITARY_METAL_PLATE);
	public static final RegistryObject<Item> MILITARY_METAL_DOOR = doubleBlock(FalloutWastelandsModBlocks.MILITARY_METAL_DOOR);
	public static final RegistryObject<Item> SCRAPMETAL = REGISTRY.register("scrapmetal", () -> new ScrapmetalItem());
	public static final RegistryObject<Item> STIMPACK = REGISTRY.register("stimpack", () -> new StimpackItem());
	public static final RegistryObject<Item> PSYCHO = REGISTRY.register("psycho", () -> new PsychoItem());
	public static final RegistryObject<Item> ANTIRADSUIT_HELMET = REGISTRY.register("antiradsuit_helmet", () -> new AntiradsuitItem.Helmet());
	public static final RegistryObject<Item> ANTIRADSUIT_CHESTPLATE = REGISTRY.register("antiradsuit_chestplate", () -> new AntiradsuitItem.Chestplate());
	public static final RegistryObject<Item> ANTIRADSUIT_LEGGINGS = REGISTRY.register("antiradsuit_leggings", () -> new AntiradsuitItem.Leggings());
	public static final RegistryObject<Item> ANTIRADSUIT_BOOTS = REGISTRY.register("antiradsuit_boots", () -> new AntiradsuitItem.Boots());
	public static final RegistryObject<Item> TALONCOMBATARMOR_HELMET = REGISTRY.register("taloncombatarmor_helmet", () -> new TaloncombatarmorItem.Helmet());
	public static final RegistryObject<Item> TALONCOMBATARMOR_CHESTPLATE = REGISTRY.register("taloncombatarmor_chestplate", () -> new TaloncombatarmorItem.Chestplate());
	public static final RegistryObject<Item> TALONCOMBATARMOR_LEGGINGS = REGISTRY.register("taloncombatarmor_leggings", () -> new TaloncombatarmorItem.Leggings());
	public static final RegistryObject<Item> TALONCOMBATARMOR_BOOTS = REGISTRY.register("taloncombatarmor_boots", () -> new TaloncombatarmorItem.Boots());
	public static final RegistryObject<Item> PIPBOY = REGISTRY.register("pipboy", () -> new PipboyItem());
	public static final RegistryObject<Item> MILITARY_METALWINDOW = block(FalloutWastelandsModBlocks.MILITARY_METALWINDOW);
	public static final RegistryObject<Item> CENTRALUNIT = block(FalloutWastelandsModBlocks.CENTRALUNIT);
	public static final RegistryObject<Item> WASTELANDVENTCONCRETE = block(FalloutWastelandsModBlocks.WASTELANDVENTCONCRETE);
	public static final RegistryObject<Item> LINEDCONCRETE = block(FalloutWastelandsModBlocks.LINEDCONCRETE);
	public static final RegistryObject<Item> WOODEDCONCRETE = block(FalloutWastelandsModBlocks.WOODEDCONCRETE);
	public static final RegistryObject<Item> HORIZONTALLINEDCONCRETE = block(FalloutWastelandsModBlocks.HORIZONTALLINEDCONCRETE);
	public static final RegistryObject<Item> GREY_TILES = block(FalloutWastelandsModBlocks.GREY_TILES);
	public static final RegistryObject<Item> BLACK_TILES = block(FalloutWastelandsModBlocks.BLACK_TILES);
	public static final RegistryObject<Item> CONCRETE_TILE = block(FalloutWastelandsModBlocks.CONCRETE_TILE);
	public static final RegistryObject<Item> HARDCONCRETE = block(FalloutWastelandsModBlocks.HARDCONCRETE);
	public static final RegistryObject<Item> HARDCONCRETESTAIRS = block(FalloutWastelandsModBlocks.HARDCONCRETESTAIRS);
	public static final RegistryObject<Item> RUSTYSHEETMETALSTAIRS = block(FalloutWastelandsModBlocks.RUSTYSHEETMETALSTAIRS);
	public static final RegistryObject<Item> SHEETMETALSTAIRS = block(FalloutWastelandsModBlocks.SHEETMETALSTAIRS);
	public static final RegistryObject<Item> WASTELANDTILESSTAIRS = block(FalloutWastelandsModBlocks.WASTELANDTILESSTAIRS);
	public static final RegistryObject<Item> WASTELANDTILESSLAB = block(FalloutWastelandsModBlocks.WASTELANDTILESSLAB);
	public static final RegistryObject<Item> WASTELANDHARDSTONE = block(FalloutWastelandsModBlocks.WASTELANDHARDSTONE);
	public static final RegistryObject<Item> RUST_BLOCK = block(FalloutWastelandsModBlocks.RUST_BLOCK);
	public static final RegistryObject<Item> WASTELAND_ROAD_BLOCK = block(FalloutWastelandsModBlocks.WASTELAND_ROAD_BLOCK);
	public static final RegistryObject<Item> WASTELAND_ROAD_SLAB = block(FalloutWastelandsModBlocks.WASTELAND_ROAD_SLAB);
	public static final RegistryObject<Item> WORN_METAL_STAIRS = block(FalloutWastelandsModBlocks.WORN_METAL_STAIRS);
	public static final RegistryObject<Item> WORN_METAL_SLAB = block(FalloutWastelandsModBlocks.WORN_METAL_SLAB);
	public static final RegistryObject<Item> SCAFFOLDING_WALKWAYSLAB = block(FalloutWastelandsModBlocks.SCAFFOLDING_WALKWAYSLAB);
	public static final RegistryObject<Item> SCAFFOLDING_WALKWAY_STAIRS = block(FalloutWastelandsModBlocks.SCAFFOLDING_WALKWAY_STAIRS);
	public static final RegistryObject<Item> GORE = block(FalloutWastelandsModBlocks.GORE);
	public static final RegistryObject<Item> SUPERMUTANTGORE = block(FalloutWastelandsModBlocks.SUPERMUTANTGORE);
	public static final RegistryObject<Item> DOUBLE_SCAFFOLD_WALL = block(FalloutWastelandsModBlocks.DOUBLE_SCAFFOLD_WALL);
	public static final RegistryObject<Item> EXPOSED_RUST_BLOCK = block(FalloutWastelandsModBlocks.EXPOSED_RUST_BLOCK);
	public static final RegistryObject<Item> MELTED_STEEL_BLOCK = block(FalloutWastelandsModBlocks.MELTED_STEEL_BLOCK);
	public static final RegistryObject<Item> MELTED_IRON_BLOCK = block(FalloutWastelandsModBlocks.MELTED_IRON_BLOCK);
	public static final RegistryObject<Item> URANIUM_BLOCK = block(FalloutWastelandsModBlocks.URANIUM_BLOCK);
	public static final RegistryObject<Item> BARBED_WIRES = block(FalloutWastelandsModBlocks.BARBED_WIRES);
	public static final RegistryObject<Item> TENMMPISTOL = REGISTRY.register("tenmmpistol", () -> new TenmmpistolItem());
	public static final RegistryObject<Item> TENMMAMMO = REGISTRY.register("tenmmammo", () -> new TenmmammoItem());
	public static final RegistryObject<Item> NINEMMAMMO = REGISTRY.register("ninemmammo", () -> new NinemmammoItem());
	public static final RegistryObject<Item> TENMMHOMEMADEASSAULTRIFLE = REGISTRY.register("tenmmhomemadeassaultrifle", () -> new TenmmhomemadeassaultrifleItem());
	public static final RegistryObject<Item> FIVEMM_AMMO = REGISTRY.register("fivemm_ammo", () -> new FivemmAmmoItem());
	public static final RegistryObject<Item> FIVEMMMINIGUN = REGISTRY.register("fivemmminigun", () -> new FivemmminigunItem());
	public static final RegistryObject<Item> ENERGY_CELL = REGISTRY.register("energy_cell", () -> new EnergyCellItem());
	public static final RegistryObject<Item> PLASMARIFLE = REGISTRY.register("plasmarifle", () -> new PlasmarifleItem());
	public static final RegistryObject<Item> LASERRIFLE = REGISTRY.register("laserrifle", () -> new LaserrifleItem());
	public static final RegistryObject<Item> NAILGUN = REGISTRY.register("nailgun", () -> new NailgunItem());
	public static final RegistryObject<Item> NAIL = REGISTRY.register("nail", () -> new NailItem());
	public static final RegistryObject<Item> THIRTYTWOAMMO = REGISTRY.register("thirtytwoammo", () -> new ThirtytwoammoItem());
	public static final RegistryObject<Item> CHINESEPISTOL = REGISTRY.register("chinesepistol", () -> new ChinesepistolItem());
	public static final RegistryObject<Item> CORN = REGISTRY.register("corn", () -> new CornItem());
	public static final RegistryObject<Item> HACHET = REGISTRY.register("hachet", () -> new HachetItem());
	public static final RegistryObject<Item> INDUSTRIALHAMMER = REGISTRY.register("industrialhammer", () -> new IndustrialhammerItem());
	public static final RegistryObject<Item> INDUSTRIALSHOVEL = REGISTRY.register("industrialshovel", () -> new IndustrialshovelItem());
	public static final RegistryObject<Item> TIRE_IRON = REGISTRY.register("tire_iron", () -> new TireIronItem());
	public static final RegistryObject<Item> ROLLINGPIN = REGISTRY.register("rollingpin", () -> new RollingpinItem());
	public static final RegistryObject<Item> WRENCH = REGISTRY.register("wrench", () -> new WrenchItem());
	public static final RegistryObject<Item> NAILED_WRENCH = REGISTRY.register("nailed_wrench", () -> new NailedWrenchItem());
	public static final RegistryObject<Item> RIPPER_PROJECTILE = REGISTRY.register("ripper_projectile", () -> new RipperProjectileItem());
	public static final RegistryObject<Item> RIPPER = REGISTRY.register("ripper", () -> new RipperItem());
	public static final RegistryObject<Item> WASTELAND_ALUMINUM_ORE = block(FalloutWastelandsModBlocks.WASTELAND_ALUMINUM_ORE);
	public static final RegistryObject<Item> ALUMINUM_BLOCK = block(FalloutWastelandsModBlocks.ALUMINUM_BLOCK);
	public static final RegistryObject<Item> BOS_DOOR = doubleBlock(FalloutWastelandsModBlocks.BOS_DOOR);
	public static final RegistryObject<Item> BOS_METAL_PLATING = block(FalloutWastelandsModBlocks.BOS_METAL_PLATING);
	public static final RegistryObject<Item> BOS_METAL_PLATING_LIGHTED = block(FalloutWastelandsModBlocks.BOS_METAL_PLATING_LIGHTED);
	public static final RegistryObject<Item> BOS_STEEL_BLOCK = block(FalloutWastelandsModBlocks.BOS_STEEL_BLOCK);
	public static final RegistryObject<Item> STEEL_BLOCK = block(FalloutWastelandsModBlocks.STEEL_BLOCK);
	public static final RegistryObject<Item> ENCLAVE_DOOR = doubleBlock(FalloutWastelandsModBlocks.ENCLAVE_DOOR);
	public static final RegistryObject<Item> ENCLAVE_BUNKER_BLOCK = block(FalloutWastelandsModBlocks.ENCLAVE_BUNKER_BLOCK);
	public static final RegistryObject<Item> ENCLAVE_BUNKER_BLOCK_LOGO = block(FalloutWastelandsModBlocks.ENCLAVE_BUNKER_BLOCK_LOGO);
	public static final RegistryObject<Item> ENCLAVE_BUNKER_FLOOR = block(FalloutWastelandsModBlocks.ENCLAVE_BUNKER_FLOOR);
	public static final RegistryObject<Item> BUNKER_BLOCK_LIGHT = block(FalloutWastelandsModBlocks.BUNKER_BLOCK_LIGHT);
	public static final RegistryObject<Item> INDUSTRIAL_ALLOY = block(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOY);
	public static final RegistryObject<Item> INDUSTRIAL_ALLOY_PLAIN = block(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOY_PLAIN);
	public static final RegistryObject<Item> INDUSTRIAL_ALLOY_SLAB = block(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOY_SLAB);
	public static final RegistryObject<Item> INDUSTRIAL_ALLOY_STAIR = block(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOY_STAIR);
	public static final RegistryObject<Item> INDUSTRIAL_ALLOY_WARNING = block(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOY_WARNING);
	public static final RegistryObject<Item> INDUSTRIAL_DOOR = doubleBlock(FalloutWastelandsModBlocks.INDUSTRIAL_DOOR);
	public static final RegistryObject<Item> INDUSTRIAL_ALLOW_MID_RIVET = block(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOW_MID_RIVET);
	public static final RegistryObject<Item> INDUSTRIAL_ALLOY_BOTTOM_RIVET = block(FalloutWastelandsModBlocks.INDUSTRIAL_ALLOY_BOTTOM_RIVET);
	public static final RegistryObject<Item> INDUSTRIAL_WALKWAY = block(FalloutWastelandsModBlocks.INDUSTRIAL_WALKWAY);
	public static final RegistryObject<Item> LEAD_BLOCK = block(FalloutWastelandsModBlocks.LEAD_BLOCK);
	public static final RegistryObject<Item> LEAD_ORE = block(FalloutWastelandsModBlocks.LEAD_ORE);
	public static final RegistryObject<Item> RAW_LEAD = REGISTRY.register("raw_lead", () -> new RawLeadItem());
	public static final RegistryObject<Item> RAW_ALUMINUM = REGISTRY.register("raw_aluminum", () -> new RawAluminumItem());
	public static final RegistryObject<Item> MOLTEN_BOXITE = block(FalloutWastelandsModBlocks.MOLTEN_BOXITE);
	public static final RegistryObject<Item> MOLTEN_COPPER = block(FalloutWastelandsModBlocks.MOLTEN_COPPER);
	public static final RegistryObject<Item> MOLTEN_STEEL = block(FalloutWastelandsModBlocks.MOLTEN_STEEL);
	public static final RegistryObject<Item> MOLTEN_TIN = block(FalloutWastelandsModBlocks.MOLTEN_TIN);
	public static final RegistryObject<Item> TIN_BLOCK = block(FalloutWastelandsModBlocks.TIN_BLOCK);
	public static final RegistryObject<Item> URANIUM_ORE = block(FalloutWastelandsModBlocks.URANIUM_ORE);
	public static final RegistryObject<Item> RAW_URANIUM = REGISTRY.register("raw_uranium", () -> new RawUraniumItem());
	public static final RegistryObject<Item> WASTE_SAND = block(FalloutWastelandsModBlocks.WASTE_SAND);
	public static final RegistryObject<Item> TIN_ORE = block(FalloutWastelandsModBlocks.TIN_ORE);
	public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new RawTinItem());
	public static final RegistryObject<Item> JIGSAW_BLOCK = block(FalloutWastelandsModBlocks.JIGSAW_BLOCK);
	public static final RegistryObject<Item> BOS_STEEL_STAIR = block(FalloutWastelandsModBlocks.BOS_STEEL_STAIR);
	public static final RegistryObject<Item> STEEL_BARS = block(FalloutWastelandsModBlocks.STEEL_BARS);
	public static final RegistryObject<Item> PLASTER = block(FalloutWastelandsModBlocks.PLASTER);
	public static final RegistryObject<Item> OXIDIZED_METAL = block(FalloutWastelandsModBlocks.OXIDIZED_METAL);
	public static final RegistryObject<Item> OXIDIZED_METAL_STAIR = block(FalloutWastelandsModBlocks.OXIDIZED_METAL_STAIR);
	public static final RegistryObject<Item> OXIDIZED_METAL_WALL = block(FalloutWastelandsModBlocks.OXIDIZED_METAL_WALL);
	public static final RegistryObject<Item> RUINS_BASE = block(FalloutWastelandsModBlocks.RUINS_BASE);
	public static final RegistryObject<Item> RUINS = block(FalloutWastelandsModBlocks.RUINS);
	public static final RegistryObject<Item> RUINS_GROUND = block(FalloutWastelandsModBlocks.RUINS_GROUND);
	public static final RegistryObject<Item> INDUSTRIAL_PLATING = block(FalloutWastelandsModBlocks.INDUSTRIAL_PLATING);
	public static final RegistryObject<Item> INDUSTRIAL_SUPPORT = block(FalloutWastelandsModBlocks.INDUSTRIAL_SUPPORT);
	public static final RegistryObject<Item> SINGLE_SCAFFOLD_BLOCK = block(FalloutWastelandsModBlocks.SINGLE_SCAFFOLD_BLOCK);
	public static final RegistryObject<Item> VAULT_WALL = block(FalloutWastelandsModBlocks.VAULT_WALL);
	public static final RegistryObject<Item> VAULT_REINFORCED_PILLAR = block(FalloutWastelandsModBlocks.VAULT_REINFORCED_PILLAR);
	public static final RegistryObject<Item> VAULT_WALL_CURVED = block(FalloutWastelandsModBlocks.VAULT_WALL_CURVED);
	public static final RegistryObject<Item> VAULT_WALL_EXPOSED = block(FalloutWastelandsModBlocks.VAULT_WALL_EXPOSED);
	public static final RegistryObject<Item> VAULT_FLOOR = block(FalloutWastelandsModBlocks.VAULT_FLOOR);
	public static final RegistryObject<Item> VAULT_PILLAR = block(FalloutWastelandsModBlocks.VAULT_PILLAR);
	public static final RegistryObject<Item> VAULT_VENT = block(FalloutWastelandsModBlocks.VAULT_VENT);
	public static final RegistryObject<Item> OXIDIZED_METAL_SLAB = block(FalloutWastelandsModBlocks.OXIDIZED_METAL_SLAB);
	public static final RegistryObject<Item> RUSTED_SHEET_METAL_WALL = block(FalloutWastelandsModBlocks.RUSTED_SHEET_METAL_WALL);
	public static final RegistryObject<Item> MILITARY_METAL_PLATE_WALL = block(FalloutWastelandsModBlocks.MILITARY_METAL_PLATE_WALL);
	public static final RegistryObject<Item> CHARRED_MOLDER_WOOD_PLANK = block(FalloutWastelandsModBlocks.CHARRED_MOLDER_WOOD_PLANK);
	public static final RegistryObject<Item> CHARRED_MOLDER_STAIRS = block(FalloutWastelandsModBlocks.CHARRED_MOLDER_STAIRS);
	public static final RegistryObject<Item> BOS_STEEL_SLABS = block(FalloutWastelandsModBlocks.BOS_STEEL_SLABS);
	public static final RegistryObject<Item> MILITARY_PLATING_SLAB = block(FalloutWastelandsModBlocks.MILITARY_PLATING_SLAB);
	public static final RegistryObject<Item> MILITARY_METAL_STAIR = block(FalloutWastelandsModBlocks.MILITARY_METAL_STAIR);
	public static final RegistryObject<Item> MILITARY_METAL_HAZARD = block(FalloutWastelandsModBlocks.MILITARY_METAL_HAZARD);
	public static final RegistryObject<Item> MILITARY_PLATING_WALKWAY = block(FalloutWastelandsModBlocks.MILITARY_PLATING_WALKWAY);
	public static final RegistryObject<Item> MILITARY_METAL_RADIATION = block(FalloutWastelandsModBlocks.MILITARY_METAL_RADIATION);
	public static final RegistryObject<Item> CHARRED_MOLDER_SLAB = block(FalloutWastelandsModBlocks.CHARRED_MOLDER_SLAB);
	public static final RegistryObject<Item> CHARRED_MOLDER_FENCE = block(FalloutWastelandsModBlocks.CHARRED_MOLDER_FENCE);
	public static final RegistryObject<Item> METAL_BARREL = block(FalloutWastelandsModBlocks.METAL_BARREL);
	public static final RegistryObject<Item> RADIATION_BARREL = block(FalloutWastelandsModBlocks.RADIATION_BARREL);
	public static final RegistryObject<Item> CEILING_LIGHT = block(FalloutWastelandsModBlocks.CEILING_LIGHT);
	public static final RegistryObject<Item> FILING_CABINET = block(FalloutWastelandsModBlocks.FILING_CABINET);
	public static final RegistryObject<Item> FLOOR_PAPERS = block(FalloutWastelandsModBlocks.FLOOR_PAPERS);
	public static final RegistryObject<Item> FRIDGE = block(FalloutWastelandsModBlocks.FRIDGE);
	public static final RegistryObject<Item> MEDICAL_BOX = block(FalloutWastelandsModBlocks.MEDICAL_BOX);
	public static final RegistryObject<Item> METAL_CHAIR = block(FalloutWastelandsModBlocks.METAL_CHAIR);
	public static final RegistryObject<Item> MIXER = block(FalloutWastelandsModBlocks.MIXER);
	public static final RegistryObject<Item> PIPE = block(FalloutWastelandsModBlocks.PIPE);
	public static final RegistryObject<Item> TELEVISION = block(FalloutWastelandsModBlocks.TELEVISION);
	public static final RegistryObject<Item> TERMINAL = block(FalloutWastelandsModBlocks.TERMINAL);
	public static final RegistryObject<Item> TIRE_STACK = block(FalloutWastelandsModBlocks.TIRE_STACK);
	public static final RegistryObject<Item> TRASH_BIN = block(FalloutWastelandsModBlocks.TRASH_BIN);
	public static final RegistryObject<Item> AMMO_BOX = block(FalloutWastelandsModBlocks.AMMO_BOX);
	public static final RegistryObject<Item> LIGHT_TUBE = block(FalloutWastelandsModBlocks.LIGHT_TUBE);
	public static final RegistryObject<Item> ENCLAVE_BUNKER_STAIRS = block(FalloutWastelandsModBlocks.ENCLAVE_BUNKER_STAIRS);
	public static final RegistryObject<Item> METAL_SHELF = block(FalloutWastelandsModBlocks.METAL_SHELF);
	public static final RegistryObject<Item> BOS_METAL_STAIRS = block(FalloutWastelandsModBlocks.BOS_METAL_STAIRS);
	public static final RegistryObject<Item> POWER_ARMOR_FRAME_SPAWN_EGG = REGISTRY.register("power_armor_frame_spawn_egg", () -> new ForgeSpawnEggItem(FalloutWastelandsModEntities.POWER_ARMOR_FRAME, -5000297, -2828339, new Item.Properties()));
	public static final RegistryObject<Item> ALUMINIUMNUGGET = REGISTRY.register("aluminiumnugget", () -> new AluminiumnuggetItem());
	public static final RegistryObject<Item> LEAD_NUGGET = REGISTRY.register("lead_nugget", () -> new LeadNuggetItem());
	public static final RegistryObject<Item> URANIUM_NUGGET = REGISTRY.register("uranium_nugget", () -> new UraniumNuggetItem());
	public static final RegistryObject<Item> TINNUGGET = REGISTRY.register("tinnugget", () -> new TinnuggetItem());
	public static final RegistryObject<Item> STEELNUGGET = REGISTRY.register("steelnugget", () -> new SteelnuggetItem());
	public static final RegistryObject<Item> POWER_ARMOR_FRAME_ARMOR_HELMET = REGISTRY.register("power_armor_frame_armor_helmet", () -> new PowerArmorFrameArmorItem.Helmet());
	public static final RegistryObject<Item> POWER_ARMOR_FRAME_ARMOR_CHESTPLATE = REGISTRY.register("power_armor_frame_armor_chestplate", () -> new PowerArmorFrameArmorItem.Chestplate());
	public static final RegistryObject<Item> POWER_ARMOR_FRAME_ARMOR_LEGGINGS = REGISTRY.register("power_armor_frame_armor_leggings", () -> new PowerArmorFrameArmorItem.Leggings());
	public static final RegistryObject<Item> POWER_ARMOR_FRAME_ARMOR_BOOTS = REGISTRY.register("power_armor_frame_armor_boots", () -> new PowerArmorFrameArmorItem.Boots());
	public static final RegistryObject<Item> T_45_PA_HELMET = REGISTRY.register("t_45_pa_helmet", () -> new T45PAItem.Helmet());
	public static final RegistryObject<Item> T_45_PA_CHESTPLATE = REGISTRY.register("t_45_pa_chestplate", () -> new T45PAItem.Chestplate());
	public static final RegistryObject<Item> T_45_PA_LEGGINGS = REGISTRY.register("t_45_pa_leggings", () -> new T45PAItem.Leggings());
	public static final RegistryObject<Item> T_45_PA_BOOTS = REGISTRY.register("t_45_pa_boots", () -> new T45PAItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
