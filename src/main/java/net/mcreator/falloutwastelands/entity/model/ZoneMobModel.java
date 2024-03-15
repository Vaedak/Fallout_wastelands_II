package net.mcreator.falloutwastelands.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.falloutwastelands.entity.ZoneMobEntity;

public class ZoneMobModel extends GeoModel<ZoneMobEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZoneMobEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "animations/brf.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZoneMobEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "geo/brf.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZoneMobEntity entity) {
		return new ResourceLocation("fallout_wastelands_", "textures/entities/" + entity.getTexture() + ".png");
	}

}
