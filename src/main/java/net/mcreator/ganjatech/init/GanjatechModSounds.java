
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ganjatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ganjatech.GanjatechMod;

public class GanjatechModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GanjatechMod.MODID);
	public static final RegistryObject<SoundEvent> SMOKING = REGISTRY.register("smoking", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ganjatech", "smoking")));
	public static final RegistryObject<SoundEvent> BONGHIT = REGISTRY.register("bonghit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ganjatech", "bonghit")));
	public static final RegistryObject<SoundEvent> RANDOMCOUGHING = REGISTRY.register("randomcoughing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ganjatech", "randomcoughing")));
	public static final RegistryObject<SoundEvent> GANJADISC = REGISTRY.register("ganjadisc", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ganjatech", "ganjadisc")));
}
