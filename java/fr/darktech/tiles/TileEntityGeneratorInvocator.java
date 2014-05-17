package fr.darktech.tiles;

import java.util.Arrays;

import fr.darktech.DarkTech;

import net.minecraft.tileentity.TileEntity;

public class TileEntityGeneratorInvocator extends TileEntity {
	private boolean has3x3FreeZone = false;
	private boolean[] canDeployArm = new boolean[4];
	
	private int flashUntilDeploy = 3;
	private int flashTime = 20;
	
	public TileEntityGeneratorInvocator() {
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
	
	public boolean isFree(int side) {
		switch(side) {
			case 0:
				return worldObj.isAirBlock(xCoord, yCoord, zCoord - 1);
			case 1:
				return worldObj.isAirBlock(xCoord - 1, yCoord, zCoord);
			case 2:
				return worldObj.isAirBlock(xCoord, yCoord, zCoord + 1);
			case 3:
				return worldObj.isAirBlock(xCoord + 1, yCoord, zCoord);
			case 4:
				return worldObj.isAirBlock(xCoord - 1, yCoord, zCoord - 1);
			case 5:
				return worldObj.isAirBlock(xCoord - 1, yCoord, zCoord + 1);
			case 6:
				return worldObj.isAirBlock(xCoord + 1, yCoord, zCoord + 1);
			case 7:
				return worldObj.isAirBlock(xCoord + 1, yCoord, zCoord - 1);
		}
		
		return false;
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
}
