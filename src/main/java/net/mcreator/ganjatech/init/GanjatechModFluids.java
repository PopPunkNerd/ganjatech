
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ganjatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.ganjatech.fluid.RterpFluid;
import net.mcreator.ganjatech.fluid.RefOilRFluid;
import net.mcreator.ganjatech.fluid.RawOilRFluid;
import net.mcreator.ganjatech.GanjatechMod;

public class GanjatechModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, GanjatechMod.MODID);
	public static final RegistryObject<FlowingFluid> RTERP = REGISTRY.register("rterp", () -> new RterpFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_RTERP = REGISTRY.register("flowing_rterp", () -> new RterpFluid.Flowing());
	public static final RegistryObject<FlowingFluid> RAW_OIL_R = REGISTRY.register("raw_oil_r", () -> new RawOilRFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_RAW_OIL_R = REGISTRY.register("flowing_raw_oil_r", () -> new RawOilRFluid.Flowing());
	public static final RegistryObject<FlowingFluid> REF_OIL_R = REGISTRY.register("ref_oil_r", () -> new RefOilRFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_REF_OIL_R = REGISTRY.register("flowing_ref_oil_r", () -> new RefOilRFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(RTERP.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_RTERP.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(RAW_OIL_R.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_RAW_OIL_R.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(REF_OIL_R.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_REF_OIL_R.get(), RenderType.translucent());
		}
	}
}
