package fr.darktech.tiles;

import java.util.ArrayList;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import fr.darktech.client.models.ModelObelisk;
import fr.darktech.client.render.AnimState;

public class TileEntityObelisk extends TileEntity
{
	public ModelObelisk MODEL_OBELISK = new ModelObelisk();

	public final ArrayList<AnimState> obeliskStates = new ArrayList<AnimState>();

	
	private boolean startDeploy = true;
	private boolean finishDeploy = false;
	
	public TileEntityObelisk()
	{
		super();
		setupObelisk();
	}
	
	public void tickObeliskStates()
	{
		for(AnimState state : obeliskStates)
		{
			state.tick(state.getSpeed());
		}
	}
	
	public boolean isObeliskFinished()
	{
		if(this.finishDeploy)
			return true;
		for(AnimState state : obeliskStates)
		{
			if(!state.isFinished())
				return false;
		}
		this.finishDeploy = true;
		this.startDeploy = false;
		return true;
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
	
	public void setupObelisk()
	{
		AnimState corners = new AnimState("corners");
		corners.setSpeed(0.002f);
		
		AnimState wallsCorners = new AnimState("wcorners");
		wallsCorners.setSpeed(0.002f);
		wallsCorners.addDepend(corners, 0);
		
		AnimState secondWalls = new AnimState("secondWalls");
		secondWalls.setSpeed(0.003f);
		secondWalls.addDepend(wallsCorners, 0.5f);
		
		AnimState walls = new AnimState("walls");
		walls.setSpeed(0.002f);
		walls.addDepend(secondWalls, 0f);
		
		AnimState pillars = new AnimState("pillars");
		pillars.addDepend(walls, 0.8f);
		pillars.setSpeed(0.003f);
		obeliskStates.add(pillars);
		
		obeliskStates.add(corners);
		
		obeliskStates.add(walls);
		
		obeliskStates.add(secondWalls);
		
		obeliskStates.add(wallsCorners);
		
		AnimState logo = new AnimState("logo");
		logo.setSpeed(0.005f);
		logo.addDepend(pillars, 0.9f);
		obeliskStates.add(logo);
		
		AnimState light = new AnimState("light");
		light.setSpeed(0.002f);
		light.addDepend(pillars, 0.9f);
		obeliskStates.add(light);
	}
	
	public ModelObelisk getMODEL_OBELISK() {
		return MODEL_OBELISK;
	}

	public void setMODEL_OBELISK(ModelObelisk mODEL_OBELISK) {
		MODEL_OBELISK = mODEL_OBELISK;
	}

	public boolean isStartDeploy() {
		return startDeploy;
	}

	public void setStartDeploy(boolean startDeploy) {
		this.startDeploy = startDeploy;
	}

	public boolean isFinishDeploy() {
		return finishDeploy;
	}

	public void setFinishDeploy(boolean finishDeploy) {
		this.finishDeploy = finishDeploy;
	}

	@Override
	public AxisAlignedBB getRenderBoundingBox()
	{
		return AxisAlignedBB.getAABBPool().getAABB(xCoord, yCoord, zCoord, xCoord + 2, yCoord + 3, zCoord + 2);
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
	public void updateEntity()
	{
		if(this.startDeploy && !this.isObeliskFinished())
		{
			this.tickObeliskStates();
		}
	}
}