
package net.mcreator.falloutwastelands.world.dimension;

@Mod.EventBusSubscriber
public class WastelandsDimension {

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class DimensionSpecialEffectsHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(128, true, DimensionSpecialEffects.SkyType.NORMAL, false, false) {

				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0.4039215686, 0.6039215686, 0.4705882353);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}
			};

			event.register(new ResourceLocation("fallout_wastelands_:wastelands"), customEffect);
		}

	}

}
