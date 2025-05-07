
package net.mcreator.ganjatech.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.ganjatech.init.GanjatechModFluids;

public class RawOilRItem extends BucketItem {
	public RawOilRItem() {
		super(GanjatechModFluids.RAW_OIL_R, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
