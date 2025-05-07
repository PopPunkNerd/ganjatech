
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ganjatech.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class GanjatechModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == GanjatechModItems.HEMP_STEM.get())
			event.setBurnTime(50);
		else if (itemstack.getItem() == GanjatechModBlocks.HEMP_BALE.get().asItem())
			event.setBurnTime(550);
		else if (itemstack.getItem() == GanjatechModItems.HEMP_FIRESTRATER.get())
			event.setBurnTime(2000);
	}
}
