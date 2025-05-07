package net.mcreator.ganjatech.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.ganjatech.init.GanjatechModBlocks;

public class SativaUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randomGrowth = 0;
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GanjatechModBlocks.SATIVACROP_4.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GanjatechModBlocks.SATIVACROP_5.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GanjatechModBlocks.SATIVACROP_6.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GanjatechModBlocks.SATIVACROP_7.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GanjatechModBlocks.SATIVACROP_6MIDDLE.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GanjatechModBlocks.SATIVACROP_7MIDDLE.get())) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP_1.get()
					|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP_2.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP_3.get()
					|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP_4.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP_6.get()) {
				GrowingCropBlowingByExplosionProcedure.execute(world, x, y, z);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP_7.get()) {
				GrownCropByExplosionProcedure.execute(world, x, y, z);
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.RED_SAND
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GRAVEL || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.ANVIL
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CHIPPED_ANVIL || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.DAMAGED_ANVIL
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WHITE_CONCRETE_POWDER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.ORANGE_CONCRETE_POWDER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.MAGENTA_CONCRETE_POWDER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LIGHT_BLUE_CONCRETE_POWDER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.YELLOW_CONCRETE_POWDER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LIME_CONCRETE_POWDER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.PINK_CONCRETE_POWDER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GRAY_CONCRETE_POWDER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LIGHT_GRAY_CONCRETE_POWDER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CYAN_CONCRETE_POWDER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.PURPLE_CONCRETE_POWDER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.BLUE_CONCRETE_POWDER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.BROWN_CONCRETE_POWDER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GREEN_CONCRETE_POWDER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.RED_CONCRETE_POWDER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.BLACK_CONCRETE_POWDER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == GanjatechModBlocks.HEMPCRETE_POWDER.get()) {
			{
				BlockPos _pos = BlockPos.containing(x, y + 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		} else if (!world.isClientSide() && world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) > 7) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("growthTimer", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "growthTimer") + 0.05));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "growthTimer") >= 600) {
				randomGrowth = Math.random();
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP.get()) {
					if (randomGrowth >= 0.66) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_2.get().defaultBlockState(), 3);
					} else if (randomGrowth >= 0.33) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_1.get().defaultBlockState(), 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("growthTimer", 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP_1.get()) {
					if (randomGrowth >= 0.66) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_3.get().defaultBlockState(), 3);
					} else if (randomGrowth >= 0.33) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_2.get().defaultBlockState(), 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("growthTimer", 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP_2.get()) {
					if (randomGrowth >= 0.66) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_4.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), GanjatechModBlocks.SATIVACROP_4TOP.get().defaultBlockState(), 3);
					} else if (randomGrowth >= 0.33) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_3.get().defaultBlockState(), 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("growthTimer", 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP_3.get()) {
					if (randomGrowth >= 0.66) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_5.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), GanjatechModBlocks.SATIVACROP_5TOP.get().defaultBlockState(), 3);
					} else if (randomGrowth >= 0.33) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_4.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), GanjatechModBlocks.SATIVACROP_4TOP.get().defaultBlockState(), 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("growthTimer", 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP_4.get()) {
					if (randomGrowth >= 0.66) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_6.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), GanjatechModBlocks.SATIVACROP_6MIDDLE.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 2, z), GanjatechModBlocks.SATIVACROP_6TOP.get().defaultBlockState(), 3);
					} else if (randomGrowth >= 0.33) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_5.get().defaultBlockState(), 3);
						if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x, y + 1, z), GanjatechModBlocks.SATIVACROP_5TOP.get().defaultBlockState(), 3);
						}
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("growthTimer", 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP_5.get()) {
					if (randomGrowth >= 0.66) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_7.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), GanjatechModBlocks.SATIVACROP_7MIDDLE.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 2, z), GanjatechModBlocks.SATIVACROP_7TOP.get().defaultBlockState(), 3);
					} else if (randomGrowth >= 0.33) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_6.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), GanjatechModBlocks.SATIVACROP_6MIDDLE.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 2, z), GanjatechModBlocks.SATIVACROP_6TOP.get().defaultBlockState(), 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("growthTimer", 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GanjatechModBlocks.SATIVACROP_6.get()) {
					if (randomGrowth >= 0.5) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), GanjatechModBlocks.SATIVACROP_7.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z), GanjatechModBlocks.SATIVACROP_7MIDDLE.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 2, z), GanjatechModBlocks.SATIVACROP_7TOP.get().defaultBlockState(), 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("growthTimer", 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}
