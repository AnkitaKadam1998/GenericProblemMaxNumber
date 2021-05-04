package com.bridgelabz.generic_problem;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumNumTest
{
	
	@Test
    public void MaxNumber_FirstPosition_ReturnsTrue_IfSameAsExpected(){
        String maxValue=MaximumNum.getStringMaxNum("Apple","peach","banana");
        assertEquals("peach",maxValue);
        
    }

	@Test
	public void MaxNumber_SecondPosition_ReturnsTrue_IfSameAsExpected(){
		String maxValue=MaximumNum.getStringMaxNum("banana","peach","apple");
		assertEquals("peach",maxValue);
    
}
	
	@Test
    public void MaxNumber_ThirdPosition_ReturnsTrue_IfSameAsExpected(){
		String maxValue=MaximumNum.getStringMaxNum("Apple","banana","peach");
		assertEquals("peach",maxValue);
    }
}


