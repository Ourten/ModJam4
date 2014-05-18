package fr.darktech.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fr.darktech.DarkTech;
import fr.darktech.tiles.TileEntityGenerator;

public class RenderGenerator extends TileEntitySpecialRenderer implements IInventoryRenderer
{
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
		
		if(generator == null) {
			GL11.glScaled(0.5, 0.5, 0.5);
			GL11.glTranslated(0, 2, 0);
		}
		
		this.bindTexture(TEX_GENERATOR);
		
		generator.MODEL_GENERATOR.renderBase();

		if(!generator.generatorStates.get(1).isFinished())
			generator.MODEL_GENERATOR.renderWalls(generator.generatorStates.get(1).getPercent());
		else
			generator.MODEL_GENERATOR.renderWalls();
		
		if(!generator.generatorStates.get(2).isFinished())
			generator.MODEL_GENERATOR.renderWallPillars(generator.generatorStates.get(2).getPercent());
		else
			generator.MODEL_GENERATOR.renderWallPillars();
		
		if(!generator.generatorStates.get(3).isFinished())
			generator.MODEL_GENERATOR.renderSecondWalls(generator.generatorStates.get(3).getPercent());
		else
			generator.MODEL_GENERATOR.renderSecondWalls();
		
		if(generator.generatorStates.get(5).isFinished())
		{
			GL11.glColor3d(0, varLight, 0);
			GL11.glDisable(GL11.GL_LIGHTING);
		}
		
		if(!generator.generatorStates.get(5).isFinished())
		{
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glTranslated(x+0.5, y+0.5+1*generator.generatorStates.get(5).getPercent(), z+0.5);
			GL11.glRotated(180, 0, 0, 1);
			generator.MODEL_GENERATOR.renderTubes(generator.generatorStates.get(5).getPercent());
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glTranslated(x+0.5, y+1.5, z+0.5);
			GL11.glRotated(180, 0, 0, 1);
		}
		else
			generator.MODEL_GENERATOR.renderTubes();
		
		if(generator.generatorStates.get(5).isFinished())
			GL11.glColor3d(0, 0.9+varLight/10, 0);
		
		if(!generator.generatorStates.get(4).isFinished())
			generator.MODEL_GENERATOR.renderRedstone(generator.generatorStates.get(4).getPercent());
		else
			generator.MODEL_GENERATOR.renderRedstone();
		
		if(generator.generatorStates.get(5).isFinished())
			GL11.glEnable(GL11.GL_LIGHTING);
		
		GL11.glColor3d(1, 1, 1);
		
		if(!generator.generatorStates.get(0).isFinished())
			generator.MODEL_GENERATOR.renderPillars(generator.generatorStates.get(0).getPercent());
		else
			generator.MODEL_GENERATOR.renderPillars();
		GL11.glPopMatrix();
		
		if(varLight>=0.9f)
			revertedLight = true;
		else if(varLight<=0.4f)
			revertedLight = false;
		
		if(!generator.generatorStates.get(6).isFinished())
		{
			if(revertedLight)
				varLight = varLight-0.003f*generator.generatorStates.get(6).getPercent();
			else
				varLight = varLight+0.003f*generator.generatorStates.get(6).getPercent();
		}
		else
		{
			if(revertedLight)
				varLight = varLight-0.003f;
			else
				varLight = varLight+0.003f;
		}
		generator.tickGeneratorStates();
	}
	
	@Override
	public void renderInventory(double x, double y, double z) 
	{
		renderGenerator(null, x, y, z);
	}
}