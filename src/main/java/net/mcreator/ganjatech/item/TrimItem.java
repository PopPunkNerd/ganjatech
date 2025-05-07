
package net.mcreator.ganjatech.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TrimItem extends Item {
	public TrimItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
