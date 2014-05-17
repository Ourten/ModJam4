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
	
	@Override
	public void renderTileEntityAt(TileEntity arg0, double arg1, double arg2, double arg3, float arg4) 
	{
		renderGenerator((TileEntityGeneratorInvocator)arg0, arg1, arg2, arg3);
	}
	
	public void renderGenerator(TileEntityGeneratorInvocator invocator, double x, double y, double z)
	{
		GL11.glPushMatrix();
		GL11.glTranslated(x+0.5, y+1.525, z+0.5);
		GL11.glScalef(0.1041F, 0.1041F, 0.1041F);
		GL11.glRotated(180, 0, 0, 1);
		this.bindTexture(TEX_INVOCATOR);
		MODEL_INVOCATOR.renderBase();
		
		setColorByState(invocator);
		MODEL_INVOCATOR.renderBaseLamps();
		GL11.glColor3d(1, 1, 1);
		
		for(int i = 0; i < 4; i++) {
			if(invocator.canDeployArm(i)) {
				MODEL_INVOCATOR.renderArm(i);
				setColorByState(invocator);
				MODEL_INVOCATOR.renderArmLamp(i);
			} else {
				setColorByState(invocator);
				MODEL_INVOCATOR.renderWithoutArmLamp(i);
			}
			GL11.glColor3d(1, 1, 1);
		}

		GL11.glPopMatrix();
	}
	
	private void setColorByState(TileEntityGeneratorInvocator invocator) {
		if(invocator.getFlashTime() < 10)
			GL11.glColor3d(1, 0.2, 0.6);
		else if(invocator.has3x3FreeZone())
			GL11.glColor3d(0, 1, 0);
		else
			GL11.glColor3d(1, 0, 0);
	}
}