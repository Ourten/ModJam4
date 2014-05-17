package fr.darktech.tiles;

import java.util.Arrays;

import fr.darktech.DarkTech;
import fr.darktech.energy.BaseTileGenerator;
import fr.darktech.energy.IEnergyReceiver;
import fr.darktech.exception.NetworkException;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityGeneratorInvocator extends TileEntity implements IEnergyReceiver  {
	private boolean has3x3FreeZone = false;
	private boolean[] canDeployArm = new boolean[4];
	private int energyRemaning;;
	private int flashUntilDeploy = 3;
	private int flashTime = 20;
	private int energyNeeded;
	
	public TileEntityGeneratorInvocator() {
	    this.energyNeeded = 100;
	    //if(!netManager.registerTileEntityInNetwork(this, "LOL")) {new NetworkException("Error during registerNetwork");}
		Arrays.fill(canDeployArm, false);
	}
	
	
	public boolean has3x3FreeZone() {
		return this.has3x3FreeZone;
	}
	
	public boolean canDeployArm(int arm) {
		if(arm > 3 || arm < 0)
			return false;
		return this.canDeployArm[arm];
	}
	
	@Override
	public void updateEntity() {
		Arrays.fill(canDeployArm, false);
		
		if(worldObj.isAirBlock(xCoord, yCoord, zCoord - 1))
			canDeployArm[0] = true;
		if(worldObj.isAirBlock(xCoord - 1, yCoord, zCoord))
			canDeployArm[1] = true;
		if(worldObj.isAirBlock(xCoord, yCoord, zCoord + 1))
			canDeployArm[2] = true;
		if(worldObj.isAirBlock(xCoord + 1, yCoord, zCoord))
			canDeployArm[3] = true;
		
		has3x3FreeZone = false;
		
		if(canDeployArm[0] && canDeployArm[1] && canDeployArm[2] && canDeployArm[3]) {			
			if(worldObj.isAirBlock(xCoord + 1, yCoord, zCoord + 1)
					&& worldObj.isAirBlock(xCoord - 1, yCoord, zCoord + 1)
					&& worldObj.isAirBlock(xCoord + 1, yCoord, zCoord - 1)
					&& worldObj.isAirBlock(xCoord - 1, yCoord, zCoord - 1)) {
				has3x3FreeZone = true;
			}		
		}
		
		if(has3x3FreeZone) {
			flashTime--;
			if(flashTime == 0) {
				flashTime = 20;
				flashUntilDeploy--;
			}
			
			if(flashUntilDeploy == 0) {
				worldObj.setBlock(xCoord, yCoord, zCoord, DarkTech.generatorBlock);
			}
		} else {
			flashTime = 20;
			flashUntilDeploy = 3;
		}
	}
	
	public int getFlashTime() {
		return this.flashTime;
	}


	@Override
	public int demandsEnergy() {
	    // TODO Auto-generated method stub
	    return 0;
	}


	@Override
	public int injectEnergy(int amount) {
	    // TODO Auto-generated method stub
	    return 0;
	}


	@Override
	public int getEnergyNeeded() {
	    // TODO Auto-generated method stub
	    return this.energyNeeded;
	}
	@Override
	public int getEnergyRemaning() {
	    // TODO Auto-generated method stub
	    return this.energyRemaning;
	}
}
