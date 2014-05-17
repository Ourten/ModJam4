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
		AnimState pillars = new AnimState("pillars");
		pillars.setSpeed(0.003f);
		obeliskStates.add(pillars);
		
		AnimState corners = new AnimState("corners");
		corners.setSpeed(0.002f);
		corners.addDepend(pillars, 0.5f);
		obeliskStates.add(corners);
		
		AnimState walls = new AnimState("walls");
		walls.setSpeed(0.002f);
		walls.addDepend(pillars, 0.25f);
		obeliskStates.add(walls);
		
		AnimState secondWalls = new AnimState("secondWalls");
		secondWalls.setSpeed(0.003f);
		secondWalls.addDepend(walls, 1);
		obeliskStates.add(secondWalls);
		
		AnimState logo = new AnimState("logo");
		logo.setSpeed(0.003f);
		logo.addDepend(pillars, 1);
		obeliskStates.add(logo);
		
		AnimState wallsCorners = new AnimState("wcorners");
		wallsCorners.setSpeed(0.001f);
		wallsCorners.addDepend(secondWalls, 0.5f);
		obeliskStates.add(wallsCorners);
		
		AnimState light = new AnimState("light");
		light.setSpeed(0.002f);
		light.addDepend(wallsCorners, 1);
		obeliskStates.add(light);
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