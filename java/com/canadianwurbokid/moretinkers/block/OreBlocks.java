package com.canadianwurbokid.moretinkers.block;

import com.canadianwurbokid.moretinkers.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class OreBlocks extends Block{

	
	protected OreBlocks(String unlocalizedName, Material material) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(3.0F);
        this.setResistance(15.0F);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(soundTypeMetal);
	}
	
	
}
	
	