
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class NailItem extends Item {
	public NailItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}