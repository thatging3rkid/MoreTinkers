package com.canadianwurbokid.crafting;

import com.canadianwurbokid.moretinkers.block.ModBlocks;
import com.canadianwurbokid.moretinkers.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class ModCrafting {
	public static final void init(){
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.nickelBlock), "###", "###", "###", '#', ModItems.nickelIngot);
		
		GameRegistry.addSmelting(ModBlocks.nickelOre, new ItemStack(ModItems.nickelIngot), 0.7F);
	}
}
