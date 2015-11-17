package com.canadianwurbokid.moretinkers.block;

import com.canadianwurbokid.moretinkers.CreativeTabMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public final class ModBlocks {

	public static Block nickelOre;
	public static Block nickelBlock;
	
	public static Block titaniumOre;
	public static Block titaniumBlock;
	public static Fluid moltenTitanium = new Fluid("liquid_titanium");
	public static Block liquidTitanium;

    public static final void init() {

    	GameRegistry.registerBlock(nickelOre = new NickelOre("ore_nickel",Material.rock),"nickelOre");
    	GameRegistry.registerBlock(nickelBlock = new NickelBlock("nickelBlock",Material.iron),"nickelBlock");
    	GameRegistry.registerBlock(titaniumOre = new TitaniumOre("ore_titanium",Material.rock), "titaniumOre");
    	GameRegistry.registerBlock(titaniumBlock = new TitaniumBlock("titaniumBlock",Material.iron), "titaniumBlock");
    	FluidRegistry.registerFluid(moltenTitanium);
    	GameRegistry.registerBlock(liquidTitanium = new TitaniumFluid(moltenTitanium, Material.lava), "liquid_titanium").setCreativeTab(CreativeTabMod.moreTinkers);
    }
}
