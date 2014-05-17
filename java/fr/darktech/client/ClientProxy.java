package fr.darktech.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import fr.darktech.client.render.AnimStates;
import fr.darktech.client.render.RenderGenerator;
import fr.darktech.client.render.RenderGeneratorInvocator;
import fr.darktech.common.CommonProxy;
import fr.darktech.tiles.TileEntityGenerator;
import fr.darktech.tiles.TileEntityGeneratorInvocator;

public class ClientProxy extends CommonProxy {

    public void registerRender() {
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGenerator.class, new RenderGenerator());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGeneratorInvocator.class, new RenderGeneratorInvocator());
    	AnimStates.setupAnimationStates();
    }
}
