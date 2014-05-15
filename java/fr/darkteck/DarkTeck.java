package fr.darkteck;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.darkteck.common.CommonProxy;
import fr.darkteck.items.ItemSoulIron;

@Mod(modid = "DarkTeck", version = "0.1")
public class DarkTeck {

    @Instance("DarkTeck")
    public static DarkTeck instance;

    @SidedProxy(clientSide = "fr.darkteck.client.ClientProxy", serverSide = "fr.darkteck.common.CommonProxy")
    public static CommonProxy proxy;
    
    public static final CreativeTabs tabDarkTech = new CreativeTabDarkTech("DarkTech");

    public static Item soulIronIngot = new ItemSoulIron(); 
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	GameRegistry.registerItem(soulIronIngot, "soulIronIngot");
    	
    	proxy.registerRender();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    }
}
