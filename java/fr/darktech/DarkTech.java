package fr.darktech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
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
import fr.darktech.client.render.AnimStates;
import fr.darktech.common.CommonProxy;
import fr.darktech.event.BucketHandler;
import fr.darktech.fluids.RedstoneFluid;
import fr.darktech.items.ItemSoulIron;
import fr.darktech.materials.MaterialRedstoneLiquid;
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

	public static Block redstoneFluidBlock;
	public static Item redstoneBucket;
	public static Fluid redstoneFluid;

	public static Material redstoneMaterial = new MaterialRedstoneLiquid();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		network = new NetworkManager();

		redstoneFluid = new Fluid("redfluid").setLuminosity(14).setViscosity(500).setTemperature(1000);
		FluidRegistry.registerFluid(redstoneFluid);

		redstoneFluidBlock = new RedstoneFluid(redstoneFluid).setCreativeTab(tabDarkTech).setBlockName("RedstoneFluid").setBlockTextureName("redstone_block");
		redstoneFluid.setBlock(redstoneFluidBlock);

		redstoneBucket = new ItemBucket(redstoneFluid.getBlock()).setUnlocalizedName("RedstoneBucket").setTextureName("bucket_water").setContainerItem(Items.bucket).setCreativeTab(tabDarkTech);

		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("redfluid", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(redstoneBucket), new ItemStack(Items.bucket));

		GameRegistry.registerBlock(redstoneFluidBlock, "redstoneFluidBlock");
		GameRegistry.registerItem(redstoneBucket, "redstoneBucket");

		GameRegistry.registerItem(soulIronIngot, "soulIronIngot");
		GameRegistry.registerBlock(generatorBlock, "generatorBlock");
		GameRegistry.registerBlock(generatorInvocatorBlock, "generatorInvocatorBlock");
		GameRegistry.registerBlock(obeliskBlock, "obeliskBlock");
		GameRegistry.registerTileEntity(TileEntityGenerator.class, "TileEntityGenerator");
		GameRegistry.registerTileEntity(TileEntityGeneratorInvocator.class, "TileEntityGeneratorInvocator");
		GameRegistry.registerTileEntity(TileEntityObelisk.class, "TileEntityObelisk");

		AnimStates.setupAnimationStates();

		proxy.registerRender();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new BucketHandler());
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
