package fr.darktech.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fr.darktech.DarkTech;
import fr.darktech.client.models.ModelObelisk;
import fr.darktech.tiles.TileEntityObelisk;

public class RenderObelisk extends TileEntitySpecialRenderer
{
	private ModelObelisk MODEL_OBELISK = new ModelObelisk();
	private ResourceLocation TEX_OBELISK = new ResourceLocation(DarkTech.modidFolder, "textures/blocks/model_obelisk.png");

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
		this.bindTexture(TEX_OBELISK);
		this.MODEL_OBELISK.render(0.0625f);
		GL11.glPopMatrix();
	}
}