package fr.darktech.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelGeneratorInvocator extends ModelBase
{
	ModelRenderer Base;
	ModelRenderer Lamp1;
	ModelRenderer Lamp2;
	ModelRenderer Lamp3;
	ModelRenderer Lamp4;
	ModelRenderer Lamp6;
	ModelRenderer Lamp5;
	ModelRenderer Lamp7;
	ModelRenderer Lamp8;
	ModelRenderer Arm1;
	ModelRenderer Arm2;
	ModelRenderer Arm3;
	ModelRenderer Arm4;
	ModelRenderer ALamp1;
	ModelRenderer ALamp2;
	ModelRenderer ALamp3;
	ModelRenderer ALamp4;

	public ModelGeneratorInvocator()
	{
		Base = new ModelRenderer( this, 0, 15 );
		Base.setTextureSize( 64, 32 );
		Base.addBox( -8F, -0.5F, -8F, 16, 1, 16);
		Base.setRotationPoint( 0F, 24F, 0F );
		Lamp1 = new ModelRenderer( this, 0, 28 );
		Lamp1.setTextureSize( 64, 32 );
		Lamp1.addBox( -1F, -0.5F, -1F, 2, 1, 2);
		Lamp1.setRotationPoint( 6F, 23F, -6F );
		Lamp2 = new ModelRenderer( this, 0, 28 );
		Lamp2.setTextureSize( 64, 32 );
		Lamp2.addBox( -1F, -0.5F, -1F, 2, 1, 2);
		Lamp2.setRotationPoint( 6F, 23F, 0F );
		Lamp3 = new ModelRenderer( this, 0, 28 );
		Lamp3.setTextureSize( 64, 32 );
		Lamp3.addBox( -1F, -0.5F, -1F, 2, 1, 2);
		Lamp3.setRotationPoint( 6F, 23F, 6F );
		Lamp4 = new ModelRenderer( this, 0, 28 );
		Lamp4.setTextureSize( 64, 32 );
		Lamp4.addBox( -1F, -0.5F, -1F, 2, 1, 2);
		Lamp4.setRotationPoint( 0F, 23F, 6F );
		Lamp6 = new ModelRenderer( this, 0, 28 );
		Lamp6.setTextureSize( 64, 32 );
		Lamp6.addBox( -1F, -0.5F, -1F, 2, 1, 2);
		Lamp6.setRotationPoint( -6F, 23F, 0F );
		Lamp5 = new ModelRenderer( this, 0, 28 );
		Lamp5.setTextureSize( 64, 32 );
		Lamp5.addBox( -1F, -0.5F, -1F, 2, 1, 2);
		Lamp5.setRotationPoint( -6F, 23F, 6F );
		Lamp7 = new ModelRenderer( this, 0, 28 );
		Lamp7.setTextureSize( 64, 32 );
		Lamp7.addBox( -1F, -0.5F, -1F, 2, 1, 2);
		Lamp7.setRotationPoint( -6F, 23F, -6F );
		Lamp8 = new ModelRenderer( this, 0, 28 );
		Lamp8.setTextureSize( 64, 32 );
		Lamp8.addBox( -1F, -0.5F, -1F, 2, 1, 2);
		Lamp8.setRotationPoint( 0F, 23F, -6F );
		Arm1 = new ModelRenderer( this, 2, 17 );
		Arm1.setTextureSize( 64, 32 );
		Arm1.addBox( -2F, -0.5F, -22F, 4, 1, 14);
		Arm1.setRotationPoint( 0F, 24F, 0F );
		Arm2 = new ModelRenderer( this, 2, 17 );
		Arm2.setTextureSize( 64, 32 );
		Arm2.addBox( -2F, -0.5F, -22F, 4, 1, 14);
		Arm2.setRotationPoint( 0F, 24F, 0F );
		Arm3 = new ModelRenderer( this, 2, 17 );
		Arm3.setTextureSize( 64, 32 );
		Arm3.addBox( -2F, -0.5F, -22F, 4, 1, 14);
		Arm3.setRotationPoint( 0F, 24F, 0F );
		Arm4 = new ModelRenderer( this, 2, 17 );
		Arm4.setTextureSize( 64, 32 );
		Arm4.addBox( -2F, -0.5F, -22F, 4, 1, 14);
		Arm4.setRotationPoint( 0F, 24F, 0F );
		ALamp1 = new ModelRenderer( this, 0, 28 );
		ALamp1.setTextureSize( 64, 32 );
		ALamp1.addBox( 18F, -0.5F, -1F, 2, 1, 2);
		ALamp1.setRotationPoint( 0F, 23F, 0F );
		ALamp2 = new ModelRenderer( this, 0, 28 );
		ALamp2.setTextureSize( 64, 32 );
		ALamp2.addBox( 18F, -0.5F, -1F, 2, 1, 2);
		ALamp2.setRotationPoint( 0F, 23F, 0F );
		ALamp3 = new ModelRenderer( this, 0, 28 );
		ALamp3.setTextureSize( 64, 32 );
		ALamp3.addBox( 18F, -0.5F, -1F, 2, 1, 2);
		ALamp3.setRotationPoint( 0F, 23F, 0F );
		ALamp4 = new ModelRenderer( this, 0, 28 );
		ALamp4.setTextureSize( 64, 32 );
		ALamp4.addBox( 18F, -0.5F, -1F, 2, 1, 2);
		ALamp4.setRotationPoint( 0F, 23F, 0F );
	}

	public void render(float par7)
	{
		Base.renderWithRotation(par7);
		Lamp1.renderWithRotation(par7);
		Lamp2.renderWithRotation(par7);
		Lamp3.renderWithRotation(par7);
		Lamp4.renderWithRotation(par7);
		Lamp6.renderWithRotation(par7);
		Lamp5.renderWithRotation(par7);
		Lamp7.renderWithRotation(par7);
		Lamp8.renderWithRotation(par7);
		Arm1.renderWithRotation(par7);

		Arm2.rotateAngleY = -1.570796F;
		Arm2.renderWithRotation(par7);

		Arm3.rotateAngleY = -3.141593F;
		Arm3.renderWithRotation(par7);

		Arm4.rotateAngleY = 1.570796F;
		Arm4.renderWithRotation(par7);

		ALamp1.renderWithRotation(par7);

		ALamp2.rotateAngleY = -1.570796F;
		ALamp2.renderWithRotation(par7);

		ALamp3.rotateAngleY = -3.141593F;
		ALamp3.renderWithRotation(par7);

		ALamp4.rotateAngleY = 1.570796F;
		ALamp4.renderWithRotation(par7);
	}
}