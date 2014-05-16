package fr.darktech.network;

import java.util.ArrayList;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;

public class Network extends WorldSavedData implements INetwork {

    
    private World world;
    //private TileEntity[] tile;
    private ArrayList<TileEntity> tile;
    public Network(World w)
    {
	super(w.getWorldInfo().getWorldName());
	this.world = w;
	this.tile = new ArrayList<TileEntity>();
    }
    @Override
    public World getWorld() {
	// TODO Auto-generated method stub
	return world;
    }

    @Override
    public ArrayList<TileEntity> getTileEntities() {
	// TODO Auto-generated method stub
	return this.tile;
    }
    @Override
    public void readFromNBT(NBTTagCompound var1) {
	// TODO Auto-generated method stub
	
    }
    @Override
    public void writeToNBT(NBTTagCompound var1) {
	// TODO Auto-generated method stub
	
    }

}
