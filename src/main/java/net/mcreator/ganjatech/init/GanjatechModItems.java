
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ganjatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ganjatech.item.WeedseedsItem;
import net.mcreator.ganjatech.item.WeedPipeItem;
import net.mcreator.ganjatech.item.VpenItem;
import net.mcreator.ganjatech.item.VapeRItem;
import net.mcreator.ganjatech.item.VCartRItem;
import net.mcreator.ganjatech.item.TrimItem;
import net.mcreator.ganjatech.item.Splifflvl3Item;
import net.mcreator.ganjatech.item.Splifflvl2Item;
import net.mcreator.ganjatech.item.SpliffItem;
import net.mcreator.ganjatech.item.SativaSpliffItem;
import net.mcreator.ganjatech.item.SativaSeedsItem;
import net.mcreator.ganjatech.item.SativaPipeItem;
import net.mcreator.ganjatech.item.SativaBudItem;
import net.mcreator.ganjatech.item.SativaBongItem;
import net.mcreator.ganjatech.item.RterpItem;
import net.mcreator.ganjatech.item.RefOilRItem;
import net.mcreator.ganjatech.item.RawOilRItem;
import net.mcreator.ganjatech.item.RStrainShakeItem;
import net.mcreator.ganjatech.item.RStrainHQBudItem;
import net.mcreator.ganjatech.item.RStrainDriedHQBudItem;
import net.mcreator.ganjatech.item.RStrainDriedBudItem;
import net.mcreator.ganjatech.item.RStrainBaggedHQBudItem;
import net.mcreator.ganjatech.item.RStrainBaggedBudItem;
import net.mcreator.ganjatech.item.MagicCookieItem;
import net.mcreator.ganjatech.item.IndicaPipeItem;
import net.mcreator.ganjatech.item.IndicaBudItem;
import net.mcreator.ganjatech.item.IndicaBongItem;
import net.mcreator.ganjatech.item.HempcreteItem;
import net.mcreator.ganjatech.item.HempStemItem;
import net.mcreator.ganjatech.item.HempSmoothieItem;
import net.mcreator.ganjatech.item.HempOutfitItem;
import net.mcreator.ganjatech.item.HempFlourItem;
import net.mcreator.ganjatech.item.HempFirestraterItem;
import net.mcreator.ganjatech.item.HempFiberItemItem;
import net.mcreator.ganjatech.item.HempBrickItem;
import net.mcreator.ganjatech.item.GoldenCannarotItem;
import net.mcreator.ganjatech.item.GoldenCannappleItem;
import net.mcreator.ganjatech.item.GanjaDiscItem;
import net.mcreator.ganjatech.item.EmptyBongItem;
import net.mcreator.ganjatech.item.CookedSeedsItem;
import net.mcreator.ganjatech.item.CannabutterItemItem;
import net.mcreator.ganjatech.item.BaggieItem;
import net.mcreator.ganjatech.GanjatechMod;

