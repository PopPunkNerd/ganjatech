package net.mcreator.ganjatech.procedures;

import net.minecraft.world.entity.Entity;

public class StartTimerGCProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("StartTimerGC", true);
		entity.getPersistentData().putDouble("TimerGC", 0);
	}
}
