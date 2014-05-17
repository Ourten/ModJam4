package fr.darktech.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelObelisk extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer Pillar1;
    ModelRenderer Pillar2;
    ModelRenderer PillarLum1;
    ModelRenderer Logo;
    ModelRenderer Logo1;
    ModelRenderer Logo2;
    ModelRenderer PillarCorner1;
    ModelRenderer PillarCorner2;
    ModelRenderer PillarCorner3;
    ModelRenderer PillarCorner4;
    ModelRenderer Wall1;
    ModelRenderer Wall2;
    ModelRenderer Wall3;
    ModelRenderer Wall4;
    ModelRenderer Wall5;
    ModelRenderer Wall6;
    ModelRenderer Wall7;
    ModelRenderer Wall8;
    ModelRenderer PillarWall1;
    ModelRenderer PillarWall2;
    ModelRenderer PillarWall3;
    ModelRenderer PillarWall4;
    ModelRenderer PillarWall5;
    ModelRenderer PillarWall6;
    ModelRenderer PillarWall7;
    ModelRenderer PillarWall8;
    ModelRenderer PillarWall9;
    ModelRenderer PillarWall10;
    ModelRenderer PillarWall11;
    ModelRenderer PillarWall12;

    public ModelObelisk()
    {
        Base = new ModelRenderer( this, 0, 97 );
        Base.setTextureSize( 128, 128 );
        Base.addBox( -15F, -0.5F, -15F, 30, 1, 30);
        Base.setRotationPoint( 0F, 24F, 0F );
        Pillar1 = new ModelRenderer( this, 48, 47 );
        Pillar1.setTextureSize( 128, 128 );
        Pillar1.addBox( -10F, -15F, -10F, 20, 30, 20);
        Pillar1.setRotationPoint( 0F, 9F, 0F );
        Pillar2 = new ModelRenderer( this, 48, 15 );
        Pillar2.setTextureSize( 128, 128 );
        Pillar2.addBox( -10F, -6F, -10F, 20, 12, 20);
        Pillar2.setRotationPoint( 0F, -13.5F, 0F );
        PillarLum1 = new ModelRenderer( this, 0, -7 );
        PillarLum1.setTextureSize( 128, 128 );
        PillarLum1.addBox( -9.5F, -1F, -9.5F, 19, 2, 19);
        PillarLum1.setRotationPoint( 0F, -6.5F, 0F );
        Logo = new ModelRenderer( this, 0, 20 );
        Logo.setTextureSize( 128, 128 );
        Logo.addBox( -6F, -7.5F, -11.25F, 12, 14, 0);
        Logo.setRotationPoint( 0F, 4F, 0F );
        Logo1 = new ModelRenderer( this, 0, 20 );
        Logo1.setTextureSize( 128, 128 );
        Logo1.addBox( -6F, -7.5F, -11.25F, 12, 14, 0);
        Logo1.setRotationPoint( 0F, 4F, 0F );
        Logo2 = new ModelRenderer( this, 0, 20 );
        Logo2.setTextureSize( 128, 128 );
        Logo2.addBox( -6F, -7.5F, 0F, 12, 14, 0);
        Logo2.setRotationPoint( 0F, 4F, 0F );
        PillarCorner1 = new ModelRenderer( this, 112, 0 );
        PillarCorner1.setTextureSize( 128, 128 );
        PillarCorner1.addBox( -2F, -9F, -2F, 4, 18, 4);
        PillarCorner1.setRotationPoint( -12F, 14.5F, 12F );
        PillarCorner2 = new ModelRenderer( this, 112, 0 );
        PillarCorner2.setTextureSize( 128, 128 );
        PillarCorner2.addBox( -2F, -9F, -2F, 4, 18, 4);
        PillarCorner2.setRotationPoint( -12F, 14.5F, -12F );
        PillarCorner3 = new ModelRenderer( this, 112, 0 );
        PillarCorner3.setTextureSize( 128, 128 );
        PillarCorner3.addBox( -2F, -9F, -2F, 4, 18, 4);
        PillarCorner3.setRotationPoint( 12F, 14.5F, -12F );
        PillarCorner4 = new ModelRenderer( this, 112, 0 );
        PillarCorner4.setTextureSize( 128, 128 );
        PillarCorner4.addBox( -2F, -9F, -2F, 4, 18, 4);
        PillarCorner4.setRotationPoint( 12F, 14.5F, 12F );
        Wall1 = new ModelRenderer( this, 0, 62 );
        Wall1.setTextureSize( 128, 128 );
        Wall1.addBox( -0.5F, -7.5F, -10F, 1, 15, 20);
        Wall1.setRotationPoint( -10.5F, 16F, 0F );
        Wall2 = new ModelRenderer( this, 0, 62 );
        Wall2.setTextureSize( 128, 128 );
        Wall2.addBox( -0.5F, -7.5F, -10F, 1, 15, 20);
        Wall2.setRotationPoint( 10.5F, 16F, 0F );
        Wall3 = new ModelRenderer( this, 0, 62 );
        Wall3.setTextureSize( 128, 128 );
        Wall3.addBox( -0.5F, -7.5F, -10F, 1, 15, 20);
        Wall3.setRotationPoint( 0F, 16F, -10.5F );
        Wall4 = new ModelRenderer( this, 0, 62 );
        Wall4.setTextureSize( 128, 128 );
        Wall4.addBox( -0.5F, -7.5F, -10F, 1, 15, 20);
        Wall4.setRotationPoint( 9.536743E-07F, 16F, 10.5F );
        Wall5 = new ModelRenderer( this, 0, 34 );
        Wall5.setTextureSize( 128, 128 );
        Wall5.addBox( -1F, -4F, -10F, 2, 8, 20);
        Wall5.setRotationPoint( -12F, 19.5F, 0F );
        Wall6 = new ModelRenderer( this, 0, 34 );
        Wall6.setTextureSize( 128, 128 );
        Wall6.addBox( -1F, -4F, -10F, 2, 8, 20);
        Wall6.setRotationPoint( 12F, 19.5F, 0F );
        Wall7 = new ModelRenderer( this, 0, 34 );
        Wall7.setTextureSize( 128, 128 );
        Wall7.addBox( -1F, -4F, -10F, 2, 8, 20);
        Wall7.setRotationPoint( 0F, 19.5F, -12F );
        Wall8 = new ModelRenderer( this, 0, 34 );
        Wall8.setTextureSize( 128, 128 );
        Wall8.addBox( -1F, -4F, -10F, 2, 8, 20);
        Wall8.setRotationPoint( 0F, 19.5F, 12F );
        PillarWall1 = new ModelRenderer( this, 0, 73 );
        PillarWall1.setTextureSize( 128, 128 );
        PillarWall1.addBox( -1F, -3.5F, -1F, 2, 7, 2);
        PillarWall1.setRotationPoint( -13.5F, 20F, 0F );
        PillarWall2 = new ModelRenderer( this, 0, 73 );
        PillarWall2.setTextureSize( 128, 128 );
        PillarWall2.addBox( -1F, -3.5F, -1F, 2, 7, 2);
        PillarWall2.setRotationPoint( -13.5F, 20F, -4F );
        PillarWall3 = new ModelRenderer( this, 0, 73 );
        PillarWall3.setTextureSize( 128, 128 );
        PillarWall3.addBox( -1F, -3.5F, -1F, 2, 7, 2);
        PillarWall3.setRotationPoint( -13.5F, 20F, 4F );
        PillarWall4 = new ModelRenderer( this, 0, 73 );
        PillarWall4.setTextureSize( 128, 128 );
        PillarWall4.addBox( -1F, -3.5F, -1F, 2, 7, 2);
        PillarWall4.setRotationPoint( 0F, 20F, 13.5F );
        PillarWall5 = new ModelRenderer( this, 0, 73 );
        PillarWall5.setTextureSize( 128, 128 );
        PillarWall5.addBox( -1F, -3.5F, -1F, 2, 7, 2);
        PillarWall5.setRotationPoint( 4F, 20F, 13.5F );
        PillarWall6 = new ModelRenderer( this, 0, 73 );
        PillarWall6.setTextureSize( 128, 128 );
        PillarWall6.addBox( -1F, -3.5F, -1F, 2, 7, 2);
        PillarWall6.setRotationPoint( -4F, 20F, 13.5F );
        PillarWall7 = new ModelRenderer( this, 0, 73 );
        PillarWall7.setTextureSize( 128, 128 );
        PillarWall7.addBox( -1F, -3.5F, -1F, 2, 7, 2);
        PillarWall7.setRotationPoint( 0F, 20F, -13.5F );
        PillarWall8 = new ModelRenderer( this, 0, 73 );
        PillarWall8.setTextureSize( 128, 128 );
        PillarWall8.addBox( -1F, -3.5F, -1F, 2, 7, 2);
        PillarWall8.setRotationPoint( 4F, 20F, -13.5F );
        PillarWall9 = new ModelRenderer( this, 0, 73 );
        PillarWall9.setTextureSize( 128, 128 );
        PillarWall9.addBox( -1F, -3.5F, -1F, 2, 7, 2);
        PillarWall9.setRotationPoint( -4F, 20F, -13.5F );
        PillarWall10 = new ModelRenderer( this, 0, 73 );
        PillarWall10.setTextureSize( 128, 128 );
        PillarWall10.addBox( -1F, -3.5F, -1F, 2, 7, 2);
        PillarWall10.setRotationPoint( 13.5F, 20F, 0F );
        PillarWall11 = new ModelRenderer( this, 0, 73 );
        PillarWall11.setTextureSize( 128, 128 );
        PillarWall11.addBox( -1F, -3.5F, -1F, 2, 7, 2);
        PillarWall11.setRotationPoint( 13.5F, 20F, -4F );
        PillarWall12 = new ModelRenderer( this, 0, 73 );
        PillarWall12.setTextureSize( 128, 128 );
        PillarWall12.addBox( -1F, -3.5F, -1F, 2, 7, 2);
        PillarWall12.setRotationPoint( 13.5F, 20F, 4F );
    }

   public void render(float par7)
   {
        Base.rotateAngleX = 0F;
        Base.rotateAngleY = 0F;
        Base.rotateAngleZ = 0F;
        Base.renderWithRotation(par7);

        Pillar1.rotateAngleX = 0F;
        Pillar1.rotateAngleY = 0F;
        Pillar1.rotateAngleZ = 0F;
        Pillar1.renderWithRotation(par7);

        Pillar2.rotateAngleX = 0F;
        Pillar2.rotateAngleY = 0F;
        Pillar2.rotateAngleZ = 0F;
        Pillar2.renderWithRotation(par7);

        PillarLum1.rotateAngleX = 0F;
        PillarLum1.rotateAngleY = 0F;
        PillarLum1.rotateAngleZ = 0F;
        PillarLum1.renderWithRotation(par7);

        Logo.rotateAngleX = 0F;
        Logo.rotateAngleY = -3.141593F;
        Logo.rotateAngleZ = 0F;
        Logo.renderWithRotation(par7);

        Logo1.rotateAngleX = -6.283185F;
        Logo1.rotateAngleY = -1.570796F;
        Logo1.rotateAngleZ = 0F;
        Logo1.renderWithRotation(par7);

        Logo2.rotateAngleX = 0F;
        Logo2.rotateAngleY = 1.685874E-07F;
        Logo2.rotateAngleZ = 0F;
        Logo2.renderWithRotation(par7);

        PillarCorner1.rotateAngleX = 0F;
        PillarCorner1.rotateAngleY = 0F;
        PillarCorner1.rotateAngleZ = 0F;
        PillarCorner1.renderWithRotation(par7);

        PillarCorner2.rotateAngleX = 0F;
        PillarCorner2.rotateAngleY = 0F;
        PillarCorner2.rotateAngleZ = 0F;
        PillarCorner2.renderWithRotation(par7);

        PillarCorner3.rotateAngleX = 0F;
        PillarCorner3.rotateAngleY = 0F;
        PillarCorner3.rotateAngleZ = 0F;
        PillarCorner3.renderWithRotation(par7);

        PillarCorner4.rotateAngleX = 0F;
        PillarCorner4.rotateAngleY = 0F;
        PillarCorner4.rotateAngleZ = 0F;
        PillarCorner4.renderWithRotation(par7);

        Wall1.rotateAngleX = 0F;
        Wall1.rotateAngleY = 0F;
        Wall1.rotateAngleZ = 0F;
        Wall1.renderWithRotation(par7);

        Wall2.rotateAngleX = 0F;
        Wall2.rotateAngleY = 0F;
        Wall2.rotateAngleZ = 0F;
        Wall2.renderWithRotation(par7);

        Wall3.rotateAngleX = 0F;
        Wall3.rotateAngleY = -1.570796F;
        Wall3.rotateAngleZ = 0F;
        Wall3.renderWithRotation(par7);

        Wall4.rotateAngleX = 0F;
        Wall4.rotateAngleY = -1.570796F;
        Wall4.rotateAngleZ = 0F;
        Wall4.renderWithRotation(par7);

        Wall5.rotateAngleX = 0F;
        Wall5.rotateAngleY = 0F;
        Wall5.rotateAngleZ = 0F;
        Wall5.renderWithRotation(par7);

        Wall6.rotateAngleX = 0F;
        Wall6.rotateAngleY = 0F;
        Wall6.rotateAngleZ = 0F;
        Wall6.renderWithRotation(par7);

        Wall7.rotateAngleX = 0F;
        Wall7.rotateAngleY = -1.570796F;
        Wall7.rotateAngleZ = 0F;
        Wall7.renderWithRotation(par7);

        Wall8.rotateAngleX = 0F;
        Wall8.rotateAngleY = -1.570796F;
        Wall8.rotateAngleZ = 0F;
        Wall8.renderWithRotation(par7);

        PillarWall1.rotateAngleX = 0F;
        PillarWall1.rotateAngleY = 0F;
        PillarWall1.rotateAngleZ = 0F;
        PillarWall1.renderWithRotation(par7);

        PillarWall2.rotateAngleX = 0F;
        PillarWall2.rotateAngleY = 0F;
        PillarWall2.rotateAngleZ = 0F;
        PillarWall2.renderWithRotation(par7);

        PillarWall3.rotateAngleX = 0F;
        PillarWall3.rotateAngleY = 0F;
        PillarWall3.rotateAngleZ = 0F;
        PillarWall3.renderWithRotation(par7);

        PillarWall4.rotateAngleX = 0F;
        PillarWall4.rotateAngleY = -1.570796F;
        PillarWall4.rotateAngleZ = 0F;
        PillarWall4.renderWithRotation(par7);

        PillarWall5.rotateAngleX = 0F;
        PillarWall5.rotateAngleY = -1.570796F;
        PillarWall5.rotateAngleZ = 0F;
        PillarWall5.renderWithRotation(par7);

        PillarWall6.rotateAngleX = 0F;
        PillarWall6.rotateAngleY = -1.570796F;
        PillarWall6.rotateAngleZ = 0F;
        PillarWall6.renderWithRotation(par7);

        PillarWall7.rotateAngleX = 0F;
        PillarWall7.rotateAngleY = -1.570796F;
        PillarWall7.rotateAngleZ = 0F;
        PillarWall7.renderWithRotation(par7);

        PillarWall8.rotateAngleX = 0F;
        PillarWall8.rotateAngleY = -1.570796F;
        PillarWall8.rotateAngleZ = 0F;
        PillarWall8.renderWithRotation(par7);

        PillarWall9.rotateAngleX = 0F;
        PillarWall9.rotateAngleY = -1.570796F;
        PillarWall9.rotateAngleZ = 0F;
        PillarWall9.renderWithRotation(par7);

        PillarWall10.rotateAngleX = 0F;
        PillarWall10.rotateAngleY = 0F;
        PillarWall10.rotateAngleZ = 0F;
        PillarWall10.renderWithRotation(par7);

        PillarWall11.rotateAngleX = 0F;
        PillarWall11.rotateAngleY = 0F;
        PillarWall11.rotateAngleZ = 0F;
        PillarWall11.renderWithRotation(par7);

        PillarWall12.rotateAngleX = 0F;
        PillarWall12.rotateAngleY = 0F;
        PillarWall12.rotateAngleZ = 0F;
        PillarWall12.renderWithRotation(par7);
    }
}