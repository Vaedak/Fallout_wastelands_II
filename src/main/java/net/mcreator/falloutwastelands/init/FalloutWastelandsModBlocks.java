
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.falloutwastelands.block.WornMetalBlock;
import net.mcreator.falloutwastelands.block.WoodedconcreteBlock;
import net.mcreator.falloutwastelands.block.WirefenceBlock;
import net.mcreator.falloutwastelands.block.WastelandventconcreteBlock;
import net.mcreator.falloutwastelands.block.WastelandtilesstairsBlock;
import net.mcreator.falloutwastelands.block.WastelandtilesslabBlock;
import net.mcreator.falloutwastelands.block.WastelandtilesBlock;
import net.mcreator.falloutwastelands.block.WastelandshortburntgrassBlock;
import net.mcreator.falloutwastelands.block.WastelandsPortalBlock;
import net.mcreator.falloutwastelands.block.WastelandredstoneoreBlock;
import net.mcreator.falloutwastelands.block.WastelandpebbleBlock;
import net.mcreator.falloutwastelands.block.WastelandlapisoreBlock;
import net.mcreator.falloutwastelands.block.WastelandironoreBlock;
import net.mcreator.falloutwastelands.block.WastelandhardstoneBlock;
import net.mcreator.falloutwastelands.block.WastelandgravelBlock;
import net.mcreator.falloutwastelands.block.WastelandgrassbushBlock;
import net.mcreator.falloutwastelands.block.WastelandgrassblockBlock;
import net.mcreator.falloutwastelands.block.WastelandemeraldoreBlock;
import net.mcreator.falloutwastelands.block.WastelanddiamondoreBlock;
import net.mcreator.falloutwastelands.block.WastelandcopperoreBlock;
import net.mcreator.falloutwastelands.block.WastelandcoaloreBlock;
import net.mcreator.falloutwastelands.block.WastelandburntgrassBlock;
import net.mcreator.falloutwastelands.block.WastelandbricksBlock;
import net.mcreator.falloutwastelands.block.WastelandStoneBlock;
import net.mcreator.falloutwastelands.block.WastelandGoldoreBlock;
import net.mcreator.falloutwastelands.block.WastelandDirtBlock;
import net.mcreator.falloutwastelands.block.WastelandCrackedBrickBlock;
import net.mcreator.falloutwastelands.block.WastelandConcreteWallBlock;
import net.mcreator.falloutwastelands.block.WastelandConcreteStairsBlock;
import net.mcreator.falloutwastelands.block.WastelandConcreteSlabBlock;
import net.mcreator.falloutwastelands.block.WastelandConcreteBlock;
import net.mcreator.falloutwastelands.block.WastelandCobblestoneBlock;
import net.mcreator.falloutwastelands.block.WastelandBrokenGlassBlock;
import net.mcreator.falloutwastelands.block.WastelandBrickslabBlock;
import net.mcreator.falloutwastelands.block.WastelandBrickWallBlock;
import net.mcreator.falloutwastelands.block.WastelandBrickStairsBlock;
import net.mcreator.falloutwastelands.block.WastelandBrickBlock;
import net.mcreator.falloutwastelands.block.WallWastelandCobblestoneBlock;
import net.mcreator.falloutwastelands.block.UtsolBlock;
import net.mcreator.falloutwastelands.block.TheGlowDirtBlock;
import net.mcreator.falloutwastelands.block.SubwaybricksBlock;
import net.mcreator.falloutwastelands.block.StrippedmolderwoodlogBlock;
import net.mcreator.falloutwastelands.block.SteelPoleBlock;
import net.mcreator.falloutwastelands.block.StairWastelandCobblestoneBlock;
import net.mcreator.falloutwastelands.block.SlabWastelandCobblestoneBlock;
import net.mcreator.falloutwastelands.block.SheetmetalstairsBlock;
import net.mcreator.falloutwastelands.block.SheetmetalblockBlock;
import net.mcreator.falloutwastelands.block.ScaffoldingWalkwaysBlockBlock;
import net.mcreator.falloutwastelands.block.RustysheetmetalstairsBlock;
import net.mcreator.falloutwastelands.block.RustySheetmetalblockBlock;
import net.mcreator.falloutwastelands.block.RustBlockBlock;
import net.mcreator.falloutwastelands.block.RoofMetalBlock;
import net.mcreator.falloutwastelands.block.ReinforcedPlanksBlock;
import net.mcreator.falloutwastelands.block.Molder_WoodWoodBlock;
import net.mcreator.falloutwastelands.block.Molder_WoodStairsBlock;
import net.mcreator.falloutwastelands.block.Molder_WoodSlabBlock;
import net.mcreator.falloutwastelands.block.Molder_WoodPressurePlateBlock;
import net.mcreator.falloutwastelands.block.Molder_WoodPlanksBlock;
import net.mcreator.falloutwastelands.block.Molder_WoodLogBlock;
import net.mcreator.falloutwastelands.block.Molder_WoodFenceGateBlock;
import net.mcreator.falloutwastelands.block.Molder_WoodFenceBlock;
import net.mcreator.falloutwastelands.block.Molder_WoodButtonBlock;
import net.mcreator.falloutwastelands.block.MolderWoodTrapdoorBlock;
import net.mcreator.falloutwastelands.block.MolderWoodDoorBlock;
import net.mcreator.falloutwastelands.block.MilitaryMetalwindowBlock;
import net.mcreator.falloutwastelands.block.MilitaryMetalPlateBlock;
import net.mcreator.falloutwastelands.block.MilitaryMetalDoorBlock;
import net.mcreator.falloutwastelands.block.LockerBlock;
import net.mcreator.falloutwastelands.block.LinedconcreteBlock;
import net.mcreator.falloutwastelands.block.LandmineBlock;
import net.mcreator.falloutwastelands.block.HorizontallinedconcreteBlock;
import net.mcreator.falloutwastelands.block.HardconcretestairsBlock;
import net.mcreator.falloutwastelands.block.HardconcreteBlock;
import net.mcreator.falloutwastelands.block.HangardoorBlock;
import net.mcreator.falloutwastelands.block.GreyTilesBlock;
import net.mcreator.falloutwastelands.block.DoubleScaffoldBlockBlock;
import net.mcreator.falloutwastelands.block.CrackedWastelandConcreteWallBlock;
import net.mcreator.falloutwastelands.block.CrackedWastelandConcreteStairsBlock;
import net.mcreator.falloutwastelands.block.CrackedWastelandConcreteSlabsBlock;
import net.mcreator.falloutwastelands.block.CrackedWastelandConcreteBlock;
import net.mcreator.falloutwastelands.block.ConcreteTileBlock;
import net.mcreator.falloutwastelands.block.CentralunitBlock;
import net.mcreator.falloutwastelands.block.CageBlock;
import net.mcreator.falloutwastelands.block.BurnishedGlassPaneBlock;
import net.mcreator.falloutwastelands.block.BurnishedGlassBlock;
import net.mcreator.falloutwastelands.block.BlastedGlassPaneBlock;
import net.mcreator.falloutwastelands.block.BlastedGlassBlock;
import net.mcreator.falloutwastelands.block.BlackTilesBlock;
import net.mcreator.falloutwastelands.block.BarricadesheetmetalblockBlock;
import net.mcreator.falloutwastelands.block.BarricadeplanksBlock;
import net.mcreator.falloutwastelands.block.BASEcoreBlock;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FalloutWastelandsMod.MODID);
	public static final RegistryObject<Block> WASTELAND_STONE = REGISTRY.register("wasteland_stone", () -> new WastelandStoneBlock());
	public static final RegistryObject<Block> WASTELAND_DIRT = REGISTRY.register("wasteland_dirt", () -> new WastelandDirtBlock());
	public static final RegistryObject<Block> WASTELANDS_PORTAL = REGISTRY.register("wastelands_portal", () -> new WastelandsPortalBlock());
	public static final RegistryObject<Block> WASTELANDGRASSBLOCK = REGISTRY.register("wastelandgrassblock", () -> new WastelandgrassblockBlock());
	public static final RegistryObject<Block> WASTELAND_CONCRETE = REGISTRY.register("wasteland_concrete", () -> new WastelandConcreteBlock());
	public static final RegistryObject<Block> CRACKED_WASTELAND_CONCRETE = REGISTRY.register("cracked_wasteland_concrete", () -> new CrackedWastelandConcreteBlock());
	public static final RegistryObject<Block> WASTELAND_CONCRETE_STAIRS = REGISTRY.register("wasteland_concrete_stairs", () -> new WastelandConcreteStairsBlock());
	public static final RegistryObject<Block> WASTELAND_CONCRETE_SLAB = REGISTRY.register("wasteland_concrete_slab", () -> new WastelandConcreteSlabBlock());
	public static final RegistryObject<Block> WASTELAND_CONCRETE_WALL = REGISTRY.register("wasteland_concrete_wall", () -> new WastelandConcreteWallBlock());
	public static final RegistryObject<Block> CRACKED_WASTELAND_CONCRETE_STAIRS = REGISTRY.register("cracked_wasteland_concrete_stairs", () -> new CrackedWastelandConcreteStairsBlock());
	public static final RegistryObject<Block> CRACKED_WASTELAND_CONCRETE_SLABS = REGISTRY.register("cracked_wasteland_concrete_slabs", () -> new CrackedWastelandConcreteSlabsBlock());
	public static final RegistryObject<Block> CRACKED_WASTELAND_CONCRETE_WALL = REGISTRY.register("cracked_wasteland_concrete_wall", () -> new CrackedWastelandConcreteWallBlock());
	public static final RegistryObject<Block> WASTELAND_COBBLESTONE = REGISTRY.register("wasteland_cobblestone", () -> new WastelandCobblestoneBlock());
	public static final RegistryObject<Block> STAIR_WASTELAND_COBBLESTONE = REGISTRY.register("stair_wasteland_cobblestone", () -> new StairWastelandCobblestoneBlock());
	public static final RegistryObject<Block> SLAB_WASTELAND_COBBLESTONE = REGISTRY.register("slab_wasteland_cobblestone", () -> new SlabWastelandCobblestoneBlock());
	public static final RegistryObject<Block> WALL_WASTELAND_COBBLESTONE = REGISTRY.register("wall_wasteland_cobblestone", () -> new WallWastelandCobblestoneBlock());
	public static final RegistryObject<Block> THE_GLOW_DIRT = REGISTRY.register("the_glow_dirt", () -> new TheGlowDirtBlock());
	public static final RegistryObject<Block> WASTELAND_ROOTY_DIRT = REGISTRY.register("wasteland_rooty_dirt", () -> new UtsolBlock());
	public static final RegistryObject<Block> WASTELAND_BRICK = REGISTRY.register("wasteland_brick", () -> new WastelandBrickBlock());
	public static final RegistryObject<Block> MOLDER_WOOD_WOOD = REGISTRY.register("molder_wood_wood", () -> new Molder_WoodWoodBlock());
	public static final RegistryObject<Block> MOLDER_WOOD_LOG = REGISTRY.register("molder_wood_log", () -> new Molder_WoodLogBlock());
	public static final RegistryObject<Block> MOLDER_WOOD_PLANKS = REGISTRY.register("molder_wood_planks", () -> new Molder_WoodPlanksBlock());
	public static final RegistryObject<Block> MOLDER_WOOD_STAIRS = REGISTRY.register("molder_wood_stairs", () -> new Molder_WoodStairsBlock());
	public static final RegistryObject<Block> MOLDER_WOOD_SLAB = REGISTRY.register("molder_wood_slab", () -> new Molder_WoodSlabBlock());
	public static final RegistryObject<Block> MOLDER_WOOD_FENCE = REGISTRY.register("molder_wood_fence", () -> new Molder_WoodFenceBlock());
	public static final RegistryObject<Block> MOLDER_WOOD_FENCE_GATE = REGISTRY.register("molder_wood_fence_gate", () -> new Molder_WoodFenceGateBlock());
	public static final RegistryObject<Block> MOLDER_WOOD_PRESSURE_PLATE = REGISTRY.register("molder_wood_pressure_plate", () -> new Molder_WoodPressurePlateBlock());
	public static final RegistryObject<Block> MOLDER_WOOD_BUTTON = REGISTRY.register("molder_wood_button", () -> new Molder_WoodButtonBlock());
	public static final RegistryObject<Block> MOLDER_WOOD_DOOR = REGISTRY.register("molder_wood_door", () -> new MolderWoodDoorBlock());
	public static final RegistryObject<Block> MOLDER_WOOD_TRAPDOOR = REGISTRY.register("molder_wood_trapdoor", () -> new MolderWoodTrapdoorBlock());
	public static final RegistryObject<Block> WASTELANDGRASSBUSH = REGISTRY.register("wastelandgrassbush", () -> new WastelandgrassbushBlock());
	public static final RegistryObject<Block> WASTELANDBURNTGRASS = REGISTRY.register("wastelandburntgrass", () -> new WastelandburntgrassBlock());
	public static final RegistryObject<Block> WASTELANDSHORTBURNTGRASS = REGISTRY.register("wastelandshortburntgrass", () -> new WastelandshortburntgrassBlock());
	public static final RegistryObject<Block> WASTELAND_BRICK_STAIRS = REGISTRY.register("wasteland_brick_stairs", () -> new WastelandBrickStairsBlock());
	public static final RegistryObject<Block> WASTELANDGRAVEL = REGISTRY.register("wastelandgravel", () -> new WastelandgravelBlock());
	public static final RegistryObject<Block> WASTELAND_BRICKSLAB = REGISTRY.register("wasteland_brickslab", () -> new WastelandBrickslabBlock());
	public static final RegistryObject<Block> WASTELANDPEBBLE = REGISTRY.register("wastelandpebble", () -> new WastelandpebbleBlock());
	public static final RegistryObject<Block> WASTELANDCOALORE = REGISTRY.register("wastelandcoalore", () -> new WastelandcoaloreBlock());
	public static final RegistryObject<Block> WASTELANDIRONORE = REGISTRY.register("wastelandironore", () -> new WastelandironoreBlock());
	public static final RegistryObject<Block> WASTELANDCOPPERORE = REGISTRY.register("wastelandcopperore", () -> new WastelandcopperoreBlock());
	public static final RegistryObject<Block> WASTELANDREDSTONEORE = REGISTRY.register("wastelandredstoneore", () -> new WastelandredstoneoreBlock());
	public static final RegistryObject<Block> WASTELANDLAPISORE = REGISTRY.register("wastelandlapisore", () -> new WastelandlapisoreBlock());
	public static final RegistryObject<Block> WASTELANDDIAMONDORE = REGISTRY.register("wastelanddiamondore", () -> new WastelanddiamondoreBlock());
	public static final RegistryObject<Block> WASTELAND_GOLDORE = REGISTRY.register("wasteland_goldore", () -> new WastelandGoldoreBlock());
	public static final RegistryObject<Block> WASTELANDEMERALDORE = REGISTRY.register("wastelandemeraldore", () -> new WastelandemeraldoreBlock());
	public static final RegistryObject<Block> WASTELAND_BRICK_WALL = REGISTRY.register("wasteland_brick_wall", () -> new WastelandBrickWallBlock());
	public static final RegistryObject<Block> WASTELAND_BROKEN_GLASS = REGISTRY.register("wasteland_broken_glass", () -> new WastelandBrokenGlassBlock());
	public static final RegistryObject<Block> LOCKER = REGISTRY.register("locker", () -> new LockerBlock());
	public static final RegistryObject<Block> LANDMINE = REGISTRY.register("landmine", () -> new LandmineBlock());
	public static final RegistryObject<Block> WORN_METAL = REGISTRY.register("worn_metal", () -> new WornMetalBlock());
	public static final RegistryObject<Block> HANGARDOOR = REGISTRY.register("hangardoor", () -> new HangardoorBlock());
	public static final RegistryObject<Block> WASTELAND_CRACKED_BRICK = REGISTRY.register("wasteland_cracked_brick", () -> new WastelandCrackedBrickBlock());
	public static final RegistryObject<Block> WIREFENCE = REGISTRY.register("wirefence", () -> new WirefenceBlock());
	public static final RegistryObject<Block> STRIPPEDMOLDERWOODLOG = REGISTRY.register("strippedmolderwoodlog", () -> new StrippedmolderwoodlogBlock());
	public static final RegistryObject<Block> WASTELANDBRICKS = REGISTRY.register("wastelandbricks", () -> new WastelandbricksBlock());
	public static final RegistryObject<Block> SUBWAYBRICKS = REGISTRY.register("subwaybricks", () -> new SubwaybricksBlock());
	public static final RegistryObject<Block> CAGE = REGISTRY.register("cage", () -> new CageBlock());
	public static final RegistryObject<Block> DOUBLE_SCAFFOLD_BLOCK = REGISTRY.register("double_scaffold_block", () -> new DoubleScaffoldBlockBlock());
	public static final RegistryObject<Block> SCAFFOLDING_WALKWAYS_BLOCK = REGISTRY.register("scaffolding_walkways_block", () -> new ScaffoldingWalkwaysBlockBlock());
	public static final RegistryObject<Block> STEEL_POLE = REGISTRY.register("steel_pole", () -> new SteelPoleBlock());
	public static final RegistryObject<Block> ROOF_METAL = REGISTRY.register("roof_metal", () -> new RoofMetalBlock());
	public static final RegistryObject<Block> BARRICADEPLANKS = REGISTRY.register("barricadeplanks", () -> new BarricadeplanksBlock());
	public static final RegistryObject<Block> REINFORCED_PLANKS = REGISTRY.register("reinforced_planks", () -> new ReinforcedPlanksBlock());
	public static final RegistryObject<Block> SHEETMETALBLOCK = REGISTRY.register("sheetmetalblock", () -> new SheetmetalblockBlock());
	public static final RegistryObject<Block> RUSTY_SHEETMETALBLOCK = REGISTRY.register("rusty_sheetmetalblock", () -> new RustySheetmetalblockBlock());
	public static final RegistryObject<Block> BARRICADESHEETMETALBLOCK = REGISTRY.register("barricadesheetmetalblock", () -> new BarricadesheetmetalblockBlock());
	public static final RegistryObject<Block> BURNISHED_GLASS = REGISTRY.register("burnished_glass", () -> new BurnishedGlassBlock());
	public static final RegistryObject<Block> BLASTED_GLASS = REGISTRY.register("blasted_glass", () -> new BlastedGlassBlock());
	public static final RegistryObject<Block> BLASTED_GLASS_PANE = REGISTRY.register("blasted_glass_pane", () -> new BlastedGlassPaneBlock());
	public static final RegistryObject<Block> BURNISHED_GLASS_PANE = REGISTRY.register("burnished_glass_pane", () -> new BurnishedGlassPaneBlock());
	public static final RegistryObject<Block> WASTELANDTILES = REGISTRY.register("wastelandtiles", () -> new WastelandtilesBlock());
	public static final RegistryObject<Block> BAS_ECORE = REGISTRY.register("bas_ecore", () -> new BASEcoreBlock());
	public static final RegistryObject<Block> MILITARY_METAL_PLATE = REGISTRY.register("military_metal_plate", () -> new MilitaryMetalPlateBlock());
	public static final RegistryObject<Block> MILITARY_METAL_DOOR = REGISTRY.register("military_metal_door", () -> new MilitaryMetalDoorBlock());
	public static final RegistryObject<Block> MILITARY_METALWINDOW = REGISTRY.register("military_metalwindow", () -> new MilitaryMetalwindowBlock());
	public static final RegistryObject<Block> CENTRALUNIT = REGISTRY.register("centralunit", () -> new CentralunitBlock());
	public static final RegistryObject<Block> WASTELANDVENTCONCRETE = REGISTRY.register("wastelandventconcrete", () -> new WastelandventconcreteBlock());
	public static final RegistryObject<Block> LINEDCONCRETE = REGISTRY.register("linedconcrete", () -> new LinedconcreteBlock());
	public static final RegistryObject<Block> WOODEDCONCRETE = REGISTRY.register("woodedconcrete", () -> new WoodedconcreteBlock());
	public static final RegistryObject<Block> HORIZONTALLINEDCONCRETE = REGISTRY.register("horizontallinedconcrete", () -> new HorizontallinedconcreteBlock());
	public static final RegistryObject<Block> GREY_TILES = REGISTRY.register("grey_tiles", () -> new GreyTilesBlock());
	public static final RegistryObject<Block> BLACK_TILES = REGISTRY.register("black_tiles", () -> new BlackTilesBlock());
	public static final RegistryObject<Block> CONCRETE_TILE = REGISTRY.register("concrete_tile", () -> new ConcreteTileBlock());
	public static final RegistryObject<Block> HARDCONCRETE = REGISTRY.register("hardconcrete", () -> new HardconcreteBlock());
	public static final RegistryObject<Block> HARDCONCRETESTAIRS = REGISTRY.register("hardconcretestairs", () -> new HardconcretestairsBlock());
	public static final RegistryObject<Block> RUSTYSHEETMETALSTAIRS = REGISTRY.register("rustysheetmetalstairs", () -> new RustysheetmetalstairsBlock());
	public static final RegistryObject<Block> SHEETMETALSTAIRS = REGISTRY.register("sheetmetalstairs", () -> new SheetmetalstairsBlock());
	public static final RegistryObject<Block> WASTELANDTILESSTAIRS = REGISTRY.register("wastelandtilesstairs", () -> new WastelandtilesstairsBlock());
	public static final RegistryObject<Block> WASTELANDTILESSLAB = REGISTRY.register("wastelandtilesslab", () -> new WastelandtilesslabBlock());
	public static final RegistryObject<Block> WASTELANDHARDSTONE = REGISTRY.register("wastelandhardstone", () -> new WastelandhardstoneBlock());
	public static final RegistryObject<Block> RUST_BLOCK = REGISTRY.register("rust_block", () -> new RustBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			WastelandgrassblockBlock.blockColorLoad(event);
			WastelandgrassbushBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			WastelandgrassblockBlock.itemColorLoad(event);
			WastelandgrassbushBlock.itemColorLoad(event);
		}
	}
}
