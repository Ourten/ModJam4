package fr.darktech.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fr.darktech.client.models.ModelGenerator;
import fr.darktech.tiles.TileEntityGenerator;

public class RenderGenerator extends TileEntitySpecialRenderer
{
	private ModelGenerator MODEL_GENERATOR = new ModelGenerator();
	private ResourceLocation TEX_GENERATOR = new ResourceLocation("");
	
	@Override
	public void renderTileEntityAt(TileEntity arg0, double arg1, double arg2,
			double arg3, float arg4) 
	{
		renderGenerator((TileEntityGenerator)arg0, arg1, arg2, arg3);
	}
	
	public void renderGenerator(TileEntityGenerator generator, double x, double y, double z)
	{
		GL11.glPushMatrix();
		
		
		GL11.glPopMatrix();
	}
}