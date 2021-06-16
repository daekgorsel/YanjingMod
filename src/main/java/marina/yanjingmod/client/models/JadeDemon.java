package marina.yanjingmod.client.models;
// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

import marina.yanjingmod.entities.JadeDemonEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class JadeDemon extends BipedModel<JadeDemonEntity> {
	private final RendererModel bone;
	private final RendererModel horn;
	private final RendererModel cube_r1;
	private final RendererModel cube_r2;
	private final RendererModel horn1;
	private final RendererModel cube_r3;
	private final RendererModel cube_r4;
	private final RendererModel jade;
	private final RendererModel body;
	private final RendererModel legR;
	private final RendererModel legL;
	private final RendererModel armR;
	private final RendererModel armL;

	public JadeDemon() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new RendererModel(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, -40.0F, -4.0F, 8, 8, 8, 0.0F, false));

		horn = new RendererModel(this);
		horn.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(horn);
		setRotationAngle(horn, 0.0F, 3.1416F, 0.0F);
		

		cube_r1 = new RendererModel(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.5672F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 35, 30.2238F, -45.0603F, -1.0F, 2, 9, 2, 0.0F, false));

		cube_r2 = new RendererModel(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3054F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 33, -8.8042F, -47.7223F, -1.0F, 2, 13, 2, 0.0F, false));

		horn1 = new RendererModel(this);
		horn1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(horn1);
		

		cube_r3 = new RendererModel(this);
		cube_r3.setRotationPoint(0.0F, -6.0F, 0.0F);
		horn1.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.5672F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 35, 27.0F, -40.0F, -1.0F, 2, 9, 2, 0.0F, false));

		cube_r4 = new RendererModel(this);
		cube_r4.setRotationPoint(0.0F, -6.0F, 0.0F);
		horn1.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3054F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 17, -7.0F, -42.0F, -1.0F, 2, 13, 2, 0.0F, false));

		jade = new RendererModel(this);
		jade.setRotationPoint(0.0F, 24.0F, 0.0F);
		jade.cubeList.add(new ModelBox(jade, 12, 16, -5.0F, -55.0F, -1.0F, 10, 1, 1, 0.0F, false));

		body = new RendererModel(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -2.0F, -32.0F, -2.0F, 4, 17, 4, 0.0F, false));

		legR = new RendererModel(this);
		legR.setRotationPoint(0.0F, 24.0F, 0.0F);
		legR.cubeList.add(new ModelBox(legR, 33, 0, 1.0F, -15.0F, -1.0F, 1, 15, 2, 0.0F, false));

		legL = new RendererModel(this);
		legL.setRotationPoint(-3.0F, 24.0F, 0.0F);
		legL.cubeList.add(new ModelBox(legL, 28, 18, 1.0F, -15.0F, -1.0F, 1, 15, 2, 0.0F, false));

		armR = new RendererModel(this);
		armR.setRotationPoint(0.0F, 24.0F, 0.0F);
		armR.cubeList.add(new ModelBox(armR, 22, 18, -3.0F, -29.0F, -1.0F, 1, 15, 2, 0.0F, false));

		armL = new RendererModel(this);
		armL.setRotationPoint(5.0F, 24.0F, 0.0F);
		armL.cubeList.add(new ModelBox(armL, 16, 18, -3.0F, -29.0F, -1.0F, 1, 15, 2, 0.0F, false));
	}

	@Override
	public void render(JadeDemonEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		jade.render(f5);
		body.render(f5);
		legR.render(f5);
		legL.render(f5);
		armR.render(f5);
		armL.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	public void setRotationAngles(JadeDemonEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
	      super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
	      
	      //this.bone.rotateAngleX = 

	   }
}