
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ganjatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.ganjatech.block.entity.WeedcropBlockEntity;
import net.mcreator.ganjatech.block.entity.Weedcrop7topBlockEntity;
import net.mcreator.ganjatech.block.entity.Weedcrop7BlockEntity;
import net.mcreator.ganjatech.block.entity.Weedcrop6topBlockEntity;
import net.mcreator.ganjatech.block.entity.Weedcrop6BlockEntity;
import net.mcreator.ganjatech.block.entity.Weedcrop5topBlockEntity;
import net.mcreator.ganjatech.block.entity.Weedcrop5BlockEntity;
import net.mcreator.ganjatech.block.entity.Weedcrop4topBlockEntity;
import net.mcreator.ganjatech.block.entity.Weedcrop4BlockEntity;
import net.mcreator.ganjatech.block.entity.Weedcrop3BlockEntity;
import net.mcreator.ganjatech.block.entity.Weedcrop2BlockEntity;
import net.mcreator.ganjatech.block.entity.Weedcrop1BlockEntity;
import net.mcreator.ganjatech.block.entity.SativacropBlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop7topBlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop7middleBlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop7BlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop6topBlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop6middleBlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop6BlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop5topBlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop5BlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop4topBlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop4BlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop3BlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop2BlockEntity;
import net.mcreator.ganjatech.block.entity.Sativacrop1BlockEntity;
import net.mcreator.ganjatech.GanjatechMod;

public class GanjatechModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GanjatechMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> WEEDCROP = register("weedcrop", GanjatechModBlocks.WEEDCROP, WeedcropBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEEDCROP_1 = register("weedcrop_1", GanjatechModBlocks.WEEDCROP_1, Weedcrop1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEEDCROP_2 = register("weedcrop_2", GanjatechModBlocks.WEEDCROP_2, Weedcrop2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEEDCROP_3 = register("weedcrop_3", GanjatechModBlocks.WEEDCROP_3, Weedcrop3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEEDCROP_4 = register("weedcrop_4", GanjatechModBlocks.WEEDCROP_4, Weedcrop4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEEDCROP_4TOP = register("weedcrop_4top", GanjatechModBlocks.WEEDCROP_4TOP, Weedcrop4topBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEEDCROP_5TOP = register("weedcrop_5top", GanjatechModBlocks.WEEDCROP_5TOP, Weedcrop5topBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEEDCROP_6 = register("weedcrop_6", GanjatechModBlocks.WEEDCROP_6, Weedcrop6BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEEDCROP_6TOP = register("weedcrop_6top", GanjatechModBlocks.WEEDCROP_6TOP, Weedcrop6topBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEEDCROP_7 = register("weedcrop_7", GanjatechModBlocks.WEEDCROP_7, Weedcrop7BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEEDCROP_7TOP = register("weedcrop_7top", GanjatechModBlocks.WEEDCROP_7TOP, Weedcrop7topBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEEDCROP_5 = register("weedcrop_5", GanjatechModBlocks.WEEDCROP_5, Weedcrop5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP = register("sativacrop", GanjatechModBlocks.SATIVACROP, SativacropBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_1 = register("sativacrop_1", GanjatechModBlocks.SATIVACROP_1, Sativacrop1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_2 = register("sativacrop_2", GanjatechModBlocks.SATIVACROP_2, Sativacrop2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_3 = register("sativacrop_3", GanjatechModBlocks.SATIVACROP_3, Sativacrop3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_4 = register("sativacrop_4", GanjatechModBlocks.SATIVACROP_4, Sativacrop4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_4TOP = register("sativacrop_4top", GanjatechModBlocks.SATIVACROP_4TOP, Sativacrop4topBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_5 = register("sativacrop_5", GanjatechModBlocks.SATIVACROP_5, Sativacrop5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_5TOP = register("sativacrop_5top", GanjatechModBlocks.SATIVACROP_5TOP, Sativacrop5topBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_6 = register("sativacrop_6", GanjatechModBlocks.SATIVACROP_6, Sativacrop6BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_6MIDDLE = register("sativacrop_6middle", GanjatechModBlocks.SATIVACROP_6MIDDLE, Sativacrop6middleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_6TOP = register("sativacrop_6top", GanjatechModBlocks.SATIVACROP_6TOP, Sativacrop6topBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_7 = register("sativacrop_7", GanjatechModBlocks.SATIVACROP_7, Sativacrop7BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_7MIDDLE = register("sativacrop_7middle", GanjatechModBlocks.SATIVACROP_7MIDDLE, Sativacrop7middleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SATIVACROP_7TOP = register("sativacrop_7top", GanjatechModBlocks.SATIVACROP_7TOP, Sativacrop7topBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
