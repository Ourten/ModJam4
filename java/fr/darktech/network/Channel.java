package fr.darktech.network;

import java.util.ArrayList;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.darktech.energy.IEnergyReceiver;
import fr.darktech.energy.IEnergySource;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;

public class Channel extends WorldSavedData implements IChannel {

    private World world;
    // private TileEntity[] tile;
    private ArrayList<TileEntity> tile;
    private ArrayList<IEnergySource> energySources;

    private int energyRemaning;
    private boolean needEnergyUpdate;
    private int totalProduceEnergy;
    public Channel(World w, String name) {
	super("DarkTechNet_" + w.getWorldInfo().getWorldName() + "_" + name);
	this.world = w;
	this.needEnergyUpdate = false;
	this.tile = new ArrayList<TileEntity>();
	this.energySources = new ArrayList<IEnergySource>();
    }

    @Override
    public World getWorld() {
	return world;
    }

    public boolean registerTile(TileEntity t) {
	if (this.tile.contains(t))
	    return false;
	if (!this.tile.add(t))
	    return false;
	System.out.println("Registered TileEntity (x:" + t.xCoord + ", y:"
		+ t.yCoord + ", z:" + t.zCoord);
	if (t instanceof IEnergySource) {
	    IEnergySource s = (IEnergySource) t;
	    this.registerEnergySource(s);
	}
	return true;
    }

    public boolean registerEnergySource(IEnergySource s) {
	if (energySources.contains(s))
	    return false;
	if (!energySources.add(s))
	{
	    this.needEnergyUpdate = true;
	    return true;
	}

	
	return false;

    }
    
    public int getEnergyTotalOutput()
    {
	totalProduceEnergy = 0;
	this.needEnergyUpdate = false;
	for(int i = 0; i < energySources.size(); i++)
	{
	    IEnergySource e = energySources.get(i);
	    if(e == null) energySources.remove(i);
	    totalProduceEnergy += e.getOutput();
	}
	return totalProduceEnergy;
    }
    

    @Override
    public ArrayList<TileEntity> getTileEntities() {

	return this.tile;
    }

    @Override
    public void readFromNBT(NBTTagCompound var1) {

    }

    public boolean isEnergyUpdateNeeded()
    {
	return this.needEnergyUpdate;
    }
    @Override
    public void writeToNBT(NBTTagCompound var1) {

    }
    public boolean removeTile(TileEntity t) {
	// TODO Auto-generated method stub
	if (!this.tile.contains(t))
	    return false;
	if (!this.tile.remove(t))
	    return false;
	System.out.println("Remove TileEntity (x:" + t.xCoord + ", y:"
		+ t.yCoord + ", z:" + t.zCoord);
	if (t instanceof IEnergySource) {
	    IEnergySource s = (IEnergySource) t;
	    this.removeEnergySource(s);
	}
	return true;
    }

    public boolean removeEnergySource(IEnergySource s) {
	// TODO Auto-generated method stub
	if (!energySources.contains(s))
	    return false;
	if (!energySources.remove(s))
	{
	    this.needEnergyUpdate = true;
	    return true;
	}
	return false;
    }
    
    
    public int sendEnergyToConsumer(IEnergyReceiver er)
    {
	int e = er.getEnergyRemaning();
	this.energyRemaning -=e;
	if(this.energyRemaning < 0) e = -(this.energyRemaning);
	else e = 0;
	return e;
    }
    public void reset()
    {
	this.energyRemaning = totalProduceEnergy;
    }

}
