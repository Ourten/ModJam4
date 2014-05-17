package fr.darktech;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.darktech.blocks.BlockGenerator;
import fr.darktech.blocks.BlockGeneratorInvocator;
import fr.darktech.blocks.BlockObelisk;
import fr.darktech.common.CommonProxy;
import fr.darktech.items.ItemSoulIron;
import fr.darktech.network.NetworkManager;
import fr.darktech.tiles.TileEntityGenerator;
import fr.darktech.tiles.TileEntityGeneratorInvocator;
import fr.darktech.tiles.TileEntityObelisk;

@Mod(modid = "DarkTech", version = "0.1")
public class DarkTech {

    @Instance("DarkTech")
    public static DarkTech instance;

    @SidedProxy(clientSide = "fr.darktech.client.ClientProxy", serverSide = "fr.darktech.common.CommonProxy")
    public static CommonProxy proxy;
    
    public static final CreativeTabs tabDarkTech = new CreativeTabDarkTech("DarkTech");
    public static final String modidFolder = "darktech";

    public static Item soulIronIngot = new ItemSoulIron(); 
    
    public static Block generatorBlock = new BlockGenerator();
    public static Block obeliskBlock = new BlockObelisk();
    public static Block generatorInvocatorBlock = new BlockGeneratorInvocator();

    private long lastTick;

    private NetworkManager network;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
	network = new NetworkManager();
    	GameRegistry.registerItem(soulIronIngot, "soulIronIngot");
    	GameRegistry.registerBlock(generatorBlock, "generatorBlock");
    	GameRegistry.registerBlock(generatorInvocatorBlock, "generatorInvocatorBlock");
    	GameRegistry.registerBlock(obeliskBlock, "obeliskBlock");
    	GameRegistry.registerTileEntity(TileEntityGenerator.class, "TileEntityGenerator");
    	GameRegistry.registerTileEntity(TileEntityGeneratorInvocator.class, "TileEntityGeneratorInvocator");
    	GameRegistry.registerTileEntity(TileEntityObelisk.class, "TileEntityObelisk");
    	proxy.registerRender();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    }
    
    @SubscribeEvent
    public void onClientTick(ClientTickEvent event) {
    	if(Minecraft.getMinecraft().thePlayer != null && ((System.currentTimeMillis()- lastTick) >= 1000))
    	{
    	    network.resetAllNetwork();
    	    lastTick = System.currentTimeMillis();
    		
    	}
}
}
