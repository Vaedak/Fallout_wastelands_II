
package net.mcreator.falloutwastelands.client.renderer;

public class ZoneMobRenderer extends GeoEntityRenderer<ZoneMobEntity> {
	public ZoneMobRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ZoneMobModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(ZoneMobEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, ZoneMobEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float)

		ZoneMobEntityVisualScaleProcedure.execute();

		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}