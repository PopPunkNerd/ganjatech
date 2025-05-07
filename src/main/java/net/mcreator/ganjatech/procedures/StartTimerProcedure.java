package net.mcreator.ganjatech.procedures;

import net.minecraft.world.entity.Entity;

public class StartTimerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("StartTimer", true);
		entity.getPersistentData().putDouble("Timer", 0);
	}
}
