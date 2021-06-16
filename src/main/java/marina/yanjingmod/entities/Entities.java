package marina.yanjingmod.entities;

import marina.yanjingmod.ModRegistries;
import marina.yanjingmod.YanjingMod;
import marina.yanjingmod.init.YanjingItems;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraftforge.event.RegistryEvent;

public class Entities {
	
	public static EntityType<?> model_entity = EntityType.Builder.create(ModelEntity::new, EntityClassification.CREATURE).build(ModRegistries.MODID + ":model_entity").setRegistryName(ModRegistries.location("model_entity"));
	public static EntityType<?> jade_demon_entity = EntityType.Builder.create(JadeDemonEntity::new, EntityClassification.CREATURE).build(ModRegistries.MODID + ":jade_demon_entity").setRegistryName(ModRegistries.location("jade_demon_entity"));
	
	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(
			YanjingItems.model_entity_egg = registerEntitySpawnEgg(model_entity, 0x7184a6, 0xc4c8cf, "model_entity_egg"),
			YanjingItems.jade_demon_egg = registerEntitySpawnEgg(jade_demon_entity, 0x7114a6, 0xc468cf, "jade_demon_egg")

		
		);
		
	}
	
	public static void registerEntityWorldSpawns()
	{
		registerEntityWorldSpawn(model_entity, 100, 1, 10, Biomes.PLAINS, Biomes.BEACH, Biomes.JUNGLE, Biomes.DESERT, Biomes.OCEAN, Biomes.SWAMP, Biomes.FOREST);
		registerEntityWorldSpawn(jade_demon_entity, 100, 1, 10, Biomes.PLAINS, Biomes.BEACH, Biomes.JUNGLE, Biomes.DESERT, Biomes.OCEAN, Biomes.SWAMP, Biomes.FOREST);

	}
	
	public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
	{
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(YanjingMod.YANJINGTAB));
		item.setRegistryName(ModRegistries.location(name));
		return item;
	}
	
	public static void registerEntityWorldSpawn(EntityType<?> entity, int weight, int min_size, int max_size, Biome... biomes)
	{
		for(Biome biome : biomes)
		{
			if(biome != null)
			{
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, weight, min_size, max_size));
			}
		}
	}
}
