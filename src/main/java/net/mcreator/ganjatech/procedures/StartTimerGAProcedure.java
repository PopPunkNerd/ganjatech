package net.mcreator.ganjatech.procedures;

import net.minecraft.world.entity.Entity;

public class StartTimerGAProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("StartTimerGA", true);
		entity.getPersistentData().putDouble("TimerGA", 0);
	}
}
