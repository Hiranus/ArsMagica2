// Date: 9/20/2013 6:16:25 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package am2.models;

import am2.entities.renderers.AM2ModelRenderer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHellCow extends ModelBiped{
	//fields
	AM2ModelRenderer Tail;
	AM2ModelRenderer Snout;
	AM2ModelRenderer Handle;
	AM2ModelRenderer arm1;
	AM2ModelRenderer arm2;
	AM2ModelRenderer horn6;
	AM2ModelRenderer udders;
	AM2ModelRenderer horn2;
	AM2ModelRenderer horn5;
	AM2ModelRenderer horn1;
	AM2ModelRenderer horn4;
	AM2ModelRenderer horn3;
	AM2ModelRenderer AxeHead3;
	AM2ModelRenderer AxeHead1;
	AM2ModelRenderer AxeHead2;
	AM2ModelRenderer AxeHead4;

	public ModelHellCow(){
		textureWidth = 128;
		textureHeight = 64;

		Tail = new AM2ModelRenderer(this, 22, 27);
		Tail.addBox(-0.5F, 0F, 0F, 1, 10, 1);
		Tail.setRotationPoint(0F, 11F, 5F);
		Tail.setTextureSize(128, 64);
		Tail.mirror = true;
		setRotation(Tail, 0.7063936F, 0F, 0F);
		Snout = new AM2ModelRenderer(this, 18, 15);
		Snout.addBox(-2F, -3F, -5F, 4, 3, 3);
		Snout.setRotationPoint(0F, -5F, -2F);
		Snout.setTextureSize(128, 64);
		Snout.mirror = true;
		setRotation(Snout, 0.0743572F, 0F, 0F);
		Handle = new AM2ModelRenderer(this, 0, 40);
		Handle.addBox(-24F, 0F, 0F, 25, 1, 1);
		Handle.setRotationPoint(8F, 6F, -7F);
		Handle.setTextureSize(128, 64);
		Handle.mirror = true;
		setRotation(Handle, 0F, -0.3490659F, 0.2268928F);
		bipedBody = new AM2ModelRenderer(this, 36, 8);
		bipedBody.addBox(-6F, -10F, -7F, 12, 18, 10);
		bipedBody.setRotationPoint(0F, 5F, 2F);
		bipedBody.setTextureSize(128, 64);
		bipedBody.mirror = true;
		setRotation(bipedBody, 0.122173F, 0F, 0F);
		bipedRightLeg = new AM2ModelRenderer(this, 0, 16);
		bipedRightLeg.addBox(-4F, 0F, -2F, 4, 12, 4);
		bipedRightLeg.setRotationPoint(-3F, 12F, 1F);
		bipedRightLeg.setTextureSize(128, 64);
		bipedRightLeg.mirror = true;
		setRotation(bipedRightLeg, 0F, 0F, 0F);
		bipedLeftLeg = new AM2ModelRenderer(this, 0, 16);
		bipedLeftLeg.addBox(0F, 0F, -2F, 4, 12, 4);
		bipedLeftLeg.setRotationPoint(3F, 12F, 1F);
		bipedLeftLeg.setTextureSize(128, 64);
		bipedLeftLeg.mirror = true;
		setRotation(bipedLeftLeg, 0F, 0F, 0F);
		arm1 = new AM2ModelRenderer(this, 0, 16);
		arm1.addBox(-3F, 0F, -3F, 4, 12, 4);
		arm1.setRotationPoint(-7F, -4F, -1F);
		arm1.setTextureSize(128, 64);
		arm1.mirror = true;
		setRotation(arm1, -0.9294653F, 0F, 0F);
		arm2 = new AM2ModelRenderer(this, 0, 16);
		arm2.addBox(-1F, 0F, -3F, 4, 12, 4);
		arm2.setRotationPoint(7F, -4F, -1F);
		arm2.setTextureSize(128, 64);
		arm2.mirror = true;
		setRotation(arm2, -0.3717861F, 0F, 0F);
		horn6 = new AM2ModelRenderer(this, 22, 22);
		horn6.addBox(2.5F, -9.5F, -2F, 1, 3, 1);
		horn6.setRotationPoint(0F, -5F, -1F);
		horn6.setTextureSize(128, 64);
		horn6.mirror = true;
		setRotation(horn6, 0.122173F, 0F, -1.0031F);
		udders = new AM2ModelRenderer(this, 52, 0);
		udders.addBox(-2F, -3F, 0F, 4, 6, 2);
		udders.setRotationPoint(0F, 10F, -6F);
		udders.setTextureSize(128, 64);
		udders.mirror = true;
		setRotation(udders, 0.122173F, 0F, 0F);
		horn2 = new AM2ModelRenderer(this, 27, 22);
		horn2.addBox(3F, -11F, -2F, 1, 3, 1);
		horn2.setRotationPoint(0F, -5F, -1F);
		horn2.setTextureSize(128, 64);
		horn2.mirror = true;
		setRotation(horn2, 0.122173F, 0F, 0F);
		horn5 = new AM2ModelRenderer(this, 22, 22);
		horn5.addBox(-3.5F, -9.5F, -1F, 1, 3, 1);
		horn5.setRotationPoint(0F, -5F, -2F);
		horn5.setTextureSize(128, 64);
		horn5.mirror = true;
		setRotation(horn5, 0.122173F, 0F, 1.003093F);
		horn1 = new AM2ModelRenderer(this, 27, 22);
		horn1.addBox(-4F, -11F, -2F, 1, 3, 1);
		horn1.setRotationPoint(0F, -5F, -1F);
		horn1.setTextureSize(128, 64);
		horn1.mirror = true;
		setRotation(horn1, 0.122173F, 0F, 0F);
		horn4 = new AM2ModelRenderer(this, 17, 22);
		horn4.addBox(-4F, -13F, -2F, 1, 4, 1);
		horn4.setRotationPoint(0F, -5F, -1F);
		horn4.setTextureSize(128, 64);
		horn4.mirror = true;
		setRotation(horn4, 0.122173F, 0F, -0.296706F);
		horn3 = new AM2ModelRenderer(this, 17, 22);
		horn3.addBox(3F, -13F, -1F, 1, 4, 1);
		horn3.setRotationPoint(0F, -5F, -2F);
		horn3.setTextureSize(128, 64);
		horn3.mirror = true;
		setRotation(horn3, 0.122173F, 0F, 0.2974289F);
		bipedHead = new AM2ModelRenderer(this, 0, 0);
		bipedHead.addBox(-4F, -8F, -3F, 8, 8, 6);
		bipedHead.setRotationPoint(0F, -5F, -2F);
		bipedHead.setTextureSize(128, 64);
		bipedHead.mirror = true;
		setRotation(bipedHead, 0.0743572F, 0F, 0F);
		AxeHead3 = new AM2ModelRenderer(this, 47, 43);
		AxeHead3.addBox(-34F, -1F, 0F, 1, 2, 1);
		AxeHead3.setRotationPoint(8F, 6F, -7F);
		AxeHead3.setTextureSize(128, 64);
		AxeHead3.mirror = true;
		setRotation(AxeHead3, 0F, -0.3490659F, 0.2268928F);
		AxeHead1 = new AM2ModelRenderer(this, 0, 43);
		AxeHead1.addBox(-33F, -1F, 0F, 9, 3, 1);
		AxeHead1.setRotationPoint(8F, 6F, -7F);
		AxeHead1.setTextureSize(128, 64);
		AxeHead1.mirror = true;
		setRotation(AxeHead1, 0F, -0.3490659F, 0.2268928F);
		AxeHead2 = new AM2ModelRenderer(this, 21, 43);
		AxeHead2.addBox(-30F, -2F, 0F, 5, 1, 1);
		AxeHead2.setRotationPoint(8F, 6F, -7F);
		AxeHead2.setTextureSize(128, 64);
		AxeHead2.mirror = true;
		setRotation(AxeHead2, 0F, -0.3490659F, 0.2268928F);
		AxeHead4 = new AM2ModelRenderer(this, 34, 43);
		AxeHead4.addBox(-32F, 2F, 0F, 5, 1, 1);
		AxeHead4.setRotationPoint(8F, 6F, -7F);
		AxeHead4.setTextureSize(128, 64);
		AxeHead4.mirror = true;
		setRotation(AxeHead4, 0F, -0.3490659F, 0.2268928F);

		horn1.storeRestRotations();
		horn2.storeRestRotations();
		horn3.storeRestRotations();
		horn4.storeRestRotations();
		horn5.storeRestRotations();
		horn6.storeRestRotations();

		Snout.storeRestRotations();
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity){
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);

		this.bipedHead.rotationPointY = -5.0F;

		setRotation(horn1, bipedHead.rotateAngleX, bipedHead.rotateAngleY, bipedHead.rotateAngleZ);
		setRotation(horn2, bipedHead.rotateAngleX, bipedHead.rotateAngleY, bipedHead.rotateAngleZ);
		setRotation(horn3, bipedHead.rotateAngleX, bipedHead.rotateAngleY, bipedHead.rotateAngleZ);
		setRotation(horn4, bipedHead.rotateAngleX, bipedHead.rotateAngleY, bipedHead.rotateAngleZ);
		setRotation(horn5, bipedHead.rotateAngleX, bipedHead.rotateAngleY, bipedHead.rotateAngleZ);
		setRotation(horn6, bipedHead.rotateAngleX, bipedHead.rotateAngleY, bipedHead.rotateAngleZ);
		setRotation(Snout, bipedHead.rotateAngleX, bipedHead.rotateAngleY, bipedHead.rotateAngleZ);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		heldItemLeft = 0;
		heldItemRight = 0;

		Tail.render(f5);
		Snout.render(f5);
		Handle.render(f5);
		bipedBody.render(f5);
		bipedRightLeg.render(f5);
		bipedLeftLeg.render(f5);
		arm1.render(f5);
		arm2.render(f5);
		horn6.render(f5);
		udders.render(f5);
		horn2.render(f5);
		horn5.render(f5);
		horn1.render(f5);
		horn4.render(f5);
		horn3.render(f5);
		bipedHead.render(f5);
		AxeHead3.render(f5);
		AxeHead1.render(f5);
		AxeHead2.render(f5);
		AxeHead3.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	private void setRotationEx(AM2ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = model.getRestRotationX() + x;
		model.rotateAngleY = model.getRestRotationY() + y;
		model.rotateAngleZ = model.getRestRotationZ() + z;
	}

}
