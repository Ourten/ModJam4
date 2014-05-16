package fr.darktech.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import fr.darktech.tiles.TileEntityGenerator;

public class BlockGenerator extends BlockContainer
{
	public BlockGenerator() 
	{
		super(Material.iron);
	}

	@Override
	public TileEntity createNewTileEntity(World arg0, int arg1) 
	{
		return new TileEntityGenerator();
	}
}