package com.bridgelabz.generic_problem;

public class MaximumNum {
	
	public static int getIntMaxNum(Integer x,Integer y,Integer z)
	{
		int maxValue=x;
		if(y.compareTo(maxValue)>0)
		maxValue=y;
		if(z.compareTo(maxValue)>0)
		maxValue=z;
		return maxValue;
		
	}	
		public static void main(String args[])
		{
			System.out.println("welcome to maximum number problem using generic method ");
		}
	}

