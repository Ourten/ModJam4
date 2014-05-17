package fr.darktech.client.render;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import fr.darktech.client.ClientProxy;

public class InventoryRenderer implements ISimpleBlockRenderingHandler
{
	public static class RenderIndex
	{
		Block block;
		
		public RenderIndex(Block block)
		{
			this.block = block;
		}
		
		@Override
		public boolean equals(Object o)
		{
			if(!(o instanceof RenderIndex))
				return false;
			
			RenderIndex index = (RenderIndex)o;
			
			return index.block == block;
		}
	}
	
	public static HashMap<RenderIndex, IInventoryRenderer> render = new HashMap<RenderIndex, IInventoryRenderer>();

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer)
	{
		RenderIndex index = new RenderIndex(block);
		if(render.containsKey(index))
		{
			render.get(index).renderInventory(-0.5, -0.5, -0.5);
		}
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
	{
		return true;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId)
	{
		return true;
	}

	@Override
	public int getRenderId()
	{
		return ClientProxy.inventoryID;
	}
}