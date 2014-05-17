package fr.darktech.event;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.darktech.DarkTech;

public class BucketHandler {
	@SubscribeEvent
	public void onUseBucket(FillBucketEvent event) {
		Block block = event.world.getBlock(event.target.blockX, event.target.blockY, event.target.blockZ);
		if (block == DarkTech.redstoneFluidBlock) {
			event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ);
			event.result = new ItemStack(DarkTech.redstoneBucket);
			event.setResult(Result.ALLOW);
		}
	}
}
