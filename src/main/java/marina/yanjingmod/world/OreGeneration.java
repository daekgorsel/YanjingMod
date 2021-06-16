package marina.yanjingmod.world;

import marina.yanjingmod.config.OreGenConfig;
import marina.yanjingmod.init.YanjingBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
	public static void setupOreGeneration() 
	{ //register
		for(Biome biome : ForgeRegistries.BIOMES)
		{
		//	biome.addFeature(Decoration.UNDERGROUND_ORES, new ConfiguredFeature<OreFeatureConfig>(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, YanjingBlocks.jade_ore.getDefaultState(), OreGenConfig.yanjing_chance.get())));
			
			//biome.addFeature(Decoration.UNDERGROUND_ORES, new ConfiguredFeature<OreFeatureConfig>(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, YanjingBlocks.blood_ore.getDefaultState(), OreGenConfig.yanjing_chance.get())));
				
			
			biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE,  YanjingBlocks.jade_ore.getDefaultState(), OreGenConfig.yanjing_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(100, 20, 0, 200)));
			biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE,  YanjingBlocks.demon_gold_ore.getDefaultState(),  OreGenConfig.yanjing_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(100, 20, 0, 200)));

		}
		
		//Biome biome = Biomes.BEACH; //sertain biome
		//biome.addFeature(decorationStage, featureIn);
	}
}
