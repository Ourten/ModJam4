package fr.darkteck;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fr.darkteck.common.CommonProxy;

@Mod(modid = "DarkTeck", version = "0.1")
public class DarkTeck {

    @Instance("DarkTeck")
    public static DarkTeck instance;

    @SidedProxy(clientSide = "fr.darkteck.client.ClientProxy", serverSide = "fr.darkteck.common.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
	proxy.registerRender();
    }

}
