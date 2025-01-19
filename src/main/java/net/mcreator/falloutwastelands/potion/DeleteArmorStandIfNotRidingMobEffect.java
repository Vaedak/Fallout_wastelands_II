
package net.mcreator.falloutwastelands.potion;

public class DeleteArmorStandIfNotRidingMobEffect extends MobEffect {
	public DeleteArmorStandIfNotRidingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -25856);
	}

	@Override
	public String getDescriptionId() {
		return "effect.fallout_wastelands_.delete_armor_stand_if_not_riding";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CheckIfRidingProcedure.execute();
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		CheckIfRidingProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInInventory(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean renderInventoryText(MobEffectInstance instance, EffectRenderingInventoryScreen<?> screen, GuiGraphics guiGraphics, int x, int y, int blitOffset) {
				return false;
			}

			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}