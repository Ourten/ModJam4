package fr.darktech.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RedstoneFluid extends BlockFluidClassic
{

	@SideOnly(Side.CLIENT)
	protected IIcon stillIcon;

	@SideOnly(Side.CLIENT)
	protected IIcon flowingIcon;

	public RedstoneFluid(Fluid fluid)
	{
		super(fluid, Material.water);
		this.setBlockName("RedstoneFluid");
	}

	/*@Override
	public IIcon getIcon(int side, int meta)
	{
		return (side == 0 || side == 1) ? stillIcon : flowingIcon;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister register)
	{
		stillIcon = register.registerIcon(Vars.modidFolder + ":" + fluidName + "_still");
		flowingIcon = register.registerIcon(Vars.modidFolder + ":" + fluidName + "_flowing");
	}*/
	
	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		super.onEntityCollidedWithBlock(world, x, y, z, entity);
		entity.attackEntityFrom(DamageSource.lava, 1);
	}
	
    @Override
    public void velocityToAddToEntity(World world, int x, int y, int z, Entity entity, Vec3 vec)
    {
        vec.xCoord = 0;
        vec.yCoord = 0;
        vec.zCoord = 0;
    }
	
	@Override
	public boolean canDisplace(IBlockAccess world, int x, int y, int z)
	{
		if (world.getBlock(x, y, z).getMaterial().isLiquid())
		{
			return false;
		}

		return super.canDisplace(world, x, y, z);
	}

	@Override
	public boolean displaceIfPossible(World world, int x, int y, int z)
	{
		if (world.getBlock(x, y, z).getMaterial().isLiquid())
		{
			return false;
		}

		return super.displaceIfPossible(world, x, y, z);
	}
}
