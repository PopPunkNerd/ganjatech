
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ganjatech.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ganjatech.client.particle.CannabisLeafParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GanjatechModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(GanjatechModParticleTypes.CANNABIS_LEAF_PARTICLE.get(), CannabisLeafParticleParticle::provider);
	}
}
