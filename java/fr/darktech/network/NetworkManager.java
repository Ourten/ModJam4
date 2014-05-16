package fr.darktech.network;

import java.util.HashMap;

public class NetworkManager {

    private static HashMap<String, Network> list;
    private static NetworkManager instance;
    public NetworkManager()
    {
	instance = this;
	list = new HashMap<String, Network>();
    }
    
    private static NetworkManager getNetworkManager()
    {
	return instance;
    }
    
    public boolean registerNetwork(String networkName, Network net)
    {
	if(list.containsKey(networkName)) return false;
	//else if(list.putIfAbsent(networkName, net) != null){ return true;}
	
	return false;
    }
    
    
}
