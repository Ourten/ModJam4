package fr.darktech.client.models;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelGenerator extends ModelBase
{
	ModelRenderer Base;
	ModelRenderer Wall1;
	ModelRenderer Wall2;
	ModelRenderer Wall3;
	ModelRenderer Wall4;
	ModelRenderer Pillar1;
	ModelRenderer Pillar2;
	ModelRenderer Pillar3;
	ModelRenderer Pillar4;
	ModelRenderer PillarW1;
	ModelRenderer PillarW2;
	ModelRenderer PillarW3;
	ModelRenderer PillarW4;
	ModelRenderer WallD1;
	ModelRenderer WallD2;
	ModelRenderer WallD3;
	ModelRenderer WallD4;
	ModelRenderer WallD5;
	ModelRenderer WallD6;
	ModelRenderer WallD7;
	ModelRenderer WallD8;
	ModelRenderer FissionTube;
	ModelRenderer FissionTube2;
	ModelRenderer FissionTube3;
	ModelRenderer FissionTube4;
	ModelRenderer FissionTube6;
	ModelRenderer FissionTube7;
	ModelRenderer FissionTube8;
	ModelRenderer FissionTube5;
	ModelRenderer Redstone;

	public ModelGenerator()
	{
		Base = new ModelRenderer( this, 0, 23 );
		Base.setTextureSize( 256, 64 );
		Base.addBox( -20F, -0.5F, -20F, 40, 1, 40);
		Base.setRotationPoint( 0F, 24F, 0F );
		Wall1 = new ModelRenderer( this, 120, 10 );
		Wall1.setTextureSize( 256, 64 );
		Wall1.addBox( -16F, -11.5F, -16F, 2, 23, 30);
		Wall1.setRotationPoint( 0F, 12F, 0F );
		Wall2 = new ModelRenderer( this, 120, 10 );
		Wall2.setTextureSize( 256, 64 );
		Wall2.addBox( -16F, -11.5F, -16F, 2, 23, 30);
		Wall2.setRotationPoint( 0F, 12F, 0F );
		Wall3 = new ModelRenderer( this, 120, 10 );
		Wall3.setTextureSize( 256, 64 );
		Wall3.addBox( -16F, -11.5F, -16F, 2, 23, 30);
		Wall3.setRotationPoint( 0F, 12F, 0F );
		Wall4 = new ModelRenderer( this, 120, 10 );
		Wall4.setTextureSize( 256, 64 );
		Wall4.addBox( -16F, -11.5F, -16F, 2, 23, 30);
		Wall4.setRotationPoint( 0F, 12F, 0F );
        Pillar1 = new ModelRenderer( this, 0, 31 );
        Pillar1.setTextureSize( 256, 64 );
        Pillar1.addBox( -2F, -28F, -2F, 4, 28, 4);
        Pillar1.setRotationPoint( 18F, 24F, 18F );
        Pillar2 = new ModelRenderer( this, 0, 31 );
        Pillar2.setTextureSize( 256, 64 );
        Pillar2.addBox( -2F, -14F, -2F, 4, 28, 4);
        Pillar2.setRotationPoint( 18F, 10F, -18F );
        Pillar3 = new ModelRenderer( this, 0, 31 );
        Pillar3.setTextureSize( 256, 64 );
        Pillar3.addBox( -2F, -14F, -2F, 4, 28, 4);
        Pillar3.setRotationPoint( -18F, 10F, -18F );
        Pillar4 = new ModelRenderer( this, 0, 31 );
        Pillar4.setTextureSize( 256, 64 );
        Pillar4.addBox( -2F, -14F, -2F, 4, 28, 4);
        Pillar4.setRotationPoint( -18F, 10F, 18F );
		PillarW1 = new ModelRenderer( this, 16, 39 );
		PillarW1.setTextureSize( 256, 64 );
		PillarW1.addBox( -2F, -10F, -2F, 4, 20, 4);
		PillarW1.setRotationPoint( 0F, 13.5F, 18F );
		PillarW2 = new ModelRenderer( this, 16, 39 );
		PillarW2.setTextureSize( 256, 64 );
		PillarW2.addBox( -2F, -10F, -2F, 4, 20, 4);
		PillarW2.setRotationPoint( 18F, 13.5F, 0F );
		PillarW3 = new ModelRenderer( this, 16, 39 );
		PillarW3.setTextureSize( 256, 64 );
		PillarW3.addBox( -2F, -10F, -2F, 4, 20, 4);
		PillarW3.setRotationPoint( -17F, 13.5F, 0F );
		PillarW4 = new ModelRenderer( this, 16, 39 );
		PillarW4.setTextureSize( 256, 64 );
		PillarW4.addBox( -2F, -10F, -2F, 4, 20, 4);
		PillarW4.setRotationPoint( 1F, 13.5F, -18F );
		WallD1 = new ModelRenderer( this, 0, 14 );
		WallD1.setTextureSize( 256, 64 );
		WallD1.addBox( -6F, -8F, -0.5F, 12, 16, 1);
		WallD1.setRotationPoint( -10F, 16F, -16.5F );
		WallD2 = new ModelRenderer( this, 0, 14 );
		WallD2.setTextureSize( 256, 64 );
		WallD2.addBox( -6F, -8F, -0.5F, 12, 16, 1);
		WallD2.setRotationPoint( 10F, 16F, -16.5F );
		WallD3 = new ModelRenderer( this, 0, 14 );
		WallD3.setTextureSize( 256, 64 );
		WallD3.addBox( -6F, -8F, -0.5F, 12, 16, 1);
		WallD3.setRotationPoint( -10F, 16F, 16.5F );
		WallD4 = new ModelRenderer( this, 0, 14 );
		WallD4.setTextureSize( 256, 64 );
		WallD4.addBox( -6F, -8F, -0.5F, 12, 16, 1);
		WallD4.setRotationPoint( 10F, 16F, 16.5F );
		WallD5 = new ModelRenderer( this, 0, 14 );
		WallD5.setTextureSize( 256, 64 );
		WallD5.addBox( -6F, -8F, -0.5F, 12, 16, 1);
		WallD5.setRotationPoint( 17F, 16F, -10F );
		WallD6 = new ModelRenderer( this, 0, 14 );
		WallD6.setTextureSize( 256, 64 );
		WallD6.addBox( -6F, -8F, -0.5F, 12, 16, 1);
		WallD6.setRotationPoint( 17F, 16F, 10F );
		WallD7 = new ModelRenderer( this, 0, 14 );
		WallD7.setTextureSize( 256, 64 );
		WallD7.addBox( -6F, -8F, -0.5F, 12, 16, 1);
		WallD7.setRotationPoint( -16F, 16F, -9.999994F );
		WallD8 = new ModelRenderer( this, 0, 14 );
		WallD8.setTextureSize( 256, 64 );
		WallD8.addBox( -6F, -8F, -0.5F, 12, 16, 1);
		WallD8.setRotationPoint( -15.99999F, 16F, 10F );
		FissionTube = new ModelRenderer( this, 0, 7 );
		FissionTube.setTextureSize( 256, 64 );
		FissionTube.addBox( -16F, -2F, -1.5F, 32, 4, 3);
		FissionTube.setRotationPoint( 0F, 16.5F, 17F );
		FissionTube2 = new ModelRenderer( this, 0, 7 );
		FissionTube2.setTextureSize( 256, 64 );
		FissionTube2.addBox( -16F, -2F, -1.5F, 32, 4, 3);
		FissionTube2.setRotationPoint( 0F, 16.5F, -18F );
		FissionTube3 = new ModelRenderer( this, 0, 7 );
		FissionTube3.setTextureSize( 256, 64 );
		FissionTube3.addBox( -16F, -2F, -1.5F, 32, 4, 3);
		FissionTube3.setRotationPoint( -17F, 16.5F, 0F );
		FissionTube4 = new ModelRenderer( this, 0, 7 );
		FissionTube4.setTextureSize( 256, 64 );
		FissionTube4.addBox( -16F, -2F, -1.5F, 32, 4, 3);
		FissionTube4.setRotationPoint( 18F, 16.5F, -1.907349E-06F );
		FissionTube6 = new ModelRenderer( this, 0, 7 );
		FissionTube6.setTextureSize( 256, 64 );
		FissionTube6.addBox( -16F, -2F, -1.5F, 32, 4, 3);
		FissionTube6.setRotationPoint( 0F, 7.5F, -18F );
		FissionTube7 = new ModelRenderer( this, 0, 7 );
		FissionTube7.setTextureSize( 256, 64 );
		FissionTube7.addBox( -16F, -2F, -1.5F, 32, 4, 3);
		FissionTube7.setRotationPoint( -17F, 7.5F, 0F );
		FissionTube8 = new ModelRenderer( this, 0, 7 );
		FissionTube8.setTextureSize( 256, 64 );
		FissionTube8.addBox( -16F, -2F, -1.5F, 32, 4, 3);
		FissionTube8.setRotationPoint( 18F, 7.5F, -1.907349E-06F );
		FissionTube5 = new ModelRenderer( this, 0, 7 );
		FissionTube5.setTextureSize( 256, 64 );
		FissionTube5.addBox( -16F, -2F, -1.5F, 32, 4, 3);
		FissionTube5.setRotationPoint( 0F, 7.5F, 17F );
		Redstone = new ModelRenderer( this, 154, 8 );
		Redstone.setTextureSize( 256, 64 );
		Redstone.addBox( -8F, -8F, -8F, 16, 16, 16);
		Redstone.setRotationPoint( 0F, 16F, 0F );
	}
	
	public void renderRedstone()
	{
		Redstone.renderWithRotation(0.0625f);
	}
	
	public void renderWalls()
	{
		Wall1.renderWithRotation(0.0625f);

		Wall2.rotateAngleY = 1.570796F;
		Wall2.renderWithRotation(0.0625f);

		Wall3.rotateAngleY = -3.141593F;
		Wall3.renderWithRotation(0.0625f);

		Wall4.rotateAngleY = -1.570796F;
		Wall4.renderWithRotation(0.0625f);
	}
	
	public void renderWalls(float percent)
	{
		Wall1 = new ModelRenderer( this, 120, 10 );
		Wall1.setTextureSize( 256, 64 );
		Wall1.addBox( -16F, -11.5F, -16F, 2, 23, 30);
		Wall1.setRotationPoint( 0F, 12F, 0F );
		Wall2 = new ModelRenderer( this, 120, 10 );
		Wall2.setTextureSize( 256, 64 );
		Wall2.addBox( -16F, -11.5F, -16F, 2, 23, 30);
		Wall2.setRotationPoint( 0F, 12F, 0F );
		Wall3 = new ModelRenderer( this, 120, 10 );
		Wall3.setTextureSize( 256, 64 );
		Wall3.addBox( -16F, -11.5F, -16F, 2, 23, 30);
		Wall3.setRotationPoint( 0F, 12F, 0F );
		Wall4 = new ModelRenderer( this, 120, 10 );
		Wall4.setTextureSize( 256, 64 );
		Wall4.addBox( -16F, -11.5F, -16F, 2, 23, 30);
		Wall4.setRotationPoint( 0F, 12F, 0F );
		
		Wall1.renderWithRotation(0.0625f);

		Wall2.rotateAngleY = 1.570796F;
		Wall2.renderWithRotation(0.0625f);

		Wall3.rotateAngleY = -3.141593F;
		Wall3.renderWithRotation(0.0625f);

		Wall4.rotateAngleY = -1.570796F;
		Wall4.renderWithRotation(0.0625f);
	}
	
	public void renderSecondWalls()
	{
		WallD1.renderWithRotation(0.0625f);
		WallD2.renderWithRotation(0.0625f);
		WallD3.renderWithRotation(0.0625f);
		WallD4.renderWithRotation(0.0625f);

		WallD5.rotateAngleY = -1.570796F;
		WallD5.renderWithRotation(0.0625f);

		WallD6.rotateAngleY = -1.570796F;
		WallD6.renderWithRotation(0.0625f);

		WallD7.rotateAngleY = -1.570796F;
		WallD7.renderWithRotation(0.0625f);

		WallD8.rotateAngleY = -1.570796F;
		WallD8.renderWithRotation(0.0625f);
	}
	
	public void renderPillars()
	{
		Pillar1.renderWithRotation(0.0625f);
		Pillar2.renderWithRotation(0.0625f);
		Pillar3.renderWithRotation(0.0625f);
		Pillar4.renderWithRotation(0.0625f);
	}
	
	public void renderPillars(float percent)
	{
        Pillar1 = new ModelRenderer( this, 0, 31 );
        Pillar1.setTextureSize( 256, 64 );
        Pillar1.addBox( -2F, (float) (-28F*(percent/1.02)), -2F, 4, (int) (28*percent), 4);
        Pillar1.setRotationPoint( 18F, 24F, 18F );
        
        
        Pillar2 = new ModelRenderer( this, 0, 31 );
        Pillar2.setTextureSize( 256, 64 );
        Pillar2.addBox( -2F, (float) (-28F*(percent/1.02)), -2F, 4, (int)(28*percent), 4);
        Pillar2.setRotationPoint( 18F, 24F, -18F );
        
        
        Pillar3 = new ModelRenderer( this, 0, 31 );
        Pillar3.setTextureSize( 256, 64 );
        Pillar3.addBox( -2F, (float) (-28F*(percent/1.02)), -2F, 4, (int)(28*percent), 4);
        Pillar3.setRotationPoint( -18F, 24F, -18F );
        
        
        Pillar4 = new ModelRenderer( this, 0, 31 );
        Pillar4.setTextureSize( 256, 64 );
        Pillar4.addBox( -2F, (float) (-28F*(percent/1.02)), -2F, 4, (int)(28*percent), 4);
        Pillar4.setRotationPoint( -18F, 24F, 18F );
		Pillar1.renderWithRotation(0.0625f);
		Pillar2.renderWithRotation(0.0625f);
		Pillar3.renderWithRotation(0.0625f);
		Pillar4.renderWithRotation(0.0625f);
	}
	
	public void renderWallPillars()
	{
		PillarW1.renderWithRotation(0.0625f);
		PillarW2.renderWithRotation(0.0625f);
		PillarW3.renderWithRotation(0.0625f);
		PillarW4.renderWithRotation(0.0625f);
	}
	
	public void renderTubes()
	{
		FissionTube.renderWithRotation(0.0625f);
		FissionTube2.renderWithRotation(0.0625f);

		FissionTube3.rotateAngleY = -1.570796F;
		FissionTube3.renderWithRotation(0.0625f);

		FissionTube4.rotateAngleY = -1.570796F;
		FissionTube4.renderWithRotation(0.0625f);

		FissionTube6.renderWithRotation(0.0625f);

		FissionTube7.rotateAngleY = -1.570796F;
		FissionTube7.renderWithRotation(0.0625f);

		FissionTube8.rotateAngleY = -1.570796F;
		FissionTube8.renderWithRotation(0.0625f);

		FissionTube5.renderWithRotation(0.0625f);
	}
	
	public void renderBase()
	{
		Base.renderWithRotation(0.0625f);
	}
}