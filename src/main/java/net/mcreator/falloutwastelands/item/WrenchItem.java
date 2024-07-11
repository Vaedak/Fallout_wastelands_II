
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class WrenchItem extends SwordItem {
	public WrenchItem() {
		super(new Tier() {
			public int getUses() {
				return 90;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FalloutWastelandsModItems.LEAD_INGOT.get()));
			}
		}, 3, -3.3f, new Item.Properties());
	}
}
