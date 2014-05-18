package fr.darktech.materials;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.MaterialLiquid;

public class MaterialRedstoneLiquid extends MaterialLiquid {
	public MaterialRedstoneLiquid() {
		super(MapColor.tntColor);
		this.setNoPushMobility();
	}
}
