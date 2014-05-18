package fr.darktech.tiles;

import java.util.ArrayList;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import fr.darktech.client.render.AnimState;
import fr.darktech.client.render.AnimStates;
import fr.darktech.energy.BaseTileGenerator;
import fr.darktech.network.Channel;

public class TileEntityGenerator extends BaseTileGenerator 
{
	private long lastTick;
	private Channel network;
	
	public static final ArrayList<AnimState> generatorStates = new ArrayList<AnimState>();

	
	private boolean startDeploy = true;
	public TileEntityGenerator()
	{
		super();
		setupGenerator();
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
		for(AnimState state : generatorStates)
		{
			if(!state.isFinished())
				return false;
		}
		return true;
	}
	
	public void setupGenerator()
	{
		AnimState pillars = new AnimState("pillars");
		pillars.setSpeed(0.002f);
		generatorStates.add(pillars);
		
		AnimState walls = new AnimState("walls");
		walls.addDepend(pillars, 0.25f);
		walls.setSpeed(0.0015f);
		generatorStates.add(walls);
		
		AnimState wallsPillars = new AnimState("wallPillars");
		wallsPillars.addDepend(pillars, 0.20f);
		wallsPillars.setSpeed(0.001f);
		generatorStates.add(wallsPillars);
		
		AnimState secondWalls = new AnimState("secondWalls");
		secondWalls.addDepend(walls, 1f);
		secondWalls.setSpeed(0.003f);
		generatorStates.add(secondWalls);
		
		AnimState redstone = new AnimState("redstone");
		redstone.addDepend(walls, 1f);
		redstone.setSpeed(0.002f);
		generatorStates.add(redstone);
		
		AnimState tubes = new AnimState("tubes");
		tubes.addDepend(secondWalls, 1f);
		tubes.setSpeed(0.001f);
		generatorStates.add(tubes);
		
		AnimState color = new AnimState("color");
		color.addDepend(tubes,1f);
		color.setSpeed(0.002f);
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
	}

	@Override
	public void readFromNBT(NBTTagCompound tag)
	{
		super.readFromNBT(tag);
		this.startDeploy = tag.getBoolean("deploy");
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
		{

			lastTick = System.currentTimeMillis();
			
		}
		
		if(AnimStates.isGeneratorFinished())
	}
}