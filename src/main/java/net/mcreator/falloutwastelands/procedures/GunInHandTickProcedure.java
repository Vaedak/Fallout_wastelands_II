package net.mcreator.falloutwastelands.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;

public class GunInHandTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double ammoCount = 0;
		boolean ammoChecked = false;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 5, 100, false, false));
		if (entity.getPersistentData().getDouble("cooldown") > 0) {
			entity.getPersistentData().putDouble("cooldown", (entity.getPersistentData().getDouble("cooldown") - 1));
		}
		if (itemstack.getOrCreateTag().getBoolean("autoFire") == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
	}
}
