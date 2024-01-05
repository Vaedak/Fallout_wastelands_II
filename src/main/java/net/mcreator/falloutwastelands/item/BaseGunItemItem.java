
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;

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
