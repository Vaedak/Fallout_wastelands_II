
package net.mcreator.falloutwastelands.client.renderer;

public class PowerArmorFrameRenderer extends MobRenderer<PowerArmorFrameEntity, VillagerModel<PowerArmorFrameEntity>> {

	public PowerArmorFrameRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);

	}

	@Override
	protected void scale(PowerArmorFrameEntity villager, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(PowerArmorFrameEntity entity) {
		return new ResourceLocation("fallout_wastelands_:textures/entities/invisible.png");
	}

}