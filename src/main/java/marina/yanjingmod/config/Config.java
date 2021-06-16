package marina.yanjingmod.config;

import java.io.File;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import marina.yanjingmod.ModRegistries;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Config {
private static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
public static final ForgeConfigSpec SERVER_CONFIG;

static
{
	
	OreGenConfig.init(SERVER_BUILDER);
	SERVER_CONFIG = SERVER_BUILDER.build();
}

public static void loadConfig(ForgeConfigSpec config, String path) {
	ModRegistries.LOGGER.info("Loading Config" + path);
	
	final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
	ModRegistries.LOGGER.info("Build config" + path);
	file.load();
	ModRegistries.LOGGER.info("Loaded config" + path);
	
	config.setConfig(file);
	
}
}
