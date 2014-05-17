package fr.darktech.client.render;

import java.util.ArrayList;

public class AnimStates 
{
	public static final ArrayList<AnimState> generatorStates = new ArrayList<AnimState>();
	
	public static final void setupAnimationStates()
	{
		setupGenerator();
	}
	
	public static final void tickGeneratorStates()
	{
		for(AnimState state : generatorStates)
		{
			state.tick(0.002f);
		}
	}
	
	public static final void setupGenerator()
	{
		AnimState pillars = new AnimState("pillars");
		generatorStates.add(pillars);
		
		AnimState walls = new AnimState("walls");
		walls.addDepend(pillars, 0.25f);
		generatorStates.add(walls);
		
		AnimState wallsPillars = new AnimState("wallPillars");
		wallsPillars.addDepend(pillars, 0.20f);
		generatorStates.add(wallsPillars);
		
		AnimState secondWalls = new AnimState("secondWalls");
		secondWalls.addDepend(walls, 1f);
		generatorStates.add(secondWalls);
	}
}