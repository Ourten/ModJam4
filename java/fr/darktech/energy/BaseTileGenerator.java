package fr.darktech.energy;

import fr.darktech.exception.NetworkException;
import fr.darktech.network.INetCompatible;
import fr.darktech.network.Channel;
import fr.darktech.network.NetworkManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class BaseTileGenerator extends TileEntity implements
	IEnergySource, INetCompatible {

    public static NetworkManager netManager = NetworkManager.getNetworkManager();
    @Override
    public boolean sendEnergyTo(TileEntity receiver) {
	return false;
    }

    @Override
    public int getOutput() {
	// TODO Auto-generated method stub
	return 100;
    }
    @Override
    public boolean reset() {
	// TODO Auto-generated method stub
	return false;
    }



}
