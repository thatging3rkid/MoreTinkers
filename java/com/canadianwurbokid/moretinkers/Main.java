package com.canadianwurbokid.moretinkers;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

	

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

	   public static final String MODID = "moretinkers";
	   public static final String MODNAME = "More Tinkers";
	   public static final String VERSION = "1.0.0";
	       
	   @Instance
	   public static Main instance = new Main();
	        
	     
	   @EventHandler
	   public void preInit(FMLPreInitializationEvent e) {
	                
	   }
	        
	   @EventHandler
	   public void init(FMLInitializationEvent e) {
	                
	   }
	        
	   @EventHandler
	   public void postInit(FMLPostInitializationEvent e) {
	                
	   }
}