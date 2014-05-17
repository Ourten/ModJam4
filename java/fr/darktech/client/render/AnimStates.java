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
			state.tick(0.01f);
		}
	}
	
	public static final void setupGenerator()
	{
		AnimState pillars = new AnimState();
		generatorStates.add(pillars);
		
		AnimState walls = new AnimState();
		walls.addDepend(pillars, 25);
		
		generatorStates.add(walls);
	}
}