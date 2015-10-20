package com.canadianwurbokid.moretinkers.item;

import com.canadianwurbokid.moretinkers.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems {

	public static Item nickelIngot;
	public static Item titaniumIngot;
	
	 public static final void init() {
		    
		 nickelIngot = new Item().setUnlocalizedName("nickelIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Main.MODID + ":nickelIngot");
		 GameRegistry.registerItem(nickelIngot, "nickelIngot");
		 
		 titaniumIngot = new Item().setUnlocalizedName("titaniumIngot").setCreativeTab(CreativeTabs.tabMaterials);
		 GameRegistry.registerItem(titaniumIngot, "titaniumIngot");
	 }
	 
}
