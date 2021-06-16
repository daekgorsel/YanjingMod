package marina.yanjingmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConfig {
	public static ForgeConfigSpec.IntValue yanjing_chance;
	
	public static void init(ForgeConfigSpec.Builder server)
	{
		server.comment("Ore Gen Config");
		yanjing_chance = server.
				comment("Max number of ore veins of ore that can spawn in one chunk")
				.defineInRange("oregen.yanjing_chance", 80, 4, 7);
	}
}
