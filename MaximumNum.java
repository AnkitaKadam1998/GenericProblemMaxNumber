package com.bridgelabz.generic_problem;

public class MaximumNum {
	
	public static String getStringMaxNum(String x,String y,String z)
	{
		String maxValue=x;
		if(y.compareTo(maxValue)>0)
		maxValue=y;
		if(z.compareTo(maxValue)>0)
		maxValue=z;
		return maxValue;	
	}
	}