public class GanjatechModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GanjatechMod.MODID);
	public static final RegistryObject<Item> WEEDSEEDS = REGISTRY.register("weedseeds", () -> new WeedseedsItem());
	public static final RegistryObject<Item> WEEDCROP = block(GanjatechModBlocks.WEEDCROP);
	public static final RegistryObject<Item> WEEDCROP_1 = block(GanjatechModBlocks.WEEDCROP_1);
	public static final RegistryObject<Item> WEEDCROP_2 = block(GanjatechModBlocks.WEEDCROP_2);
	public static final RegistryObject<Item> WEEDCROP_3 = block(GanjatechModBlocks.WEEDCROP_3);
	public static final RegistryObject<Item> INDICASPLIFF = REGISTRY.register("indicaspliff", () -> new SpliffItem());
	public static final RegistryObject<Item> HEMP_STEM = REGISTRY.register("hemp_stem", () -> new HempStemItem());
	public static final RegistryObject<Item> HEMP_FIBER_ITEM = REGISTRY.register("hemp_fiber_item", () -> new HempFiberItemItem());
	public static final RegistryObject<Item> HEMP_BRICKS = block(GanjatechModBlocks.HEMP_BRICKS);
	public static final RegistryObject<Item> HEMP_BRICK = REGISTRY.register("hemp_brick", () -> new HempBrickItem());
	public static final RegistryObject<Item> HEMP_BALE = block(GanjatechModBlocks.HEMP_BALE);
	public static final RegistryObject<Item> INDICA_BUD = REGISTRY.register("indica_bud", () -> new IndicaBudItem());
	public static final RegistryObject<Item> HEMP_OUTFIT_HELMET = REGISTRY.register("hemp_outfit_helmet", () -> new HempOutfitItem.Helmet());
	public static final RegistryObject<Item> HEMP_OUTFIT_CHESTPLATE = REGISTRY.register("hemp_outfit_chestplate", () -> new HempOutfitItem.Chestplate());
	public static final RegistryObject<Item> HEMP_OUTFIT_LEGGINGS = REGISTRY.register("hemp_outfit_leggings", () -> new HempOutfitItem.Leggings());
	public static final RegistryObject<Item> HEMP_OUTFIT_BOOTS = REGISTRY.register("hemp_outfit_boots", () -> new HempOutfitItem.Boots());
	public static final RegistryObject<Item> EMPTY_BONG = REGISTRY.register("empty_bong", () -> new EmptyBongItem());
	public static final RegistryObject<Item> INDICA_BONG = REGISTRY.register("indica_bong", () -> new IndicaBongItem());
	public static final RegistryObject<Item> HEMP_BRICKS_SLAB = block(GanjatechModBlocks.HEMP_BRICKS_SLAB);
	public static final RegistryObject<Item> HEMP_BRICKS_STAIRS = block(GanjatechModBlocks.HEMP_BRICKS_STAIRS);
	public static final RegistryObject<Item> HEMP_BRICKS_WALL = block(GanjatechModBlocks.HEMP_BRICKS_WALL);
	public static final RegistryObject<Item> CANNABUTTER_ITEM = REGISTRY.register("cannabutter_item", () -> new CannabutterItemItem());
	public static final RegistryObject<Item> WEEDCROP_4 = block(GanjatechModBlocks.WEEDCROP_4);
	public static final RegistryObject<Item> WEEDCROP_4TOP = block(GanjatechModBlocks.WEEDCROP_4TOP);
	public static final RegistryObject<Item> WEEDCROP_5TOP = block(GanjatechModBlocks.WEEDCROP_5TOP);
	public static final RegistryObject<Item> WEEDCROP_6 = block(GanjatechModBlocks.WEEDCROP_6);
	public static final RegistryObject<Item> WEEDCROP_6TOP = block(GanjatechModBlocks.WEEDCROP_6TOP);
	public static final RegistryObject<Item> WEEDCROP_7 = block(GanjatechModBlocks.WEEDCROP_7);
	public static final RegistryObject<Item> WEEDCROP_7TOP = block(GanjatechModBlocks.WEEDCROP_7TOP);
	public static final RegistryObject<Item> WEEDCROP_5 = block(GanjatechModBlocks.WEEDCROP_5);
	public static final RegistryObject<Item> HEMPCRETE = REGISTRY.register("hempcrete", () -> new HempcreteItem());
	public static final RegistryObject<Item> HEMPCRETE_POWDER = block(GanjatechModBlocks.HEMPCRETE_POWDER);
	public static final RegistryObject<Item> HEMPCRETE_BLOCK = block(GanjatechModBlocks.HEMPCRETE_BLOCK);
	public static final RegistryObject<Item> HEMP_PLANKS_WODDY_STUFF_PLANKS = block(GanjatechModBlocks.HEMP_PLANKS_WODDY_STUFF_PLANKS);
	public static final RegistryObject<Item> HEMP_PLANKS_WODDY_STUFF_STAIRS = block(GanjatechModBlocks.HEMP_PLANKS_WODDY_STUFF_STAIRS);
	public static final RegistryObject<Item> HEMP_PLANKS_WODDY_STUFF_SLAB = block(GanjatechModBlocks.HEMP_PLANKS_WODDY_STUFF_SLAB);
	public static final RegistryObject<Item> HEMP_PLANKS_WODDY_STUFF_FENCE = block(GanjatechModBlocks.HEMP_PLANKS_WODDY_STUFF_FENCE);
	public static final RegistryObject<Item> HEMP_PLANKS_WODDY_STUFF_FENCE_GATE = block(GanjatechModBlocks.HEMP_PLANKS_WODDY_STUFF_FENCE_GATE);
	public static final RegistryObject<Item> HEMP_FLOUR = REGISTRY.register("hemp_flour", () -> new HempFlourItem());
	public static final RegistryObject<Item> HEMP_DOOR = doubleBlock(GanjatechModBlocks.HEMP_DOOR);
	public static final RegistryObject<Item> WEED_PIPE = REGISTRY.register("weed_pipe", () -> new WeedPipeItem());
	public static final RegistryObject<Item> INDICA_PIPE = REGISTRY.register("indica_pipe", () -> new IndicaPipeItem());
	public static final RegistryObject<Item> SATIVA_SEEDS = REGISTRY.register("sativa_seeds", () -> new SativaSeedsItem());
	public static final RegistryObject<Item> SATIVACROP = block(GanjatechModBlocks.SATIVACROP);
	public static final RegistryObject<Item> HEMP_TRAPDOOR = block(GanjatechModBlocks.HEMP_TRAPDOOR);
	public static final RegistryObject<Item> SATIVACROP_1 = block(GanjatechModBlocks.SATIVACROP_1);
	public static final RegistryObject<Item> SATIVACROP_2 = block(GanjatechModBlocks.SATIVACROP_2);
	public static final RegistryObject<Item> SATIVACROP_3 = block(GanjatechModBlocks.SATIVACROP_3);
	public static final RegistryObject<Item> SATIVACROP_4 = block(GanjatechModBlocks.SATIVACROP_4);
	public static final RegistryObject<Item> SATIVACROP_4TOP = block(GanjatechModBlocks.SATIVACROP_4TOP);
	public static final RegistryObject<Item> SATIVACROP_5 = block(GanjatechModBlocks.SATIVACROP_5);
	public static final RegistryObject<Item> SATIVACROP_5TOP = block(GanjatechModBlocks.SATIVACROP_5TOP);
	public static final RegistryObject<Item> SATIVACROP_6 = block(GanjatechModBlocks.SATIVACROP_6);
	public static final RegistryObject<Item> SATIVACROP_6MIDDLE = block(GanjatechModBlocks.SATIVACROP_6MIDDLE);
	public static final RegistryObject<Item> SATIVACROP_6TOP = block(GanjatechModBlocks.SATIVACROP_6TOP);
	public static final RegistryObject<Item> SATIVACROP_7 = block(GanjatechModBlocks.SATIVACROP_7);
	public static final RegistryObject<Item> SATIVACROP_7MIDDLE = block(GanjatechModBlocks.SATIVACROP_7MIDDLE);
	public static final RegistryObject<Item> SATIVACROP_7TOP = block(GanjatechModBlocks.SATIVACROP_7TOP);
	public static final RegistryObject<Item> SATIVA_BUD = REGISTRY.register("sativa_bud", () -> new SativaBudItem());
	public static final RegistryObject<Item> SATIVA_SPLIFF = REGISTRY.register("sativa_spliff", () -> new SativaSpliffItem());
	public static final RegistryObject<Item> SATIVA_BONG = REGISTRY.register("sativa_bong", () -> new SativaBongItem());
	public static final RegistryObject<Item> SATIVA_PIPE = REGISTRY.register("sativa_pipe", () -> new SativaPipeItem());
	public static final RegistryObject<Item> HEMP_FIRESTRATER = REGISTRY.register("hemp_firestrater", () -> new HempFirestraterItem());
	public static final RegistryObject<Item> GANJA_DISC = REGISTRY.register("ganja_disc", () -> new GanjaDiscItem());
	public static final RegistryObject<Item> MAGIC_COOKIE = REGISTRY.register("magic_cookie", () -> new MagicCookieItem());
	public static final RegistryObject<Item> GOLDEN_CANNAPPLE = REGISTRY.register("golden_cannapple", () -> new GoldenCannappleItem());
	public static final RegistryObject<Item> GOLDEN_CANNAROT = REGISTRY.register("golden_cannarot", () -> new GoldenCannarotItem());
	public static final RegistryObject<Item> HEMP_SMOOTHIE = REGISTRY.register("hemp_smoothie", () -> new HempSmoothieItem());
	public static final RegistryObject<Item> COOKED_SEEDS = REGISTRY.register("cooked_seeds", () -> new CookedSeedsItem());
	public static final RegistryObject<Item> SPLIFFLVL_2 = REGISTRY.register("splifflvl_2", () -> new Splifflvl2Item());
	public static final RegistryObject<Item> SPLIFFLVL_3 = REGISTRY.register("splifflvl_3", () -> new Splifflvl3Item());
	public static final RegistryObject<Item> TRIM = REGISTRY.register("trim", () -> new TrimItem());
	public static final RegistryObject<Item> R_STRAIN_SHAKE = REGISTRY.register("r_strain_shake", () -> new RStrainShakeItem());
	public static final RegistryObject<Item> R_STRAIN_HQ_BUD = REGISTRY.register("r_strain_hq_bud", () -> new RStrainHQBudItem());
	public static final RegistryObject<Item> BAGGIE = REGISTRY.register("baggie", () -> new BaggieItem());
	public static final RegistryObject<Item> R_STRAIN_DRIED_HQ_BUD = REGISTRY.register("r_strain_dried_hq_bud", () -> new RStrainDriedHQBudItem());
	public static final RegistryObject<Item> R_STRAIN_DRIED_BUD = REGISTRY.register("r_strain_dried_bud", () -> new RStrainDriedBudItem());
	public static final RegistryObject<Item> R_STRAIN_BAGGED_HQ_BUD = REGISTRY.register("r_strain_bagged_hq_bud", () -> new RStrainBaggedHQBudItem());
	public static final RegistryObject<Item> R_STRAIN_BAGGED_BUD = REGISTRY.register("r_strain_bagged_bud", () -> new RStrainBaggedBudItem());
	public static final RegistryObject<Item> RTERP_BUCKET = REGISTRY.register("rterp_bucket", () -> new RterpItem());
	public static final RegistryObject<Item> RAW_OIL_R_BUCKET = REGISTRY.register("raw_oil_r_bucket", () -> new RawOilRItem());
	public static final RegistryObject<Item> REF_OIL_R_BUCKET = REGISTRY.register("ref_oil_r_bucket", () -> new RefOilRItem());
	public static final RegistryObject<Item> V_CART_R = REGISTRY.register("v_cart_r", () -> new VCartRItem());
	public static final RegistryObject<Item> VPEN = REGISTRY.register("vpen", () -> new VpenItem());
	public static final RegistryObject<Item> VAPE_R = REGISTRY.register("vape_r", () -> new VapeRItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
