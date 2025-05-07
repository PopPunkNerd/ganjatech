
package net.mcreator.ganjatech.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.ganjatech.init.GanjatechModItems;
import net.mcreator.ganjatech.init.GanjatechModFluids;
import net.mcreator.ganjatech.init.GanjatechModFluidTypes;
import net.mcreator.ganjatech.init.GanjatechModBlocks;

public abstract class RawOilRFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> GanjatechModFluidTypes.RAW_OIL_R_TYPE.get(), () -> GanjatechModFluids.RAW_OIL_R.get(), () -> GanjatechModFluids.FLOWING_RAW_OIL_R.get())
			.explosionResistance(100f).bucket(() -> GanjatechModItems.RAW_OIL_R_BUCKET.get()).block(() -> (LiquidBlock) GanjatechModBlocks.RAW_OIL_R.get());

	private RawOilRFluid() {
		super(PROPERTIES);
	}

	public static class Source extends RawOilRFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends RawOilRFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
