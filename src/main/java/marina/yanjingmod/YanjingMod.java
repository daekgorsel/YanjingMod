package marina.yanjingmod;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import marina.yanjingmod.client.renders.ModelRenderRegistry;
import marina.yanjingmod.config.Config;
import marina.yanjingmod.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("yanjingmod")
public class YanjingMod {
	
	public static YanjingMod instance;
	
	public static final String MODID = "yanjingmod";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	//logger to print things on console
	public static final ItemGroup YANJINGTAB = new YanjingItemGroup();
		
	public YanjingMod() {
		instance = this;
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG, "yanjingmod-server.toml");

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		Config.loadConfig(Config.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve("yanjingmod-server.toml").toString());
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	//setup func (preinit)
	private void setup(final FMLCommonSetupEvent event)
	{
		OreGeneration.setupOreGeneration();
		ModRegistries.LOGGER.info("Setup method registered.");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event)
	{
	  	ModelRenderRegistry.registryEntityRenders();
		ModRegistries.LOGGER.info("clientRegistries method registered.");
	}
	
	
	

}
