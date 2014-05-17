package fr.darktech.tiles;

import fr.darktech.energy.BaseTileGenerator;
import fr.darktech.exception.NetworkException;
import fr.darktech.network.Channel;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityGenerator extends BaseTileGenerator 
{
    private long lastTick;
    private Channel network;
	public TileEntityGenerator()
	{
		super();
		
	}
	@Override
	public void writeToNBT(NBTTagCompound tag)
	{
		super.writeToNBT(tag);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag)
	{
		super.readFromNBT(tag);
	}

	@Override
	public boolean reset() {
	    // TODO Auto-generated method stub
	    return false;
	}
	
	public Channel getNetwork()
	{
	    return network;
	}
	
	public void setNetwork(Channel n)
	{
	    
	    this.network = n;
	   
	}
	@Override
	public boolean sendEnergyTo(TileEntity receiver) {
	    // TODO Auto-generated method stub
	    return false;
	}
	
	    @Override
	    public void updateEntity()
	    {
		if(((System.currentTimeMillis()- lastTick) >= 1000))
	    	{
		    
	    	    lastTick = System.currentTimeMillis();
	    		
	    	}
		
	    }

}