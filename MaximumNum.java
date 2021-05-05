package com.bridgelabz.generic_problem;

public class MaximumNum 
	{
		public static <E extends Comparable<E>> E printMaxValue(E a,E b,E c)
		{
		E maxValue= a;
		if(b.compareTo(maxValue)>0)
		maxValue=b;
		if(c.compareTo(maxValue)>0)
		maxValue=c;
		return maxValue;
		}	
	}
		

