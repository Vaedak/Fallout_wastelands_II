
package net.mcreator.falloutwastelands.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class WastelandbrickitemItem extends Item {
	public WastelandbrickitemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}