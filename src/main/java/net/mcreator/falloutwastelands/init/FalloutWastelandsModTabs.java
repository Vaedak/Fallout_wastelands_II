
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.falloutwastelands.FalloutWastelandsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FalloutWastelandsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FalloutWastelandsMod.MODID);
	public static final RegistryObject<CreativeModeTab> WASTELANDBLOCKSTAB = REGISTRY.register("wastelandblockstab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fallout_wastelands_.wastelandblockstab")).icon(() -> new ItemStack(FalloutWastelandsModBlocks.WASTELAND_STONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_STONE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_DIRT.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDGRASSBLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_CONCRETE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CRACKED_WASTELAND_CONCRETE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_CONCRETE_STAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_CONCRETE_SLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_CONCRETE_WALL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CRACKED_WASTELAND_CONCRETE_STAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CRACKED_WASTELAND_CONCRETE_SLABS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CRACKED_WASTELAND_CONCRETE_WALL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_COBBLESTONE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.STAIR_WASTELAND_COBBLESTONE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SLAB_WASTELAND_COBBLESTONE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WALL_WASTELAND_COBBLESTONE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.THE_GLOW_DIRT.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.UTSOL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_BRICK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_WOOD.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_LOG.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_PLANKS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_STAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_SLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_FENCE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_FENCE_GATE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_PRESSURE_PLATE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_BUTTON.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_DOOR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.MOLDER_WOOD_TRAPDOOR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDGRASSBUSH.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDBURNTGRASS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDSHORTBURNTGRASS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_BRICK_STAIRS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDGRAVEL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_BRICKSLAB.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDPEBBLE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDCOALORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDIRONORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDCOPPERORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDREDSTONEORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDLAPISORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDDIAMONDORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_GOLDORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDEMERALDORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_BRICK_WALL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_BROKEN_GLASS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.LOCKER.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WORN_METAL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.HANGARDOOR.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_CRACKED_BRICK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WIREFENCE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.STRIPPEDMOLDERWOODLOG.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDBRICKS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SUBWAYBRICKS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.CAGE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.DOUBLE_SCAFFOLD_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SCAFFOLDING_WALKWAYS_BLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.STEEL_POLE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.ROOF_METAL.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BARRICADEPLANKS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.REINFORCED_PLANKS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.SHEETMETALBLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.RUSTY_SHEETMETALBLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BARRICADESHEETMETALBLOCK.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BURNISHED_GLASS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BLASTED_GLASS.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BLASTED_GLASS_PANE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BURNISHED_GLASS_PANE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDTILES.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.BAS_ECORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.ZONE_REMOVER_BLOCK.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> WASTELANDCOMBAT = REGISTRY.register("wastelandcombat",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fallout_wastelands_.wastelandcombat")).icon(() -> new ItemStack(FalloutWastelandsModItems.RAIDERBLASTMASTER_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FalloutWastelandsModItems.RAIDERDUSTER_HELMET.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERDUSTER_CHESTPLATE.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERDUSTER_LEGGINGS.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERDUSTER_BOOTS.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBASHER_HELMET.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBASHER_CHESTPLATE.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBASHER_LEGGINGS.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBASHER_BOOTS.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBLASTMASTER_HELMET.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBLASTMASTER_CHESTPLATE.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBLASTMASTER_LEGGINGS.get());
				tabData.accept(FalloutWastelandsModItems.RAIDERBLASTMASTER_BOOTS.get());
				tabData.accept(FalloutWastelandsModBlocks.LANDMINE.get().asItem());
				tabData.accept(FalloutWastelandsModItems.COMBATARMOR_HELMET.get());
				tabData.accept(FalloutWastelandsModItems.COMBATARMOR_CHESTPLATE.get());
				tabData.accept(FalloutWastelandsModItems.COMBATARMOR_LEGGINGS.get());
				tabData.accept(FalloutWastelandsModItems.COMBATARMOR_BOOTS.get());
				tabData.accept(FalloutWastelandsModItems.REVOLVER_32.get());
				tabData.accept(FalloutWastelandsModItems.TEST_WEAPON.get());
				tabData.accept(FalloutWastelandsModItems.BASE_GUN_ITEM.get());
				tabData.accept(FalloutWastelandsModItems.NINEMMPISTOL.get());
				tabData.accept(FalloutWastelandsModItems.ZONE_MOB_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> WASTELANDITEMS = REGISTRY.register("wastelanditems",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fallout_wastelands_.wastelanditems")).icon(() -> new ItemStack(FalloutWastelandsModItems.JERRICAN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FalloutWastelandsModItems.CLOTH.get());
				tabData.accept(FalloutWastelandsModItems.TATO.get());
				tabData.accept(FalloutWastelandsModItems.ASBESTOS.get());
				tabData.accept(FalloutWastelandsModItems.ANTIRADCLOTHING.get());
				tabData.accept(FalloutWastelandsModItems.JERRICAN.get());
				tabData.accept(FalloutWastelandsModItems.COPPERWIRES.get());
				tabData.accept(FalloutWastelandsModItems.WASTELANDBRICKITEM.get());
				tabData.accept(FalloutWastelandsModItems.TININGOT.get());
				tabData.accept(FalloutWastelandsModItems.ALUMINUM_INGOT.get());
				tabData.accept(FalloutWastelandsModItems.STEEL_INGOT.get());
				tabData.accept(FalloutWastelandsModItems.LEAD_INGOT.get());
				tabData.accept(FalloutWastelandsModItems.URANIUM_INGOT.get());
				tabData.accept(FalloutWastelandsModItems.NUKA_COLA.get());
				tabData.accept(FalloutWastelandsModItems.EMPTY_NUKA_COLA_BOTTLE.get());
				tabData.accept(FalloutWastelandsModItems.NUKA_COLA_QUANTUM.get());
				tabData.accept(FalloutWastelandsModItems.BOTTLE_CAP.get());
				tabData.accept(FalloutWastelandsModItems.NEUTRONADE.get());
				tabData.accept(FalloutWastelandsModItems.NEUTRONADE_CAP.get());
				tabData.accept(FalloutWastelandsModItems.EMPTY_NEUTRONADE_BOTTLE.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FalloutWastelandsModItems.CANNIBAL_00_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(FalloutWastelandsModItems.WASTELANDS.get());
		}
	}
}
