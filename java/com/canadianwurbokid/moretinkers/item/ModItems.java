package com.canadianwurbokid.moretinkers.item;

import com.canadianwurbokid.moretinkers.CreativeTabMod;
import com.canadianwurbokid.moretinkers.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.client.TConstructClientRegistry;
import tconstruct.library.crafting.PatternBuilder;
import tconstruct.tools.TinkerTools.MaterialID;
import tconstruct.tools.TinkerTools;

public final class ModItems {

	public static Item nickelIngot;
	public static Item titaniumIngot;
	
	 public static final void init() {
		    
		 nickelIngot = new Item().setUnlocalizedName("nickelIngot").setCreativeTab(CreativeTabMod.moreTinkers).setTextureName(Main.MODID + ":nickelIngot");
		 GameRegistry.registerItem(nickelIngot, "nickelIngot");
		 
		 titaniumIngot = new Item().setUnlocalizedName("titaniumIngot").setCreativeTab(CreativeTabMod.moreTinkers).setTextureName(Main.MODID + ":titaniumIngot");
		 GameRegistry.registerItem(titaniumIngot, "titaniumIngot");
		
		// Adding Nickel to Tinkers (attempt 1)
		// Tool Materials: id, name, harvestlevel, durability, speed, damage, handlemodifier, reinforced, shoddy, style color, primary color for block use
		TConstructRegistry.addToolMaterial(61, "Nickel", "material.nickel", 2, 230, 800, 1, 1.0F, 0, 0f, "§F", 0xBDBDBD);
		TConstructRegistry.addToolMaterial(62, "Titanium", "material.titanium", 3, 330, 900, 2, 1.2F, 0, 0f, "§F", 0xEDEDF7);
		
		TConstructClientRegistry.addMaterialRenderMapping(61, "moretinkers\\textures\\nickel", "nickel", false);
		TConstructClientRegistry.addMaterialRenderMapping(62, "moretinkers\\textures\\titanium", "titanium", false);
		
		TConstructRegistry.addDefaultToolPartMaterial(61);
		TConstructRegistry.addDefaultShardMaterial(61);
		TConstructRegistry.addDefaultToolPartMaterial(62);
		TConstructRegistry.addDefaultShardMaterial(62);
		//PatternBuilder pb = PatternBuilder.instance;
		//pb.registerMaterialSet("Nickel", new ItemStack(TinkerTools.toolShard, 1, 61), new ItemStack(TinkerTools.toolRod, 1, 61), 61);	 



	}
	 
}
