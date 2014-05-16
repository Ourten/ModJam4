package fr.darktech.energy;

import net.minecraft.tileentity.TileEntity;

public abstract class BaseTileGenerator extends TileEntity implements
	IEnergySource {

    @Override
    public boolean sendEnergyTo(TileEntity receiver) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public int getOutput() {
	// TODO Auto-generated method stub
	return 100;
    }

}
