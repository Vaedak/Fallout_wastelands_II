
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
				tabData.accept(FalloutWastelandsModBlocks.WASTELAND_DIRT.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(FalloutWastelandsModBlocks.WASTELAND_STONE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(FalloutWastelandsModItems.WASTELANDS.get());
		}
	}
}
