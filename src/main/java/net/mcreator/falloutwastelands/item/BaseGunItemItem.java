
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.mcreator.falloutwastelands.procedures.WhenRangedItemIsUsedProcedure;
import net.mcreator.falloutwastelands.procedures.Shoot9mmPistolProcedure;
import net.mcreator.falloutwastelands.procedures.CanUseRangedItemProcedure;
import net.mcreator.falloutwastelands.entity.BaseGunItemEntity;

import java.util.List;

public class BaseGunItemItem extends Item {
	public BaseGunItemItem() {
		super(new Item.Properties().durability(13));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		Shoot9mmPistolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("REMEMBER: Edit the \"IMPORTANTRELOADGUNPROCEDURE\" to make different weapons have reloads"));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (CanUseRangedItemProcedure.execute(world, x, y, z, entity, itemstack)) {
				BaseGunItemEntity entityarrow = BaseGunItemEntity.shoot(world, entity, world.getRandom(), 0.1f, 5, 0);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				WhenRangedItemIsUsedProcedure.execute(entity, itemstack);
			}
		}
	}
}
