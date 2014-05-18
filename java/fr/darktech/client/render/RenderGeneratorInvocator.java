package fr.darktech.client.render;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fr.darktech.DarkTech;
import fr.darktech.client.models.ModelGeneratorInvocator;
import fr.darktech.tiles.TileEntityGeneratorInvocator;

public class RenderGeneratorInvocator extends TileEntitySpecialRenderer implements IInventoryRenderer
{
	private ModelGeneratorInvocator MODEL_INVOCATOR = new ModelGeneratorInvocator();
	private ResourceLocation TEX_INVOCATOR = new ResourceLocation(DarkTech.modidFolder, "textures/blocks/model_generator_invocator.png");

	public RenderGeneratorInvocator()
	{
		this.func_147497_a(TileEntityRendererDispatcher.instance);
	}
	
	@Override
	public void renderTileEntityAt(TileEntity arg0, double arg1, double arg2, double arg3, float arg4) 
	{
		renderGenerator((TileEntityGeneratorInvocator)arg0, arg1, arg2, arg3);
	}

	public void renderGenerator(TileEntityGeneratorInvocator invocator, double x, double y, double z)
	{
		GL11.glPushMatrix();
		GL11.glTranslated(x+0.5, y+1.525, z+0.5);
		if(invocator == null)
			GL11.glScaled(0.5, 1, 0.5);
		GL11.glRotated(180, 0, 0, 1);
		this.bindTexture(TEX_INVOCATOR);
		MODEL_INVOCATOR.renderBase();

		if(invocator != null)
		{
			for(int i = 0; i < 4; i++) {
				setColorByState(invocator, i + 4);
				MODEL_INVOCATOR.renderBaseLamp(i);
			}
		}
		GL11.glColor3d(1, 1, 1);

		if(invocator != null)
		{
			for(int i = 0; i < 4; i++) {
				if(invocator.canDeployArm(i)) {
					MODEL_INVOCATOR.renderArm(i);
					setColorByState(invocator, i);
					MODEL_INVOCATOR.renderArmLamp(i);
				} else {
					setColorByState(invocator, i);
					MODEL_INVOCATOR.renderWithoutArmLamp(i);
				}
				GL11.glColor3d(1, 1, 1);
			}
		}
		else
		{
			for(int i = 0; i < 4; i++) 
			{
				MODEL_INVOCATOR.renderArm(i);
				MODEL_INVOCATOR.renderArmLamp(i);
				MODEL_INVOCATOR.renderWithoutArmLamp(i);
			}
		}

		GL11.glPopMatrix();
	}

	private void setColorByState(TileEntityGeneratorInvocator invocator, int side) {
		if(invocator.getFlashTime() < 10)
			GL11.glColor3d(1, 0.2, 0.6);
		else if(invocator.isFree(side))
			GL11.glColor3d(0, 1, 0);
		else
			GL11.glColor3d(1, 0, 0);
	}

	@Override
	public void renderInventory(double x, double y, double z) 
	{
		renderGenerator(null, x, y, z);
	}
}