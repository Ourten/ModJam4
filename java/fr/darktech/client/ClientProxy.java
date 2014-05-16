package fr.darktech.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import fr.darktech.client.render.RenderGenerator;
import fr.darktech.common.CommonProxy;
import fr.darktech.tiles.TileEntityGenerator;

public class ClientProxy extends CommonProxy {

    public void registerRender() {
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGenerator.class, new RenderGenerator());
    }
}
