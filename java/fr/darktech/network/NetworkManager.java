package fr.darktech.network;

import java.util.HashMap;
import java.util.Map.Entry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class NetworkManager {

    private static HashMap<String, Channel> networkList;
    private static NetworkManager instance;
    public NetworkManager()
    {
	instance = this;
	networkList = new HashMap<String, Channel>();
    }
    
    public static NetworkManager getNetworkManager()
    {
	return instance;
    }
    
    public Channel registerNetwork(String nN, World w)
    {
	if(networkList.containsKey(nN)) return networkList.get(nN);
	else if(networkList.put("DarkTechNet_" + w.getWorldInfo().getWorldName()+ "_" + nN, new Channel(w, nN)) != null) return networkList.get(nN);
	
	return null;
    }
    
    public void resetAllNetwork()
    {
	for(Entry<String, Channel> nE : networkList.entrySet())
	{
	    Channel net = nE.getValue();
	    net.reset();
	}
    }
    
    public Channel registerTileEntityInNetwork(INetCompatible net, String channel)
    {
	Channel chan;
	World w = net.getWorldObj();
	String formatedName = "DarkTechNet_" + net.getWorldObj().getWorldInfo().getWorldName()+ "_" + channel;
	if(networkList.containsKey(formatedName)) {
	    chan = networkList.get(formatedName);
	    chan.registerTile((TileEntity)net);
	    
	}
	else
	{
	    chan = this.registerNetwork(channel, w);
	    
	    chan = networkList.get(formatedName);
	    chan.registerTile((TileEntity)net);
	}
	return chan;
	
    
}
    public boolean removeTileEntity(INetCompatible net, String channel) {
	// TODO Auto-generated method stub
	
	Channel chan;
	World w = net.getWorldObj();
	String formatedName = channel;
	if(networkList.containsKey(formatedName)) {
	    chan = networkList.get(formatedName);
	    chan.removeTile((TileEntity)net);
	    return true;
	}
	else
	{
	    chan = this.registerNetwork(channel, w);
	    if(chan == null) return false;
	    chan = networkList.get(formatedName);
	    //if(chan == null) System.err.println("Chan is NULL");
	    chan.removeTile((TileEntity)net);
	}
	return false;
    }
}
