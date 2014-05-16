package fr.darktech.network;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public interface INetwork {

    public World getWorld();
    public ArrayList<TileEntity> getTileEntities();
}
