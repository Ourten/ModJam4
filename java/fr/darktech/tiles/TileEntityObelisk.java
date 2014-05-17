package fr.darktech.tiles;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityObelisk extends TileEntity
{
	public TileEntityObelisk()
	{
		
	}
	
	@Override
	public AxisAlignedBB getRenderBoundingBox()
	{
		return AxisAlignedBB.getAABBPool().getAABB(xCoord, yCoord, zCoord, xCoord + 2, yCoord + 3, zCoord + 2);
	}
}