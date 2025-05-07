
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

public abstract class RefOilRFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> GanjatechModFluidTypes.REF_OIL_R_TYPE.get(), () -> GanjatechModFluids.REF_OIL_R.get(), () -> GanjatechModFluids.FLOWING_REF_OIL_R.get())
			.explosionResistance(100f).bucket(() -> GanjatechModItems.REF_OIL_R_BUCKET.get()).block(() -> (LiquidBlock) GanjatechModBlocks.REF_OIL_R.get());

	private RefOilRFluid() {
		super(PROPERTIES);
	}

	public static class Source extends RefOilRFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends RefOilRFluid {
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
