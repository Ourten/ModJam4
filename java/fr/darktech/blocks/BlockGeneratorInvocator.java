package fr.darktech.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import fr.darktech.DarkTech;
import fr.darktech.tiles.TileEntityGeneratorInvocator;

public class BlockGeneratorInvocator extends BlockContainer
{
	public BlockGeneratorInvocator() 
	{
		super(Material.iron);
		this.setBlockName("BlockGeneratorInvocator");
		this.setCreativeTab(DarkTech.tabDarkTech);
	}
	
	@Override
	public int getLightValue(IBlockAccess w, int x, int y, int z)
	{
		TileEntityGeneratorInvocator tile = (TileEntityGeneratorInvocator) w.getTileEntity(x, y, z);
		if(tile.canPlaceGenerator())
			return 15;
		return 0;
	}
	
	@Override
	public boolean shouldSideBeRendered(IBlockAccess w, int x, int y, int z, int side)
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World arg0, int arg1) 
	{
		return new TileEntityGeneratorInvocator();
	}
}