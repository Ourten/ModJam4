package fr.darktech.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import fr.darktech.DarkTech;
import fr.darktech.client.ClientProxy;
import fr.darktech.tiles.TileEntityObelisk;

public class BlockObelisk extends BlockContainer
{
	public BlockObelisk() 
	{
		super(Material.iron);
		this.setBlockName("BlockObelisk");
		this.setCreativeTab(DarkTech.tabDarkTech);
	}

	@SideOnly(Side.CLIENT)
	public int getRenderType()
	{
		return ClientProxy.inventoryID;
	}
	
	@Override
	public int getLightValue(IBlockAccess w, int x, int y, int z)
	{
		return 4;
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
		return new TileEntityObelisk();
	}
}