package fr.darktech.client.render;

import java.util.ArrayList;

public class AnimStates 
{
	public static final ArrayList<AnimState> generatorStates = new ArrayList<AnimState>();
	public static final ArrayList<AnimState> obeliskStates = new ArrayList<AnimState>();
	
	public static final void setupAnimationStates()
	{
		setupGenerator();
		setupObelisk();
	}
	
	public static final void tickObeliskStates()
	{
		for(AnimState state : obeliskStates)
		{
			state.tick(state.getSpeed());
		}
	}
	
	public static final void tickGeneratorStates()
	{
		for(AnimState state : generatorStates)
		{
			state.tick(state.getSpeed());
		}
	}
	
	public static final void setupObelisk()
	{
		
	}
	
	public static final void setupGenerator()
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
}