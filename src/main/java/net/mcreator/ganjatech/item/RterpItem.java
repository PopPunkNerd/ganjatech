
package net.mcreator.ganjatech.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.ganjatech.init.GanjatechModFluids;

public class RterpItem extends BucketItem {
	public RterpItem() {
		super(GanjatechModFluids.RTERP, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
