package fr.darktech.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fr.darktech.DarkTech;
import fr.darktech.client.models.ModelGenerator;
import fr.darktech.tiles.TileEntityGenerator;

public class RenderGenerator extends TileEntitySpecialRenderer
{
	private ModelGenerator MODEL_GENERATOR = new ModelGenerator();
	private ResourceLocation TEX_GENERATOR = new ResourceLocation(DarkTech.modidFolder, "textures/blocks/model_generator.png");
	
	private float varLight = 0f;
	private boolean revertedLight = false;
	
	@Override
	public void renderTileEntityAt(TileEntity arg0, double arg1, double arg2,
			double arg3, float arg4) 
	{
		renderGenerator((TileEntityGenerator)arg0, arg1, arg2, arg3);
	}
	
	public void renderGenerator(TileEntityGenerator generator, double x, double y, double z)
	{
		GL11.glPushMatrix();
		GL11.glTranslated(x+0.5, y+1.5, z+0.5);
		GL11.glRotated(180, 0, 0, 1);
		this.bindTexture(TEX_GENERATOR);
		MODEL_GENERATOR.renderBase();
		MODEL_GENERATOR.renderWalls();
		MODEL_GENERATOR.renderSecondWalls();
		MODEL_GENERATOR.renderWallPillars();
		MODEL_GENERATOR.renderPillars();
		
		GL11.glColor3d(0, varLight, 0);
		GL11.glDisable(GL11.GL_LIGHTING);
		MODEL_GENERATOR.renderTubes();
		MODEL_GENERATOR.renderRedstone();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
		
		if(varLight>=0.8f)
			revertedLight = true;
		else if(varLight<=0.4f)
			revertedLight = false;
		
		if(revertedLight)
			varLight = varLight-0.003f;
		else
			varLight = varLight+0.003f;
	}
}