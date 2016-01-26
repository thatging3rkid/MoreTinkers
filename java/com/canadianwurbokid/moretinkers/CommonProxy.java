package com.canadianwurbokid.moretinkers;

import com.canadianwurbokid.crafting.ModCrafting;
import com.canadianwurbokid.moretinkers.block.ModBlocks;
import com.canadianwurbokid.moretinkers.block.ModFluids;
import com.canadianwurbokid.moretinkers.item.ModItems;
import com.canadianwurbokid.moretinkers.world.ModWorldGen;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e){
		ModFluids.init();
		ModBlocks.init();
		ModItems.init();
	}
	
	public void init(FMLInitializationEvent e){
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
		ModCrafting.init();
		
	}
	
	public void postInit(FMLPostInitializationEvent e){
		
	}
}
