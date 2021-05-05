package com.bridgelabz.generic_problem;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumNumTest
{
	@Test
    public void MaxNumber_FirstPosition_ReturnsTrue_IfSameAsExpected(){
        int maxValue=MaximumNum.printMaxValue(10,11,15);
        assertEquals(15,maxValue);
        
    }

	@Test
    public void MaxNumber_SecondPosition_ReturnsTrue_IfSameAsExpected(){
        int maxValue=MaximumNum.printMaxValue(12,13,15);
        assertEquals(15,maxValue);
        
    }
	
	@Test
    public void MaxNumber_ThirdPosition_ReturnsTrue_IfSameAsExpected(){
        int maxValue=MaximumNum.printMaxValue(10,13,15);
        assertEquals(15,maxValue);
    }
	
	@Test
    public void MaxNumber_FirstPosition_ReturnsTrue_IfFlaotValue(){
        float maxValue=MaximumNum.printMaxValue(10.5f,11.11f,15.10f);
        assertEquals(15.10f,maxValue,0);
        
    }

	@Test
    public void MaxNumber_SecondPosition_ReturnsTrue_IfFloatValue(){
        float maxValue=MaximumNum.printMaxValue(12.10f,13.15f,15.10f);
        assertEquals(15.10f,maxValue,0);
        
    }
	
	@Test
    public void MaxNumber_ThirdPosition_ReturnsTrue_IfFloatValue(){
        Float maxValue=MaximumNum.printMaxValue(10.12f,13.0f,15.10f);
        assertEquals(15.10f,maxValue,0);
}
	@Test
    public void MaxNumber_FirstPosition_ReturnsTrue_IfStringValue(){
        String maxValue=MaximumNum.printMaxValue("apple","peach","banana");
        assertEquals("peach",maxValue);
        
    }

	@Test
    public void MaxNumber_SecondPosition_ReturnsTrue_IfStringValue(){
		String maxValue=MaximumNum.printMaxValue("banana","peach","apple");
        assertEquals("peach",maxValue);
        
        
    }
	
	@Test
    public void MaxNumber_ThirdPosition_ReturnsTrue_IfStringValue(){
		String maxValue=MaximumNum.printMaxValue("peach","banana","apple");
        assertEquals("peach",maxValue);
        
}
}	
	


