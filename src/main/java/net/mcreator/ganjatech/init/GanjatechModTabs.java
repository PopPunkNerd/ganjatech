
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ganjatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ganjatech.GanjatechMod;

public class GanjatechModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GanjatechMod.MODID);
	public static final RegistryObject<CreativeModeTab> GANJA_TECH_CREATIVE_TAB = REGISTRY.register("ganja_tech_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ganjatech.ganja_tech_creative_tab")).icon(() -> new ItemStack(GanjatechModItems.INDICA_BONG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GanjatechModItems.WEEDSEEDS.get());
				tabData.accept(GanjatechModItems.INDICASPLIFF.get());
				tabData.accept(GanjatechModItems.HEMP_STEM.get());
				tabData.accept(GanjatechModItems.HEMP_FIBER_ITEM.get());
				tabData.accept(GanjatechModBlocks.HEMP_BRICKS.get().asItem());
				tabData.accept(GanjatechModItems.HEMP_BRICK.get());
				tabData.accept(GanjatechModBlocks.HEMP_BALE.get().asItem());
				tabData.accept(GanjatechModItems.INDICA_BUD.get());
				tabData.accept(GanjatechModItems.HEMP_OUTFIT_HELMET.get());
				tabData.accept(GanjatechModItems.HEMP_OUTFIT_CHESTPLATE.get());
				tabData.accept(GanjatechModItems.HEMP_OUTFIT_LEGGINGS.get());
				tabData.accept(GanjatechModItems.HEMP_OUTFIT_BOOTS.get());
				tabData.accept(GanjatechModItems.EMPTY_BONG.get());
				tabData.accept(GanjatechModItems.INDICA_BONG.get());
				tabData.accept(GanjatechModBlocks.HEMP_BRICKS_SLAB.get().asItem());
				tabData.accept(GanjatechModBlocks.HEMP_BRICKS_STAIRS.get().asItem());
				tabData.accept(GanjatechModBlocks.HEMP_BRICKS_WALL.get().asItem());
				tabData.accept(GanjatechModItems.CANNABUTTER_ITEM.get());
				tabData.accept(GanjatechModItems.HEMPCRETE.get());
				tabData.accept(GanjatechModBlocks.HEMPCRETE_POWDER.get().asItem());
				tabData.accept(GanjatechModBlocks.HEMPCRETE_BLOCK.get().asItem());
				tabData.accept(GanjatechModBlocks.HEMP_PLANKS_WODDY_STUFF_PLANKS.get().asItem());
				tabData.accept(GanjatechModBlocks.HEMP_PLANKS_WODDY_STUFF_STAIRS.get().asItem());
				tabData.accept(GanjatechModBlocks.HEMP_PLANKS_WODDY_STUFF_SLAB.get().asItem());
				tabData.accept(GanjatechModBlocks.HEMP_PLANKS_WODDY_STUFF_FENCE.get().asItem());
				tabData.accept(GanjatechModBlocks.HEMP_PLANKS_WODDY_STUFF_FENCE_GATE.get().asItem());
				tabData.accept(GanjatechModItems.HEMP_FLOUR.get());
				tabData.accept(GanjatechModBlocks.HEMP_DOOR.get().asItem());
				tabData.accept(GanjatechModItems.WEED_PIPE.get());
				tabData.accept(GanjatechModItems.INDICA_PIPE.get());
				tabData.accept(GanjatechModItems.SATIVA_SEEDS.get());
				tabData.accept(GanjatechModBlocks.HEMP_TRAPDOOR.get().asItem());
				tabData.accept(GanjatechModItems.SATIVA_BUD.get());
				tabData.accept(GanjatechModItems.SATIVA_SPLIFF.get());
				tabData.accept(GanjatechModItems.SATIVA_BONG.get());
				tabData.accept(GanjatechModItems.SATIVA_PIPE.get());
				tabData.accept(GanjatechModItems.HEMP_FIRESTRATER.get());
				tabData.accept(GanjatechModItems.GANJA_DISC.get());
				tabData.accept(GanjatechModItems.MAGIC_COOKIE.get());
				tabData.accept(GanjatechModItems.GOLDEN_CANNAPPLE.get());
				tabData.accept(GanjatechModItems.GOLDEN_CANNAROT.get());
				tabData.accept(GanjatechModItems.HEMP_SMOOTHIE.get());
				tabData.accept(GanjatechModItems.COOKED_SEEDS.get());
				tabData.accept(GanjatechModItems.SPLIFFLVL_2.get());
				tabData.accept(GanjatechModItems.SPLIFFLVL_3.get());
				tabData.accept(GanjatechModItems.TRIM.get());
				tabData.accept(GanjatechModItems.R_STRAIN_SHAKE.get());
				tabData.accept(GanjatechModItems.R_STRAIN_HQ_BUD.get());
				tabData.accept(GanjatechModItems.BAGGIE.get());
				tabData.accept(GanjatechModItems.R_STRAIN_DRIED_HQ_BUD.get());
				tabData.accept(GanjatechModItems.R_STRAIN_DRIED_BUD.get());
				tabData.accept(GanjatechModItems.R_STRAIN_BAGGED_HQ_BUD.get());
				tabData.accept(GanjatechModItems.R_STRAIN_BAGGED_BUD.get());
				tabData.accept(GanjatechModItems.RTERP_BUCKET.get());
				tabData.accept(GanjatechModItems.RAW_OIL_R_BUCKET.get());
				tabData.accept(GanjatechModItems.REF_OIL_R_BUCKET.get());
				tabData.accept(GanjatechModItems.V_CART_R.get());
				tabData.accept(GanjatechModItems.VPEN.get());
				tabData.accept(GanjatechModItems.VAPE_R.get());
			}).withSearchBar().build());
}
