package net.mcreator.ganjatech.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.ganjatech.init.GanjatechModItems;
import net.mcreator.ganjatech.init.GanjatechModBlocks;

public class SeedsRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == GanjatechModItems.WEEDSEEDS.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FARMLAND
				&& ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR)
				&& ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.VOID_AIR
						|| (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.CAVE_AIR)) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), GanjatechModBlocks.WEEDCROP.get().defaultBlockState(), 3);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
