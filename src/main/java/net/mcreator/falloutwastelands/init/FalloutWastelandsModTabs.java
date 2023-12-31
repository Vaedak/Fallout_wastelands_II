
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
				tabData.accept(FalloutWastelandsModItems.CLOTH.get());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDCOALORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDIRONORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDCOPPERORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDREDSTONEORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDLAPISORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDDIAMONDORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_GOLDORE.get().asItem());
				tabData.accept(FalloutWastelandsModBlocks.WASTELANDEMERALDORE.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(FalloutWastelandsModItems.RAIDERDUSTER_HELMET.get());
			tabData.accept(FalloutWastelandsModItems.RAIDERDUSTER_CHESTPLATE.get());
			tabData.accept(FalloutWastelandsModItems.RAIDERDUSTER_LEGGINGS.get());
			tabData.accept(FalloutWastelandsModItems.RAIDERDUSTER_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(FalloutWastelandsModItems.WASTELANDS.get());
		}
	}
}
