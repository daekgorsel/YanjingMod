package marina.yanjingmod.client.renders;

import javax.annotation.Nullable;

import marina.yanjingmod.YanjingMod;
import marina.yanjingmod.client.models.Model;
import marina.yanjingmod.entities.JadeDemonEntity;
import marina.yanjingmod.client.models.JadeDemon;
import marina.yanjingmod.entities.ModelEntity;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;


public class JadeDemonRender implements IRenderFactory<JadeDemonEntity> {


	@Override
	public EntityRenderer<JadeDemonEntity> createRenderFor(EntityRendererManager manager) {
		return new Render(manager);
	}


	private static class Render extends BipedRenderer<JadeDemonEntity, JadeDemon> {


		private ResourceLocation TEXTURE = new ResourceLocation(YanjingMod.MODID, "textures/entity/jade_demon_entity.png");

		protected Render(EntityRendererManager renderManager) {
			super(renderManager, new JadeDemon(), 0.5F);
		}

		@Nullable
		@Override
		protected ResourceLocation getEntityTexture(JadeDemonEntity entity) {
			return TEXTURE;
		}


	}
}

/*

@OnlyIn(Dist.CLIENT)
public class ModelRender extends MobRenderer<ModelEntity, Model<ModelEntity>> {
	private ResourceLocation TEXTURE = new ResourceLocation(YanjingMod.MODID, "textures/entity/model_entity.png");

   public ModelRender(EntityRendererManager renderManagerIn) {
      super(renderManagerIn, new Model<>(), 0.5F);
   }
	
	@Nullable
	@Override
   protected ResourceLocation getEntityTexture(ModelEntity entity) {
      return TEXTURE;
   }
}
*/
