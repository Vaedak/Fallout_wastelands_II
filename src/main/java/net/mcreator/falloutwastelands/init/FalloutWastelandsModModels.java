
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.falloutwastelands.client.model.Modeldusterraiderarmor;
import net.mcreator.falloutwastelands.client.model.ModelBighorn;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FalloutWastelandsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBighorn.LAYER_LOCATION, ModelBighorn::createBodyLayer);
		event.registerLayerDefinition(Modeldusterraiderarmor.LAYER_LOCATION, Modeldusterraiderarmor::createBodyLayer);
	}
}
