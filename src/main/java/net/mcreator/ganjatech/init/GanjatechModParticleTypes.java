
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ganjatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.ganjatech.GanjatechMod;

public class GanjatechModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, GanjatechMod.MODID);
	public static final RegistryObject<SimpleParticleType> CANNABIS_LEAF_PARTICLE = REGISTRY.register("cannabis_leaf_particle", () -> new SimpleParticleType(false));
}
