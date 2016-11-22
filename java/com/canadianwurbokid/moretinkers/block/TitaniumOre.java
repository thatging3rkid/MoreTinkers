package com.canadianwurbokid.moretinkers.block;

import com.canadianwurbokid.moretinkers.CreativeTabMod;
import com.canadianwurbokid.moretinkers.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;



public class TitaniumOre extends Block{

	
	protected TitaniumOre(String unlocalizedName, Material material) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabMod.moreTinkers);
        this.setHardness(3.0F);
        this.setResistance(15.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeMetal);
	}
	
}