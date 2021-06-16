package marina.yanjingmod.client.models;

import marina.yanjingmod.entities.ModelEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


public class Model extends BipedModel<ModelEntity> {
	private final RendererModel head;
	private final RendererModel cube_r1;
	private final RendererModel horn1;
	private final RendererModel horn2;
	private final RendererModel horny_eye;
	private final RendererModel eye1;
	private final RendererModel eye2;
	private final RendererModel eye3;
	private final RendererModel eye4;
	private final RendererModel eye5;
	private final RendererModel eye6;

	public Model() {
		textureWidth = 64;
		textureHeight = 64;

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -27.0F+ 27, -3.0F, 5, 5, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -28.0F+ 27, -2.0F, 5, 1, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -28.0F+ 27, 2.0F, 3, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -28.0F+ 27, -3.0F, 3, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -22.0F+ 27, 2.0F, 3, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -22.0F+ 27, -2.0F, 5, 1, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -22.0F+ 27, -2.0F, 5, 1, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -22.0F+ 27, -3.0F, 3, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 2.0F, -27.0F+ 27, -2.0F, 1, 5, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -27.0F+ 27, -2.0F, 1, 5, 4, 0.0F, false));

		cube_r1 = new RendererModel(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -4.0F, -27.0F+ 27, -2.0F, 1, 5, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 3.0F, -27.0F+ 27, -2.0F, 1, 5, 3, 0.0F, false));

		horn1 = new RendererModel(this);
		horn1.setRotationPoint(0.0F, 0.0F, 1.0F);
		head.addChild(horn1);
		horn1.cubeList.add(new ModelBox(horn1, 28, 0, -2.0F, -27.0F+ 27, 3.0F, 2, 2, 2, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 28, 0, -2.0F, -25.0F+ 27, 3.0F, 2, 1, 2, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 30, 0, -2.0F, -27.0F+ 27, 5.0F, 2, 1, 1, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 28, 0, -2.0F, -30.0F+ 27, 4.0F, 2, 3, 2, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 26, 0, -2.0F, -30.0F+ 27, 6.0F, 2, 3, 1, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 30, 0, -2.0F, -31.0F+ 27, 5.0F, 2, 1, 1, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 28, 0, -2.0F, -33.0F+ 27, 3.0F, 2, 3, 2, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 28, 0, -2.0F, -35.0F+ 27, 2.0F, 2, 2, 2, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 30, 0, -2.0F, -37.0F+ 27, 2.0F, 2, 2, 1, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 32, 0, -2.0F, -39.0F+ 27, 2.0F, 1, 2, 1, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 30, 0, -2.0F, -36.0F+ 27, 1.0F, 2, 2, 1, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 32, 0, -2.0F, -38.0F+ 27, 1.0F, 1, 2, 1, 0.0F, false));
		horn1.cubeList.add(new ModelBox(horn1, 30, 0, -2.0F, -33.0F+ 27, 2.0F, 2, 1, 1, 0.0F, false));

		horn2 = new RendererModel(this);
		horn2.setRotationPoint(-2.0F, 0.0F, -1.0F);
		head.addChild(horn2);
		setRotationAngle(horn2, 0.0F, 3.1416F, 0.0F);
		horn2.cubeList.add(new ModelBox(horn2, 30, 0, -2.0F, -33.0F+ 27, 2.0F, 2, 1, 1, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 28, 0, -2.0F, -27.0F+ 27, 3.0F, 2, 2, 2, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 28, 0, -2.0F, -25.0F+ 27, 3.0F, 2, 1, 2, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 30, 0, -2.0F, -27.0F+ 27, 5.0F, 2, 1, 1, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 28, 0, -2.0F, -30.0F+ 27, 4.0F, 2, 3, 2, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 26, 0, -2.0F, -30.0F+ 27, 6.0F, 2, 3, 1, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 30, 0, -2.0F, -31.0F+ 27, 5.0F, 2, 1, 1, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 28, 0, -2.0F, -33.0F+ 27, 3.0F, 2, 3, 2, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 28, 0, -2.0F, -35.0F+ 27, 2.0F, 2, 2, 2, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 30, 0, -2.0F, -37.0F+ 27, 2.0F, 2, 2, 1, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 32, 0, -2.0F, -39.0F+ 27, 2.0F, 1, 2, 1, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 30, 0, -2.0F, -36.0F+ 27, 1.0F, 2, 2, 1, 0.0F, false));
		horn2.cubeList.add(new ModelBox(horn2, 32, 0, -2.0F, -38.0F+ 27, 1.0F, 1, 2, 1, 0.0F, false));

		horny_eye = new RendererModel(this);
		horny_eye.setRotationPoint(0.0F, 24.0F, 0.0F);
		horny_eye.cubeList.add(new ModelBox(horny_eye, 40, 20, -2.0F, -36.0F+5, -1.0F, 2, 2, 2, 0.0F, false));

		eye1 = new RendererModel(this);
		eye1.setRotationPoint(0.0F, 24.0F, 0.0F);
		eye1.cubeList.add(new ModelBox(eye1, 0, 16, -3.0F, -18.0F + 12, -2.0F, 4, 4, 4, 0.0F, false));

		eye2 = new RendererModel(this);
		eye2.setRotationPoint(0.0F, 24.0F, 0.0F);
		eye2.cubeList.add(new ModelBox(eye1, 0, 16, -3.0F, -18.0F + 12, -2.0F, 4, 4, 4, 0.0F, false));


		eye3 = new RendererModel(this);
		eye3.setRotationPoint(0.0F, 24.0F, 0.0F);
		eye3.cubeList.add(new ModelBox(eye1, 0, 16, -3.0F, -18.0F + 12, -2.0F, 4, 4, 4, 0.0F, false));


		eye4 = new RendererModel(this);
		eye4.setRotationPoint(0.0F, 24.0F, 0.0F);
		eye4.cubeList.add(new ModelBox(eye1, 0, 16, -3.0F, -18.0F + 12, -2.0F, 4, 4, 4, 0.0F, false));


		eye5 = new RendererModel(this);
		eye5.setRotationPoint(0.0F, 24.0F, 0.0F);
		eye5.cubeList.add(new ModelBox(eye1, 0, 16, -3.0F, -18.0F + 12, -2.0F, 4, 4, 4, 0.0F, false));


		eye6 = new RendererModel(this);
		eye6.setRotationPoint(0.0F, 24.0F, 0.0F);
		eye6.cubeList.add(new ModelBox(eye1, 0, 16, -3.0F, -18.0F + 12, -2.0F, 4, 4, 4, 0.0F, false));

	}

	@Override
	public void render(ModelEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		horny_eye.render(f5);
		eye1.render(f5);
		eye2.render(f5);
		eye3.render(f5);
		eye4.render(f5);
		eye5.render(f5);
		eye6.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(ModelEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
		  
		 float f = ageInTicks * (float)Math.PI * -0.1F;
		
	     
		 
	      this.eye1.rotationPointY = -2.0F + MathHelper.cos(((float)(0 * 2) + ageInTicks) * 0.25F);
	      this.eye1.rotationPointX = MathHelper.cos(f) * 14.0F;
	      this.eye1.rotationPointZ = MathHelper.sin(f) * 14.0F;
	      ++f;
	      this.eye2.rotationPointY = -2.0F + MathHelper.cos(((float)(1 * 2) + ageInTicks) * 0.25F);
	      this.eye2.rotationPointX = MathHelper.cos(f) * 14.0F;
	      this.eye2.rotationPointZ = MathHelper.sin(f) * 14.0F;
	      ++f;
	      this.eye3.rotationPointY = -2.0F + MathHelper.cos(((float)(3 * 2) + ageInTicks) * 0.25F);
	      this.eye3.rotationPointX = MathHelper.cos(f) * 14.0F;
	      this.eye3.rotationPointZ = MathHelper.sin(f) * 14.0F;
	      ++f;
	      this.eye4.rotationPointY = -2.0F + MathHelper.cos(((float)(4 * 2) + ageInTicks) * 0.25F);
	      this.eye4.rotationPointX = MathHelper.cos(f) * 14.0F;
	      this.eye4.rotationPointZ = MathHelper.sin(f) * 14.0F;
	      ++f;
	      this.eye5.rotationPointY = -2.0F + MathHelper.cos(((float)(5 * 2) + ageInTicks) * 0.25F);
	      this.eye5.rotationPointX = MathHelper.cos(f) * 14.0F;
	      this.eye5.rotationPointZ = MathHelper.sin(f) * 14.0F;
	      ++f;
	      this.eye6.rotationPointY = -2.0F + MathHelper.cos(((float)(5 * 2) + ageInTicks) * 0.25F);
	      this.eye6.rotationPointX = MathHelper.cos(f) * 14.0F;
	      this.eye6.rotationPointZ = MathHelper.sin(f) * 14.0F;
	      ++f;
	      f = 2 * (float)Math.PI * -0.1F;
	      this.head.rotationPointY = -2.0F + MathHelper.cos(((float)(0 * 2) + ageInTicks) * 0.25F);
	      
	     
	}
}