package com.canadianwurbokid.moretinkers;

import com.canadianwurbokid.moretinkers.block.ModBlocks;
import com.canadianwurbokid.moretinkers.item.ModItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e){
		ModBlocks.init();
		ModItems.init();
	}
	
	public void init(FMLInitializationEvent e){
		
	}
	
	public void postInit(FMLPostInitializationEvent e){
		
	}
}
