package com.bridgelabz.generic_problem;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumNumTest
{
	
	@Test
    public void MaxNumber_FirstPosition_ReturnsTrue_IfSameAsExpected(){
        int maxValue=MaximumNum.getIntMaxNum(10,12,11);
        assertEquals(12,maxValue);
    }
	
	@Test
    public void MaxNumber_SecondPosition_ReturnsTrue_IfSameAsExpected(){
        int maxValue=MaximumNum.getIntMaxNum(21,22,23);
        assertEquals(23,maxValue);
    }
	
	@Test
    public void MaxNumber_ThirdPosition_ReturnsTrue_IfSameAsExpected(){
        int maxValue=MaximumNum.getIntMaxNum(13,22,26);
        assertEquals(26,maxValue);
    }
}
