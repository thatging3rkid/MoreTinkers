package com.canadianwurbokid.moretinkers.world;

import java.util.Random;

import com.canadianwurbokid.moretinkers.block.ModBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ModWorldGen implements IWorldGenerator{

	private WorldGenerator gen_nickelOre;//Generates Nickel Ore
	private WorldGenerator gen_titaniumOre;//Generates Titanium Ore
	
	public ModWorldGen() {
	    this.gen_nickelOre = new WorldGenMinable(ModBlocks.nickelOre, 20);
	    this.gen_titaniumOre = new WorldGenMinable(ModBlocks.titaniumOre, 8);
	}
	
	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
	    case 0: //Overworld
	    	this.runGenerator(this.gen_nickelOre, world, random, chunkX, chunkZ, 4, 0, 64);
	    	this.runGenerator(this.gen_titaniumOre, world, random, chunkX, chunkZ, 5, 0, 64);
	    	break;
		
	    case -1: //Nether

	    	break;
	    	
	    case 1: //End

	        break;
		}
    }
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, x, y, z);
	    }
	}
}
