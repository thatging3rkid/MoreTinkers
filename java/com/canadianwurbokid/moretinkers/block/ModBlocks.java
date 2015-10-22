package com.canadianwurbokid.moretinkers.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

	public static Block nickelOre;
	public static Block nickelBlock;
	
	public static Block titaniumOre;
	public static Block titaniumBlock;

    public static final void init() {

    	GameRegistry.registerBlock(nickelOre = new NickelOre("nickelOre",Material.rock),"nickelOre");
    	GameRegistry.registerBlock(nickelBlock = new NickelBlock("nickelBlock",Material.iron),"nickelBlock");
    	GameRegistry.registerBlock(titaniumOre = new TitaniumOre("titaniumOre",Material.rock), "titaniumOre");
    	GameRegistry.registerBlock(titaniumBlock = new TitaniumBlock("titaniumBlock",Material.iron), "titaniumBlock");
    }
}
