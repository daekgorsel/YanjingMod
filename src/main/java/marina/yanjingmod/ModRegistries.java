package marina.yanjingmod;

import org.apache.logging.log4j.Logger;

import marina.yanjingmod.entities.Entities;
import marina.yanjingmod.init.YanjingBlocks;
import marina.yanjingmod.init.YanjingItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistries {
	public static final ItemGroup YANJINGTAB = YanjingMod.YANJINGTAB;
	public static final Logger LOGGER = YanjingMod.LOGGER;
	public static final String MODID = YanjingMod.MODID;


		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			event.getRegistry().registerAll(
						//EYES
						YanjingItems.eye_green = new Item(new Item.Properties().group(YANJINGTAB)).setRegistryName(location("eye_green")),
						YanjingItems.eye_blue = new Item(new Item.Properties().group(YANJINGTAB)).setRegistryName(location("eye_blue")),
						YanjingItems.eye_red = new Item(new Item.Properties().group(YANJINGTAB)).setRegistryName(location("eye_red")),
						
						//INGOT
						YanjingItems.jade_ingot = new Item(new Item.Properties().group(YANJINGTAB)).setRegistryName(location("jade_ingot")),
						YanjingItems.blood_ingot = new Item(new Item.Properties().group(YANJINGTAB)).setRegistryName(location("blood_ingot")),
						YanjingItems.demon_gold_ingot = new Item(new Item.Properties().group(YANJINGTAB)).setRegistryName(location("demon_gold_ingot")),
						YanjingItems.sky_tear_ingot = new Item(new Item.Properties().group(YANJINGTAB)).setRegistryName(location("sky_tear_ingot")),
						YanjingItems.abhor_ingot = new Item(new Item.Properties().group(YANJINGTAB)).setRegistryName(location("abhor_ingot")),
									
						//BLOCK_ITEM
						YanjingItems.jade_block = new BlockItem(YanjingBlocks.jade_block, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.jade_block.getRegistryName()),
						YanjingItems.blood_block = new BlockItem(YanjingBlocks.blood_block, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.blood_block.getRegistryName()),
						YanjingItems.sky_tear_block = new BlockItem(YanjingBlocks.sky_tear_block, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.sky_tear_block.getRegistryName()),
						YanjingItems.demon_gold_block = new BlockItem(YanjingBlocks.demon_gold_block, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.demon_gold_block.getRegistryName()),
						YanjingItems.abhor_block = new BlockItem(YanjingBlocks.abhor_block, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.abhor_block.getRegistryName()),
								
						
						YanjingItems.model_block = new BlockItem(YanjingBlocks.model_block, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.model_block.getRegistryName()),
						YanjingItems.model_block2 = new BlockItem(YanjingBlocks.model_block2, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.model_block2.getRegistryName()),
											
						YanjingItems.jade_block_f = new BlockItem(YanjingBlocks.jade_block_f, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.jade_block_f.getRegistryName()),
						YanjingItems.blood_block_f = new BlockItem(YanjingBlocks.blood_block_f, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.blood_block_f.getRegistryName()),
						YanjingItems.sky_tear_block_f = new BlockItem(YanjingBlocks.sky_tear_block_f, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.sky_tear_block_f.getRegistryName()),
						YanjingItems.demon_gold_block_f = new BlockItem(YanjingBlocks.demon_gold_block_f, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.demon_gold_block_f.getRegistryName()),
						YanjingItems.abhor_block_f = new BlockItem(YanjingBlocks.abhor_block_f, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.abhor_block_f.getRegistryName()),

						
						//ORE
						YanjingItems.jade_ore = new BlockItem(YanjingBlocks.jade_ore, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.jade_ore.getRegistryName()),
						YanjingItems.demon_gold_ore = new BlockItem(YanjingBlocks.demon_gold_ore, new Item.Properties().group(YANJINGTAB)).setRegistryName(YanjingBlocks.demon_gold_ore.getRegistryName())
						
					);
			
			Entities.registerEntitySpawnEggs(event);
				
			LOGGER.info("Items regostered");
		}
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event)
		{
			event.getRegistry().registerAll(
						YanjingBlocks.jade_block = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).lightValue(14).sound(SoundType.STONE)).setRegistryName(location("jade_block")),		
						YanjingBlocks.blood_block = new Block(Block.Properties.create(Material.ICE).hardnessAndResistance(2.0f, 3.0f).lightValue(14).sound(SoundType.GLASS)).setRegistryName(location("blood_block")),		
						YanjingBlocks.sky_tear_block = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2.0f, 3.0f).lightValue(14).sound(SoundType.CLOTH)).setRegistryName(location("sky_tear_block")),		
						YanjingBlocks.demon_gold_block = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2.0f, 3.0f).lightValue(14).sound(SoundType.CROP)).setRegistryName(location("demon_gold_block")),								
						YanjingBlocks.abhor_block = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2.0f, 3.0f).lightValue(14).sound(SoundType.CROP)).setRegistryName(location("abhor_block")),								
								
						
						YanjingBlocks.model_block = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2.0f, 3.0f).lightValue(14).sound(SoundType.CROP)).setRegistryName(location("model_block")),								
						YanjingBlocks.model_block2 = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2.0f, 3.0f).lightValue(14).sound(SoundType.CROP)).setRegistryName(location("model_block2")),								
									
						YanjingBlocks.jade_block_f = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).lightValue(14).sound(SoundType.STONE)).setRegistryName(location("jade_block_f")),		
						YanjingBlocks.blood_block_f = new Block(Block.Properties.create(Material.ICE).hardnessAndResistance(2.0f, 3.0f).lightValue(14).sound(SoundType.GLASS)).setRegistryName(location("blood_block_f")),		
						YanjingBlocks.sky_tear_block_f = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2.0f, 3.0f).lightValue(14).sound(SoundType.CLOTH)).setRegistryName(location("sky_tear_block_f")),		
						YanjingBlocks.demon_gold_block_f = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2.0f, 3.0f).lightValue(14).sound(SoundType.CROP)).setRegistryName(location("demon_gold_block_f")),								
						YanjingBlocks.abhor_block_f = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2.0f, 3.0f).lightValue(14).sound(SoundType.CROP)).setRegistryName(location("abhor_block_f")),								
								
						
						YanjingBlocks.jade_ore = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2.0f, 5.0f).lightValue(14).sound(SoundType.STONE)).setRegistryName(location("jade_ore")),		
						//YanjingBlocks.blood_ore = new Block(Block.Properties.create(Material.ICE).hardnessAndResistance(2.0f, 3.0f).lightValue(14).sound(SoundType.GLASS)).setRegistryName(location("blood_ore")),
						YanjingBlocks.demon_gold_ore = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2.0f, 2.0f).lightValue(14).sound(SoundType.STONE)).setRegistryName(location("demon_gold_ore"))	
						

					);
				
			LOGGER.info("Blocks regostered");
		}


	
	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
	{
		event.getRegistry().registerAll
		(
			Entities.model_entity,
			Entities.jade_demon_entity

			
		);
		
		Entities.registerEntityWorldSpawns();

		
	}
	
	public static ResourceLocation location(String name)
	{
		return new ResourceLocation(MODID, name);
	}
}
