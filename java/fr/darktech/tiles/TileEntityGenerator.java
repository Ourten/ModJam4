package fr.darktech.tiles;

import java.util.ArrayList;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import fr.darktech.client.models.ModelGenerator;
import fr.darktech.client.render.AnimState;
import fr.darktech.energy.BaseTileGenerator;
import fr.darktech.network.Channel;

public class TileEntityGenerator extends BaseTileGenerator 
{
	private long lastTick;
	private Channel network;
	
	public ModelGenerator MODEL_GENERATOR = new ModelGenerator();

	public final ArrayList<AnimState> generatorStates = new ArrayList<AnimState>();

	
	private boolean startDeploy = true;
	private boolean finishDeploy = false;
	public TileEntityGenerator()
	{
		super();
		setupGenerator();
	}
	
	public ModelGenerator getMODEL_GENERATOR() {
		return MODEL_GENERATOR;
	}

	public void setMODEL_GENERATOR(ModelGenerator mODEL_GENERATOR) {
		MODEL_GENERATOR = mODEL_GENERATOR;
	}
	
	@Override
	public Packet getDescriptionPacket()
	{
		NBTTagCompound nbtTag = new NBTTagCompound();
		this.writeToNBT(nbtTag);
		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbtTag);
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet)
	{
		readFromNBT(packet.func_148857_g());
	}
	
	public void tickGeneratorStates()
	{
		for(AnimState state : generatorStates)
		{
			state.tick(state.getSpeed());
		}
	}
	
	public boolean isGeneratorFinished()
	{
		if(this.finishDeploy)
			return true;
		for(AnimState state : generatorStates)
		{
			if(!state.isFinished())
				return false;
		}
		this.finishDeploy = true;
		this.startDeploy = false;
		return true;
	}
	
	public void setupGenerator()
	{
		AnimState pillars = new AnimState("pillars");
		pillars.setSpeed(0.004f);
		generatorStates.add(pillars);
		
		AnimState walls = new AnimState("walls");
		walls.addDepend(pillars, 0.25f);
		walls.setSpeed(0.003f);
		generatorStates.add(walls);
		
		AnimState wallsPillars = new AnimState("wallPillars");
		wallsPillars.addDepend(pillars, 0.20f);
		wallsPillars.setSpeed(0.002f);
		generatorStates.add(wallsPillars);
		
		AnimState secondWalls = new AnimState("secondWalls");
		secondWalls.addDepend(walls, 1f);
		secondWalls.setSpeed(0.006f);
		generatorStates.add(secondWalls);
		
		AnimState redstone = new AnimState("redstone");
		redstone.addDepend(walls, 1f);
		redstone.setSpeed(0.004f);
		generatorStates.add(redstone);
		
		AnimState tubes = new AnimState("tubes");
		tubes.addDepend(secondWalls, 1f);
		tubes.setSpeed(0.002f);
		generatorStates.add(tubes);
		
		AnimState color = new AnimState("color");
		color.addDepend(tubes,1f);
		color.setSpeed(0.004f);
		generatorStates.add(color);
	}

	public boolean isStartDeploy() {
		return startDeploy;
	}

	public void setStartDeploy(boolean startDeploy) {
		this.startDeploy = startDeploy;
	}

	@Override
	public AxisAlignedBB getRenderBoundingBox()
	{
		return AxisAlignedBB.getAABBPool().getAABB(xCoord-1, yCoord, zCoord-1, xCoord + 2, yCoord + 2, zCoord + 2);
	}
	@Override
	public void writeToNBT(NBTTagCompound tag)
	{
		super.writeToNBT(tag);
		tag.setBoolean("deploy", this.startDeploy);
		tag.setBoolean("finishDeploy", this.finishDeploy);
	}

	@Override
	public void readFromNBT(NBTTagCompound tag)
	{
		super.readFromNBT(tag);
		this.startDeploy = tag.getBoolean("deploy");
		this.finishDeploy = tag.getBoolean("finishDeploy");
	}

	@Override
	public boolean reset() {
		// TODO Auto-generated method stub
		return false;
	}

	public Channel getNetwork()
	{
		return network;
	}

	public void setNetwork(Channel n)
	{

		this.network = n;

	}
	@Override
	public boolean sendEnergyTo(TileEntity receiver) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateEntity()
	{
		if(((System.currentTimeMillis()- lastTick) >= 1000))
			lastTick = System.currentTimeMillis();

		if(this.startDeploy && !this.isGeneratorFinished())
		{
			this.tickGeneratorStates();
		}
	}
}