package fr.darktech.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelGeneratorInvocator extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer Lamp8;
    ModelRenderer Lamp7;
    ModelRenderer Lamp5;
    ModelRenderer Lamp6;
    ModelRenderer Lamp4;
    ModelRenderer Lamp3;
    ModelRenderer Lamp2;
    ModelRenderer Lamp1;
    ModelRenderer Arm2;
    ModelRenderer ALamp2;
    ModelRenderer Arm21;
    ModelRenderer Arm22;
    ModelRenderer Arm23;
    ModelRenderer Arm24;
    ModelRenderer Arm25;
    ModelRenderer Arm26;
    ModelRenderer Arm3;
    ModelRenderer ALamp3;
    ModelRenderer Arm31;
    ModelRenderer Arm32;
    ModelRenderer Arm33;
    ModelRenderer Arm34;
    ModelRenderer Arm35;
    ModelRenderer Arm36;
    ModelRenderer Arm4;
    ModelRenderer ALamp4;
    ModelRenderer Arm41;
    ModelRenderer Arm42;
    ModelRenderer Arm43;
    ModelRenderer Arm44;
    ModelRenderer Arm45;
    ModelRenderer Arm46;
    ModelRenderer Arm1;
    ModelRenderer ALamp1;
    ModelRenderer Arm11;
    ModelRenderer Arm12;
    ModelRenderer Arm13;
    ModelRenderer Arm14;
    ModelRenderer Arm15;
    ModelRenderer Arm16;

	public ModelGeneratorInvocator()
	{
        Base = new ModelRenderer( this, 0, 15 );
        Base.setTextureSize( 64, 32 );
        Base.addBox( -8F, -0.5F, -8F, 16, 1, 16);
        Base.setRotationPoint( 0F, 24F, 0F );
        Lamp8 = new ModelRenderer( this, 0, 28 );
        Lamp8.setTextureSize( 64, 32 );
        Lamp8.addBox( -1F, -0.5F, -1F, 2, 1, 2);
        Lamp8.setRotationPoint( 0F, 23F, -5F );
        Lamp7 = new ModelRenderer( this, 0, 28 );
        Lamp7.setTextureSize( 64, 32 );
        Lamp7.addBox( -1F, -0.5F, -1F, 2, 1, 2);
        Lamp7.setRotationPoint( -4F, 23F, -4F );
        Lamp5 = new ModelRenderer( this, 0, 28 );
        Lamp5.setTextureSize( 64, 32 );
        Lamp5.addBox( -1F, -0.5F, -1F, 2, 1, 2);
        Lamp5.setRotationPoint( -4F, 23F, 4F );
        Lamp6 = new ModelRenderer( this, 0, 28 );
        Lamp6.setTextureSize( 64, 32 );
        Lamp6.addBox( -1F, -0.5F, -1F, 2, 1, 2);
        Lamp6.setRotationPoint( -5F, 23F, 0F );
        Lamp4 = new ModelRenderer( this, 0, 28 );
        Lamp4.setTextureSize( 64, 32 );
        Lamp4.addBox( -1F, -0.5F, -1F, 2, 1, 2);
        Lamp4.setRotationPoint( 0F, 23F, 5F );
        Lamp3 = new ModelRenderer( this, 0, 28 );
        Lamp3.setTextureSize( 64, 32 );
        Lamp3.addBox( -1F, -0.5F, -1F, 2, 1, 2);
        Lamp3.setRotationPoint( 4F, 23F, 4F );
        Lamp2 = new ModelRenderer( this, 0, 28 );
        Lamp2.setTextureSize( 64, 32 );
        Lamp2.addBox( -1F, -0.5F, -1F, 2, 1, 2);
        Lamp2.setRotationPoint( 5F, 23F, 0F );
        Lamp1 = new ModelRenderer( this, 0, 28 );
        Lamp1.setTextureSize( 64, 32 );
        Lamp1.addBox( -1F, -0.5F, -1F, 2, 1, 2);
        Lamp1.setRotationPoint( 4F, 23F, -4F );
        Arm2 = new ModelRenderer( this, 28, 0 );
        Arm2.setTextureSize( 64, 32 );
        Arm2.addBox( -2F, -0.5F, -14F, 4, 1, 14);
        Arm2.setRotationPoint( 0F, 24F, 8F );
        ALamp2 = new ModelRenderer( this, 0, 28 );
        ALamp2.setTextureSize( 64, 32 );
        ALamp2.addBox( 10F, -1.5F, -1F, 2, 1, 2);
        ALamp2.setRotationPoint( 0F, 24F, 9F );
        Arm21 = new ModelRenderer( this, 0, 0 );
        Arm21.setTextureSize( 64, 32 );
        Arm21.addBox( -10F, -0.5F, -0.5F, 20, 1, 1);
        Arm21.setRotationPoint( 12F, 24F, 21.5F );
        Arm22 = new ModelRenderer( this, 0, 0 );
        Arm22.setTextureSize( 64, 32 );
        Arm22.addBox( -10F, -0.5F, -0.5F, 20, 1, 1);
        Arm22.setRotationPoint( -12F, 24F, 21.5F );
        Arm23 = new ModelRenderer( this, 0, 0 );
        Arm23.setTextureSize( 64, 32 );
        Arm23.addBox( -7F, -0.5F, -1F, 13, 1, 1);
        Arm23.setRotationPoint( -8.999998F, 24F, 18F );
        Arm24 = new ModelRenderer( this, 0, 0 );
        Arm24.setTextureSize( 64, 32 );
        Arm24.addBox( -6F, -0.5F, -1F, 13, 1, 1);
        Arm24.setRotationPoint( 8.999998F, 24F, 18F );
        Arm25 = new ModelRenderer( this, 8, 4 );
        Arm25.setTextureSize( 64, 32 );
        Arm25.addBox( -1F, -0.5F, -2F, 1, 1, 5);
        Arm25.setRotationPoint( -16F, 24F, 19F );
        Arm26 = new ModelRenderer( this, 0, 6 );
        Arm26.setTextureSize( 64, 32 );
        Arm26.addBox( -1F, -0.5F, -3F, 1, 1, 6);
        Arm26.setRotationPoint( 15F, 24F, 18F );
        Arm3 = new ModelRenderer( this, 28, 0 );
        Arm3.setTextureSize( 64, 32 );
        Arm3.addBox( -2F, -0.5F, -14F, 4, 1, 14);
        Arm3.setRotationPoint( -8F, 24F, 0F );
        ALamp3 = new ModelRenderer( this, 0, 28 );
        ALamp3.setTextureSize( 64, 32 );
        ALamp3.addBox( 10F, -1.5F, -1F, 2, 1, 2);
        ALamp3.setRotationPoint( -8.999999F, 24F, -1.788139E-07F );
        Arm31 = new ModelRenderer( this, 0, 0 );
        Arm31.setTextureSize( 64, 32 );
        Arm31.addBox( -10F, -0.5F, -0.5F, 20, 1, 1);
        Arm31.setRotationPoint( -21.5F, 24F, 12F );
        Arm32 = new ModelRenderer( this, 0, 0 );
        Arm32.setTextureSize( 64, 32 );
        Arm32.addBox( -10F, -0.5F, -0.5F, 20, 1, 1);
        Arm32.setRotationPoint( -21.49999F, 24F, -12F );
        Arm33 = new ModelRenderer( this, 0, 0 );
        Arm33.setTextureSize( 64, 32 );
        Arm33.addBox( -7F, -0.5F, -1F, 13, 1, 1);
        Arm33.setRotationPoint( -18F, 24F, -9F );
        Arm34 = new ModelRenderer( this, 0, 0 );
        Arm34.setTextureSize( 64, 32 );
        Arm34.addBox( -6F, -0.5F, -1F, 13, 1, 1);
        Arm34.setRotationPoint( -18F, 24F, 8.999996F );
        Arm35 = new ModelRenderer( this, 8, 4 );
        Arm35.setTextureSize( 64, 32 );
        Arm35.addBox( -1F, -0.5F, -2F, 1, 1, 5);
        Arm35.setRotationPoint( -18.99999F, 24F, -16F );
        Arm36 = new ModelRenderer( this, 0, 6 );
        Arm36.setTextureSize( 64, 32 );
        Arm36.addBox( -1F, -0.5F, -3F, 1, 1, 6);
        Arm36.setRotationPoint( -18F, 24F, 15F );
        Arm4 = new ModelRenderer( this, 28, 0 );
        Arm4.setTextureSize( 64, 32 );
        Arm4.addBox( -2F, -0.5F, -14F, 4, 1, 14);
        Arm4.setRotationPoint( 0F, 24F, -8F );
        ALamp4 = new ModelRenderer( this, 0, 28 );
        ALamp4.setTextureSize( 64, 32 );
        ALamp4.addBox( 10F, -1.5F, -1F, 2, 1, 2);
        ALamp4.setRotationPoint( 0F, 24F, -9F );
        Arm41 = new ModelRenderer( this, 0, 0 );
        Arm41.setTextureSize( 64, 32 );
        Arm41.addBox( -10F, -0.5F, -0.5F, 20, 1, 1);
        Arm41.setRotationPoint( -12F, 24F, -21.5F );
        Arm42 = new ModelRenderer( this, 0, 0 );
        Arm42.setTextureSize( 64, 32 );
        Arm42.addBox( -10F, -0.5F, -0.5F, 20, 1, 1);
        Arm42.setRotationPoint( 12F, 24F, -21.5F );
        Arm43 = new ModelRenderer( this, 0, 0 );
        Arm43.setTextureSize( 64, 32 );
        Arm43.addBox( -7F, -0.5F, -1F, 13, 1, 1);
        Arm43.setRotationPoint( 9F, 24F, -18F );
        Arm44 = new ModelRenderer( this, 0, 0 );
        Arm44.setTextureSize( 64, 32 );
        Arm44.addBox( -6F, -0.5F, -1F, 13, 1, 1);
        Arm44.setRotationPoint( -9F, 24F, -18F );
        Arm45 = new ModelRenderer( this, 8, 4 );
        Arm45.setTextureSize( 64, 32 );
        Arm45.addBox( -1F, -0.5F, -2F, 1, 1, 5);
        Arm45.setRotationPoint( 16F, 24F, -19F );
        Arm46 = new ModelRenderer( this, 0, 6 );
        Arm46.setTextureSize( 64, 32 );
        Arm46.addBox( -1F, -0.5F, -3F, 1, 1, 6);
        Arm46.setRotationPoint( -15F, 24F, -18F );
        Arm1 = new ModelRenderer( this, 28, 0 );
        Arm1.setTextureSize( 64, 32 );
        Arm1.addBox( -2F, -0.5F, -14F, 4, 1, 14);
        Arm1.setRotationPoint( 8F, 24F, 0F );
        ALamp1 = new ModelRenderer( this, 0, 28 );
        ALamp1.setTextureSize( 64, 32 );
        ALamp1.addBox( 10F, -1.5F, -1F, 2, 1, 2);
        ALamp1.setRotationPoint( 8.999999F, 24F, -1.788139E-07F );
        Arm11 = new ModelRenderer( this, 0, 0 );
        Arm11.setTextureSize( 64, 32 );
        Arm11.addBox( -10F, -0.5F, -0.5F, 20, 1, 1);
        Arm11.setRotationPoint( 21.49999F, 24F, -12F );
        Arm12 = new ModelRenderer( this, 0, 0 );
        Arm12.setTextureSize( 64, 32 );
        Arm12.addBox( -10F, -0.5F, -0.5F, 20, 1, 1);
        Arm12.setRotationPoint( 21.5F, 24F, 12F );
        Arm13 = new ModelRenderer( this, 0, 0 );
        Arm13.setTextureSize( 64, 32 );
        Arm13.addBox( -7F, -0.5F, -1F, 13, 1, 1);
        Arm13.setRotationPoint( 18F, 24F, 8.999996F );
        Arm14 = new ModelRenderer( this, 0, 0 );
        Arm14.setTextureSize( 64, 32 );
        Arm14.addBox( -6F, -0.5F, -1F, 13, 1, 1);
        Arm14.setRotationPoint( 18F, 24F, -9F );
        Arm15 = new ModelRenderer( this, 8, 4 );
        Arm15.setTextureSize( 64, 32 );
        Arm15.addBox( -1F, -0.5F, -2F, 1, 1, 5);
        Arm15.setRotationPoint( 19F, 24F, 16F );
        Arm16 = new ModelRenderer( this, 0, 6 );
        Arm16.setTextureSize( 64, 32 );
        Arm16.addBox( -1F, -0.5F, -3F, 1, 1, 6);
        Arm16.setRotationPoint( 17.99999F, 24F, -15F );
	}

	public void renderBase() {
		Base.renderWithRotation(0.0625F);
	}
	
	public void renderArm(int arm) {
		switch(arm) {
			case 0:
		        Arm1.rotateAngleY = -1.570796F;
				Arm1.renderWithRotation(0.0625F);

		        Arm11.rotateAngleY = -1.570796F;
		        Arm11.renderWithRotation(0.0625f);

		        Arm12.rotateAngleY = -1.570796F;
		        Arm12.renderWithRotation(0.0625f);

		        Arm13.rotateAngleY = -1.570796F;
		        Arm13.renderWithRotation(0.0625f);

		        Arm14.rotateAngleY = -1.570796F;
		        Arm14.renderWithRotation(0.0625f);

		        Arm15.rotateAngleY = -1.570796F;
		        Arm15.renderWithRotation(0.0625f);

		        Arm16.rotateAngleY = -1.570796F;
		        Arm16.renderWithRotation(0.0625f);
				break;
			case 1:
		        Arm2.rotateAngleY = -3.141593F;
				Arm2.renderWithRotation(0.0625F);

		        Arm21.rotateAngleY = -3.141593F;
		        Arm21.renderWithRotation(0.0625f);

		        Arm22.rotateAngleY = -3.141593F;
		        Arm22.renderWithRotation(0.0625f);

		        Arm23.rotateAngleY = -3.141593F;
		        Arm23.renderWithRotation(0.0625f);

		        Arm24.rotateAngleY = -3.141593F;
		        Arm24.renderWithRotation(0.0625f);

		        Arm25.rotateAngleY = -3.141593F;
		        Arm25.renderWithRotation(0.0625f);

		        Arm26.rotateAngleY = -3.141593F;
		        Arm26.renderWithRotation(0.0625f);
				break;
			case 2:
		        Arm3.rotateAngleY = 1.570796F;
				Arm3.renderWithRotation(0.0625F);
		        Arm31.rotateAngleY = 1.570796F;
		        Arm31.renderWithRotation(0.0625f);

		        Arm32.rotateAngleY = 1.570796F;
		        Arm32.renderWithRotation(0.0625f);

		        Arm33.rotateAngleY = 1.570796F;
		        Arm33.renderWithRotation(0.0625f);

		        Arm34.rotateAngleY = 1.570796F;
		        Arm34.renderWithRotation(0.0625f);

		        Arm35.rotateAngleY = 1.570796F;
		        Arm35.renderWithRotation(0.0625f);

		        Arm36.rotateAngleY = 1.570796F;
		        Arm36.renderWithRotation(0.0625f);
				break;
			case 3:
				Arm4.renderWithRotation(0.0625F);
		        Arm41.renderWithRotation(0.0625f);
		        Arm42.renderWithRotation(0.0625f);
		        Arm43.renderWithRotation(0.0625f);
		        Arm44.renderWithRotation(0.0625f);
		        Arm45.renderWithRotation(0.0625f);
		        Arm46.renderWithRotation(0.0625f);
				break;
		}
	}
	
	public void renderArmLamp(int arm) {
		switch(arm) {
			case 1:
				ALamp1.renderWithRotation(0.0625F);
				break;
			case 2:
				ALamp2.rotateAngleY = -1.570796F;
				ALamp2.renderWithRotation(0.0625F);
				break;
			case 3:
		        ALamp3.rotateAngleY = 3.141593F;
				ALamp3.renderWithRotation(0.0625F);
				break;
			case 0:
				ALamp4.rotateAngleY = 1.570796F;
				ALamp4.renderWithRotation(0.0625F);
				break;
		}
	}
	
	public void renderWithoutArmLamp(int arm) {
		switch(arm) {
			case 1:
				Lamp2.renderWithRotation(0.0625F);
				break;
			case 2:
				Lamp4.renderWithRotation(0.0625F);
				break;
			case 3:
				Lamp6.renderWithRotation(0.0625F);
				break;
			case 0:
				Lamp8.renderWithRotation(0.0625F);
				break;
		}
	}
	
	public void renderBaseLamp(int side) {
		switch(side) {
			case 0:
				Lamp1.renderWithRotation(0.0625F);
				break;
			case 1:
				Lamp3.renderWithRotation(0.0625F);
				break;
			case 2:
				Lamp5.renderWithRotation(0.0625F);
				break;
			case 3:
				Lamp7.renderWithRotation(0.0625F);
				break;
		}
	}
}