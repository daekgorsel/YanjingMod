package marina.yanjingmod.client.renders;

import javax.annotation.Nullable;

import marina.yanjingmod.YanjingMod;
import marina.yanjingmod.client.models.Model;
import marina.yanjingmod.entities.ModelEntity;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.BlazeModel;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;


public class ModelRender implements IRenderFactory<ModelEntity> {


	@Override
	public EntityRenderer<ModelEntity> createRenderFor(EntityRendererManager manager) {
		return new Render(manager);
	}


	private static class Render extends BipedRenderer<ModelEntity, Model> {


		private ResourceLocation TEXTURE = new ResourceLocation(YanjingMod.MODID, "textures/entity/model_entity.png");

		protected Render(EntityRendererManager renderManager) {
			super(renderManager, new Model(), 0.5F);
		}

		@Nullable
		@Override
		protected ResourceLocation getEntityTexture(ModelEntity entity) {
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
