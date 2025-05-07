
package net.mcreator.ganjatech.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.ganjatech.entity.WeedmanTestEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class WeedmanTestRenderer extends MobRenderer<WeedmanTestEntity, VillagerModel<WeedmanTestEntity>> {
	public WeedmanTestRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel<WeedmanTestEntity>(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	protected void scale(WeedmanTestEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeedmanTestEntity entity) {
		return new ResourceLocation("ganjatech:textures/entities/villager.png");
	}
}
