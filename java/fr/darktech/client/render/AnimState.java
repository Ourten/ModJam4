package fr.darktech.client.render;

import java.util.HashMap;

public class AnimState 
{
	private float percent;
	private boolean isFinished;
	private HashMap<AnimState, Float> depends = new HashMap<AnimState, Float>();
	
	public AnimState()
	{
		this.percent = 0;
		this.isFinished = false;
	}
	
	public void tick(float percent)
	{
		
	}
}