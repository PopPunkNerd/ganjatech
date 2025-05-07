
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

public abstract class RterpFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> GanjatechModFluidTypes.RTERP_TYPE.get(), () -> GanjatechModFluids.RTERP.get(), () -> GanjatechModFluids.FLOWING_RTERP.get())
			.explosionResistance(100f).bucket(() -> GanjatechModItems.RTERP_BUCKET.get()).block(() -> (LiquidBlock) GanjatechModBlocks.RTERP.get());

	private RterpFluid() {
		super(PROPERTIES);
	}

	public static class Source extends RterpFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends RterpFluid {
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
