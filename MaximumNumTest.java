package com.bridgelabz.generic_problem;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumNumTest
{
	
	@Test
    public void MaxNumber_FirstPosition_ReturnsTrue_IfSameAsExpected(){
        Float maxValue=MaximumNum.getFloatMaxNum(10.0f,12.34f,11.10f);
        assertEquals(12.34,maxValue,0);
    }
	
	@Test
    public void MaxNumber_SecondPosition_ReturnsTrue_IfSameAsExpected(){
        Float maxValue=MaximumNum.getFloatMaxNum(21.6f,22.7f,23.8f);
        assertEquals(23.8f,maxValue,0);
    }
	
	@Test
    public void MaxNumber_ThirdPosition_ReturnsTrue_IfSameAsExpected(){
        Float maxValue=MaximumNum.getFloatMaxNum(13.5,22.7,26.0);
        assertEquals(26.0,maxValue,0);
    }
}
