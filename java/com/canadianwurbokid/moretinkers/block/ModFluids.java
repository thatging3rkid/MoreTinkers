package com.canadianwurbokid.moretinkers.block;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {

	public static Fluid moltenTitanium = new MoltenTitaniumFluid();
	
	public static final void init()
	{
		FluidRegistry.registerFluid(moltenTitanium);
	}
}
