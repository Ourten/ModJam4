package fr.darktech.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fr.darktech.DarkTech;
import fr.darktech.client.models.ModelGeneratorInvocator;
import fr.darktech.tiles.TileEntityGeneratorInvocator;

public class RenderGeneratorInvocator extends TileEntitySpecialRenderer
{
	private ModelGeneratorInvocator MODEL_INVOCATOR = new ModelGeneratorInvocator();
	private ResourceLocation TEX_INVOCATOR = new ResourceLocation(DarkTech.modidFolder, "textures/blocks/model_generator_invocator.png");
	
	private float varLight = 0f;
	private boolean revertedLight = false;
	
	private float deploy = 0f;
	
	@Override
	public void renderTileEntityAt(TileEntity arg0, double arg1, double arg2, double arg3, float arg4) 
	{
		renderGenerator((TileEntityGeneratorInvocator)arg0, arg1, arg2, arg3);
	}
	
	public void renderGenerator(TileEntityGeneratorInvocator invocator, double x, double y, double z)
	{
		GL11.glPushMatrix();
		GL11.glTranslated(x+0.5, y+1.471, z+0.5);
		GL11.glScalef(0.1F, 0.1F, 0.1F);
		GL11.glRotated(180, 0, 0, 1);
		this.bindTexture(TEX_INVOCATOR);
		MODEL_INVOCATOR.render(0.6F);
		/*MODEL_GENERATOR.renderWalls();
		MODEL_GENERATOR.renderSecondWalls();
		MODEL_GENERATOR.renderWallPillars();
		
		GL11.glColor3d(0, varLight, 0);
		GL11.glDisable(GL11.GL_LIGHTING);
		MODEL_GENERATOR.renderTubes();
		GL11.glColor3d(0, 0.9+varLight/10, 0);
		MODEL_GENERATOR.renderRedstone();
		GL11.glEnable(GL11.GL_LIGHTING);*/
		
		//GL11.glPopMatrix();
		//GL11.glPushMatrix();
		GL11.glColor3d(1, 1, 1);
	//	GL11.glTranslated(x+0.5, y+1.5-deploy, z+0.5);
		//GL11.glScaled(1, deploy, 1);
		//MODEL_GENERATOR.renderPillars(deploy);
		GL11.glPopMatrix();
		
		if(varLight>=0.9f)
			revertedLight = true;
		else if(varLight<=0.4f)
			revertedLight = false;
		
		if(revertedLight)
			varLight = varLight-0.003f;
		else
			varLight = varLight+0.003f;
		
		if(deploy<0.999)
			deploy = deploy+0.001f;
		else
			deploy = 0;
	}
}