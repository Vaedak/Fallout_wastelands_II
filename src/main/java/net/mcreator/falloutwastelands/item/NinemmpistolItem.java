
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class NinemmpistolItem extends Item {
	public NinemmpistolItem() {
		super(new Item.Properties().durability(11).rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		IMPORTANTplayerShootingGunProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			GunInHandTickProcedure.execute(entity);
	}
}