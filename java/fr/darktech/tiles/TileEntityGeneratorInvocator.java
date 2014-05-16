package fr.darktech.tiles;

import net.minecraft.tileentity.TileEntity;

public class TileEntityGeneratorInvocator extends TileEntity {
	private boolean canPlaceGenerator;
	
	public TileEntityGeneratorInvocator() {
		this.canPlaceGenerator = false;
	}
	
	public boolean canPlaceGenerator() {
		return this.canPlaceGenerator;
	}
}
