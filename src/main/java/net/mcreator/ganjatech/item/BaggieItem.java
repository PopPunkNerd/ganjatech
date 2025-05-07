
package net.mcreator.ganjatech.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BaggieItem extends Item {
	public BaggieItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
