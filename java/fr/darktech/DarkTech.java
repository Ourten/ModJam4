package fr.darktech;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.darktech.blocks.BlockGenerator;
import fr.darktech.common.CommonProxy;
import fr.darktech.items.ItemSoulIron;
import fr.darktech.tiles.TileEntityGenerator;

@Mod(modid = "DarkTech", version = "0.1")
public class DarkTech {

    @Instance("DarkTech")
    public static DarkTech instance;

    @SidedProxy(clientSide = "fr.darktech.client.ClientProxy", serverSide = "fr.darktech.common.CommonProxy")
    public static CommonProxy proxy;
    
    public static final CreativeTabs tabDarkTech = new CreativeTabDarkTech("DarkTech");

    public static Item soulIronIngot = new ItemSoulIron(); 
    
    public static Block generatorBlock = new BlockGenerator();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	GameRegistry.registerItem(soulIronIngot, "soulIronIngot");
    	GameRegistry.registerBlock(generatorBlock, "generatorBlock");
    	GameRegistry.registerTileEntity(TileEntityGenerator.class, "TileEntityGenerator");
    	proxy.registerRender();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    }
}
