
package net.mcreator.falloutwastelands.item;

import net.minecraft.sounds.SoundEvent;
import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class PowerArmorFrameArmorItem extends ArmorItem {

	public PowerArmorFrameArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 25;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{2, 5, 6, 2}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "power_armor_frame_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends PowerArmorFrameArmorItem {

		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fallout_wastelands_:textures/models/armor/paframe___layer_1.png";
		}

	}

	public static class Chestplate extends PowerArmorFrameArmorItem {

		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fallout_wastelands_:textures/models/armor/paframe___layer_1.png";
		}

	}

	public static class Leggings extends PowerArmorFrameArmorItem {

		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fallout_wastelands_:textures/models/armor/paframe___layer_2.png";
		}

	}

	public static class Boots extends PowerArmorFrameArmorItem {

		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fallout_wastelands_:textures/models/armor/paframe___layer_1.png";
		}

	}

}
