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
	
	public void tick(float f)
	{
		if(!this.isFinished)
		{
			if(!this.depends.isEmpty() && isDependsSatisfieds())
			{
				if(this.percent+f >= 1)
					this.isFinished = true;
				else
					this.percent = this.percent+f;
			}
		}
	}
	
	public boolean isDependsSatisfieds()
	{
		for(AnimState state : depends.keySet())
		{
			if(depends.get(state) != state.getPercent())
			{
				return false;
			}
		}
		return true;
	}
	
	public float getPercent()
	{
		return this.percent;
	}
	
	public boolean isFinished()
	{
		return this.isFinished;
	}
	
	public void addDepend(AnimState state, float percent)
	{
		this.depends.put(state, percent);
	}
}