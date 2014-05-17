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

		if(!AnimStates.generatorStates.get(1).isFinished())
			MODEL_GENERATOR.renderWalls(AnimStates.generatorStates.get(1).getPercent());
		else
			MODEL_GENERATOR.renderWalls();
		
		if(!AnimStates.generatorStates.get(2).isFinished())
			MODEL_GENERATOR.renderWallPillars(AnimStates.generatorStates.get(2).getPercent());
		else
			MODEL_GENERATOR.renderWallPillars();
		
		if(!AnimStates.generatorStates.get(3).isFinished())
			MODEL_GENERATOR.renderSecondWalls(AnimStates.generatorStates.get(3).getPercent());
		else
			MODEL_GENERATOR.renderSecondWalls();
		
		if(AnimStates.generatorStates.get(5).isFinished())
		{
			GL11.glColor3d(0, varLight, 0);
			GL11.glDisable(GL11.GL_LIGHTING);
		}
		
		if(!AnimStates.generatorStates.get(5).isFinished())
		{
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glTranslated(x+0.5, y+0.5+1*AnimStates.generatorStates.get(5).getPercent(), z+0.5);
			GL11.glRotated(180, 0, 0, 1);
			MODEL_GENERATOR.renderTubes(AnimStates.generatorStates.get(5).getPercent());
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glTranslated(x+0.5, y+1.5, z+0.5);
			GL11.glRotated(180, 0, 0, 1);
		}
		else
			MODEL_GENERATOR.renderTubes();
		
		if(AnimStates.generatorStates.get(5).isFinished())
			GL11.glColor3d(0, 0.9+varLight/10, 0);
		
		if(!AnimStates.generatorStates.get(4).isFinished())
			MODEL_GENERATOR.renderRedstone(AnimStates.generatorStates.get(4).getPercent());
		else
			MODEL_GENERATOR.renderRedstone();
		
		if(AnimStates.generatorStates.get(5).isFinished())
			GL11.glEnable(GL11.GL_LIGHTING);
		
		GL11.glColor3d(1, 1, 1);
		
		if(!AnimStates.generatorStates.get(0).isFinished())
			MODEL_GENERATOR.renderPillars(AnimStates.generatorStates.get(0).getPercent());
		else
			MODEL_GENERATOR.renderPillars();
		GL11.glPopMatrix();
		
		if(varLight>=0.9f)
			revertedLight = true;
		else if(varLight<=0.4f)
			revertedLight = false;
		
		if(!AnimStates.generatorStates.get(6).isFinished())
		{
			if(revertedLight)
				varLight = varLight-0.003f*AnimStates.generatorStates.get(6).getPercent();
			else
				varLight = varLight+0.003f*AnimStates.generatorStates.get(6).getPercent();
		}
		else
		{
			if(revertedLight)
				varLight = varLight-0.003f;
			else
				varLight = varLight+0.003f;
		}
		AnimStates.tickGeneratorStates();
	}
}