package fr.darktech.energy;

import net.minecraft.tileentity.TileEntity;

public interface IEnergySource {

    boolean sendEnergyTo(TileEntity receiver);
    int getOutput();
    boolean reset();
}
