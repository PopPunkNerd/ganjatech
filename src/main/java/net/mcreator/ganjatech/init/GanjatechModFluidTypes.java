
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ganjatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.ganjatech.fluid.types.RterpFluidType;
import net.mcreator.ganjatech.fluid.types.RefOilRFluidType;
import net.mcreator.ganjatech.fluid.types.RawOilRFluidType;
import net.mcreator.ganjatech.GanjatechMod;

public class GanjatechModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, GanjatechMod.MODID);
	public static final RegistryObject<FluidType> RTERP_TYPE = REGISTRY.register("rterp", () -> new RterpFluidType());
	public static final RegistryObject<FluidType> RAW_OIL_R_TYPE = REGISTRY.register("raw_oil_r", () -> new RawOilRFluidType());
	public static final RegistryObject<FluidType> REF_OIL_R_TYPE = REGISTRY.register("ref_oil_r", () -> new RefOilRFluidType());
}
