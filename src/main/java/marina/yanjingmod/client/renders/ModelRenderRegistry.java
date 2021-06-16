package marina.yanjingmod.client.renders;


import marina.yanjingmod.entities.JadeDemonEntity;
import marina.yanjingmod.entities.ModelEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class ModelRenderRegistry 
{ 
	//super.registerModels();
	public static void registryEntityRenders()
	{
		//RenderingRegistry.registerEntityRenderingHandler(ModelEntity.class, ModelRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModelEntity.class, new ModelRender());
		RenderingRegistry.registerEntityRenderingHandler(JadeDemonEntity.class, new JadeDemonRender());
		
	}
}
