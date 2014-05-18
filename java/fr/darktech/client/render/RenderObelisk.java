package fr.darktech.client.render;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fr.darktech.DarkTech;
import fr.darktech.tiles.TileEntityObelisk;

public class RenderObelisk extends TileEntitySpecialRenderer implements IInventoryRenderer
{
	private ResourceLocation TEX_OBELISK = new ResourceLocation(DarkTech.modidFolder, "textures/blocks/model_obelisk.png");

	private float varLight = 0f;
	private boolean revertedLight = false;
	
	@Override
	public void renderTileEntityAt(TileEntity arg0, double arg1, double arg2,
			double arg3, float arg4) 
	{
		renderObelisk((TileEntityObelisk)arg0, arg1, arg2, arg3);
	}
	
	public void renderObelisk(TileEntityObelisk obelisk, double x, double y, double z)
	{
		GL11.glPushMatrix();
		GL11.glTranslated(x+0.5, y+1.5, z+0.5);
		GL11.glRotated(180, 0, 0, 1);
		
		if(obelisk == null) {
			GL11.glScaled(0.5, 0.5, 0.5);
			GL11.glTranslated(0, 2, 0);
		}
		
		this.bindTexture(TEX_OBELISK);
		obelisk.MODEL_OBELISK.renderBase();
		if(obelisk.isStartDeploy() && !obelisk.obeliskStates.get(0).isFinished())
			obelisk.MODEL_OBELISK.renderPillars(obelisk.obeliskStates.get(0).getPercent());
		else
		{
			obelisk.MODEL_OBELISK.renderPillars();
			
			if(obelisk.isObeliskFinished())
			{
				GL11.glDisable(GL11.GL_LIGHTING);
				GL11.glColor3d(0, varLight, 0);
			}
			else
			{
				if(obelisk.isStartDeploy() && obelisk.obeliskStates.get(6).getPercent() != 0)
				{
					GL11.glDisable(GL11.GL_LIGHTING);
					GL11.glColor3d(0, obelisk.obeliskStates.get(6).getPercent()+0.3f, 0);
				}
			}
			
			obelisk.MODEL_OBELISK.renderLumPillar();
			GL11.glEnable(GL11.GL_LIGHTING);
			GL11.glColor3f(1, 1, 1);
		}
		
		if(obelisk.isStartDeploy() && !obelisk.obeliskStates.get(1).isFinished())
			obelisk.MODEL_OBELISK.renderPillarsCorners(obelisk.obeliskStates.get(1).getPercent());
		else
			obelisk.MODEL_OBELISK.renderPillarsCorners();
		
		if(obelisk.isStartDeploy() && !obelisk.obeliskStates.get(2).isFinished())
			obelisk.MODEL_OBELISK.renderWalls(obelisk.obeliskStates.get(2).getPercent());
		else
			obelisk.MODEL_OBELISK.renderWalls();
		
		if(obelisk.isStartDeploy() && !obelisk.obeliskStates.get(3).isFinished())
			obelisk.MODEL_OBELISK.renderSecondWalls(obelisk.obeliskStates.get(3).getPercent());
		else
			obelisk.MODEL_OBELISK.renderSecondWalls();
		
		if(obelisk.isStartDeploy() && !obelisk.obeliskStates.get(4).isFinished())
			obelisk.MODEL_OBELISK.renderPillarsWalls(obelisk.obeliskStates.get(4).getPercent());
		else
			obelisk.MODEL_OBELISK.renderPillarsWalls();
		
		GL11.glDisable(GL11.GL_ALPHA_TEST | GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_BLEND);
		OpenGlHelper.glBlendFunc(770, 771, 1, 0);
		GL11.glDepthMask(false);
		GL11.glDisable(GL11.GL_LIGHTING);
		
		if(obelisk.isStartDeploy() && !obelisk.obeliskStates.get(5).isFinished())
			obelisk.MODEL_OBELISK.renderLogo(obelisk.obeliskStates.get(5).getPercent());
		else
			obelisk.MODEL_OBELISK.renderLogo();
		
		GL11.glDepthMask(true);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glEnable(GL11.GL_LIGHTING);
		
		GL11.glPopMatrix();
		
		if(obelisk.isObeliskFinished() || !obelisk.isStartDeploy())
		{
			if(revertedLight)
				varLight = varLight-0.003f;
			else
				varLight = varLight+0.003f;
		}
	}
	
	@Override
	public void renderInventory(double x, double y, double z) 
	{
		renderObelisk(null, x, y, z);
	}
}