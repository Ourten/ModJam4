package fr.darktech.blocks;

import scala.reflect.internal.Trees.This;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import fr.darktech.DarkTech;
import fr.darktech.network.INetCompatible;
import fr.darktech.network.NetworkManager;
import fr.darktech.tiles.TileEntityGenerator;

public class BlockGenerator extends BlockContainer {
    public BlockGenerator() {
	super(Material.iron);
	this.setBlockName("BlockGenerator");
	this.setCreativeTab(DarkTech.tabDarkTech);
    }

    @Override
    public int getLightValue(IBlockAccess w, int x, int y, int z) {
	return 15;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess w, int x, int y, int z,
	    int side) {
	return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
	return false;
    }

    public void onBlockAdded(World w, int x, int y, int z) {
	TileEntity tile = w.getTileEntity(x, y, z);
	if (tile instanceof TileEntityGenerator) {
	    ((TileEntityGenerator) tile).setNetwork(NetworkManager
		    .getNetworkManager().registerTileEntityInNetwork(
			    (INetCompatible) tile,
			    "network_" + System.currentTimeMillis()));
	}

    }

    public void breakBlock(World w, int x, int y, int z, Block b,
	    int p_149749_6_) {
	TileEntity tile = w.getTileEntity(x, y, z);
	if (tile instanceof TileEntityGenerator)
	    NetworkManager.getNetworkManager().removeTileEntity(
		    (INetCompatible) tile,
		    ((TileEntityGenerator) tile).getNetwork().mapName);
    }

    @Override
    public boolean isOpaqueCube() {
	return false;
    }

    @Override
    public TileEntity createNewTileEntity(World arg0, int arg1) {
	return new TileEntityGenerator();
    }
}