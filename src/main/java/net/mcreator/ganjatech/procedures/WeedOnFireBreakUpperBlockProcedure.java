package net.mcreator.ganjatech.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class WeedOnFireBreakUpperBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FIRE
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SOUL_FIRE) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
