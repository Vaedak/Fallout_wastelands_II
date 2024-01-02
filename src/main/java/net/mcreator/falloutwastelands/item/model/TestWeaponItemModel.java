package net.mcreator.falloutwastelands.item.model;

public class TestWeaponItemModel extends GeoModel<TestWeaponItem> {
	@Override
	public ResourceLocation getAnimationResource(TestWeaponItem animatable) {
		return new ResourceLocation("fallout_wastelands_", "animations/brf.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestWeaponItem animatable) {
		return new ResourceLocation("fallout_wastelands_", "geo/brf.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestWeaponItem animatable) {
		return new ResourceLocation("fallout_wastelands_", "textures/item/texture.png");
	}
}