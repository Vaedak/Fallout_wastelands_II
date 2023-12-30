
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

import net.mcreator.falloutwastelands.block.WastelandshortburntgrassBlock;
import net.mcreator.falloutwastelands.block.WastelandsPortalBlock;
import net.mcreator.falloutwastelands.block.WastelandrockydirtBlock;
import net.mcreator.falloutwastelands.block.WastelandgravelBlock;
import net.mcreator.falloutwastelands.block.WastelandgrassbushBlock;
import net.mcreator.falloutwastelands.block.WastelandgrassblockBlock;
import net.mcreator.falloutwastelands.block.WastelandburntgrassBlock;
import net.mcreator.falloutwastelands.block.WastelandStoneBlock;
import net.mcreator.falloutwastelands.block.WastelandDirtBlock;
import net.mcreator.falloutwastelands.block.WastelandConcreteWallBlock;
import net.mcreator.falloutwastelands.block.WastelandConcreteStairsBlock;
import net.mcreator.falloutwastelands.block.WastelandConcreteSlabBlock;
import net.mcreator.falloutwastelands.block.WastelandConcreteBlock;
import net.mcreator.falloutwastelands.block.WastelandCobblestoneBlock;
import net.mcreator.falloutwastelands.block.WastelandBrickBlock;
import net.mcreator.falloutwastelands.block.WallWastelandCobblestoneBlock;
import net.mcreator.falloutwastelands.block.UtsolBlock;
import net.mcreator.falloutwastelands.block.TheGlowDirtBlock;
import net.mcreator.falloutwastelands.block.StairWastelandCobblestoneBlock;
import net.mcreator.falloutwastelands.block.SlabWastelandCobblestoneBlock;
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
import net.mcreator.falloutwastelands.block.CrackedWastelandConcreteWallBlock;
import net.mcreator.falloutwastelands.block.CrackedWastelandConcreteStairsBlock;
import net.mcreator.falloutwastelands.block.CrackedWastelandConcreteSlabsBlock;
import net.mcreator.falloutwastelands.block.CrackedWastelandConcreteBlock;
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
	public static final RegistryObject<Block> UTSOL = REGISTRY.register("utsol", () -> new UtsolBlock());
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
	public static final RegistryObject<Block> WASTELANDROCKYDIRT = REGISTRY.register("wastelandrockydirt", () -> new WastelandrockydirtBlock());
	public static final RegistryObject<Block> WASTELANDGRAVEL = REGISTRY.register("wastelandgravel", () -> new WastelandgravelBlock());

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
