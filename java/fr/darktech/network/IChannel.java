package fr.darktech.network;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public interface IChannel {

    public World getWorld();
    public ArrayList<TileEntity> getTileEntities();
}
