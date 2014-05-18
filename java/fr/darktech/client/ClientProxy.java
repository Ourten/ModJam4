package fr.darktech.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import fr.darktech.DarkTech;
import fr.darktech.client.render.IInventoryRenderer;
import fr.darktech.client.render.InventoryRenderer;
import fr.darktech.client.render.InventoryRenderer.TESRIndex;
import fr.darktech.client.render.RenderGenerator;
import fr.darktech.client.render.RenderGeneratorInvocator;
import fr.darktech.client.render.RenderObelisk;
import fr.darktech.common.CommonProxy;
import fr.darktech.tiles.TileEntityGenerator;
import fr.darktech.tiles.TileEntityGeneratorInvocator;
import fr.darktech.tiles.TileEntityObelisk;

public class ClientProxy extends CommonProxy {

	public static int inventoryID;
	
    public void registerRender() {
    	inventoryID = RenderingRegistry.getNextAvailableRenderId();
    	
    	RenderingRegistry.registerBlockHandler(new InventoryRenderer());
    	
    	RenderGenerator generator = new RenderGenerator();
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGenerator.class, generator);
    	
    	RenderGeneratorInvocator genInvocator = new RenderGeneratorInvocator();
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGeneratorInvocator.class, genInvocator);
    	InventoryRenderer.blockByTESR.put(new TESRIndex(DarkTech.generatorInvocatorBlock,0), (IInventoryRenderer) genInvocator);
    	
    	RenderObelisk obelisk = new RenderObelisk();
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObelisk.class, obelisk);
    }
}
