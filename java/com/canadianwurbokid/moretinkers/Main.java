package com.canadianwurbokid.moretinkers;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)



public class Main {

	public static final String MODID = "moretinkers";
	public static final String MODNAME = "MoreTinkers";
	public static final String VERSION = "1.0.0";
	
	@Instance
	public static Main instance = new Main();
	
	@SidedProxy(clientSide="com.canadianwurbokid.moretinkers.ClientProxy", serverSide="com.canadianwurbokid.moretinkers.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e){
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		proxy.postInit(e);
	}
}
