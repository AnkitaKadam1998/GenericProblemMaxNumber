package com.bridgelabz.generic_problem;

public class MaximumNum {
	
	public static float getFloatMaxNum(Float x,Float y,Float z)
	{
		Float maxValue=x;
		if(y.compareTo(maxValue)>0)
		maxValue=y;
		if(z.compareTo(maxValue)>0)
		maxValue=z;
		return maxValue;	
	}
	}

