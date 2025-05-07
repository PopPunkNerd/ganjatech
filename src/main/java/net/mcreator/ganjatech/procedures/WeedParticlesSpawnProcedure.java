package net.mcreator.ganjatech.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;

public class WeedParticlesSpawnProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 12, 12, 12), e -> true).isEmpty();
	}
}
