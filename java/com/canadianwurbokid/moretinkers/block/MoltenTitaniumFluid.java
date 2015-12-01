package com.canadianwurbokid.moretinkers.block;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class MoltenTitaniumFluid extends Fluid{

	Fluid lava = FluidRegistry.getFluid("lava");
	public MoltenTitaniumFluid() {
		super("molten_titanium");
		super.setUnlocalizedName("molten_titanium");
		super.setBlock(lava.getBlock());
		super.setLuminosity(lava.getLuminosity());
		super.setDensity(lava.getDensity());
		super.setTemperature(lava.getTemperature());
		super.setViscosity(lava.getViscosity());
		//super.setBlock(Blocks.lava);
		//super.setIcons(commonIcon)
		// TODO Auto-generated constructor stub 
	}

	
}
