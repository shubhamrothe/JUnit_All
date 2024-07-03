package com.example.demo.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.Classes.EvenOdd;

class EvenOddTest {

	EvenOdd ob= new EvenOdd();
	@Test
	public void evenOddNumberPositiveTest() {
//		boolean actualResult = ob.evenOddNumber(4);
//		boolean expectedResult = true;
//		assertEquals(expectedResult, actualResult);
		//OR
		assertEquals(true, ob.evenOddNumber(8));
	}
	
	@Test
	public void evenOddNumberNegativeTest() {
//		boolean actualResult = ob.evenOddNumber(5);
//		boolean expectedResult = false;
//		assertEquals(expectedResult, actualResult);
		//OR
		assertEquals(false, ob.evenOddNumber(3));
	}

}
