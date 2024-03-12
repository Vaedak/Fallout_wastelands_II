
package net.mcreator.falloutwastelands.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.falloutwastelands.procedures.ZoneMobEntityVisualScaleProcedure;
import net.mcreator.falloutwastelands.entity.model.ZoneMobModel;
import net.mcreator.falloutwastelands.entity.ZoneMobEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

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
		float scale = (float) ZoneMobEntityVisualScaleProcedure.execute(world, x, y, z, entity);
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
