package com.example.demo.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorsTest {

	Calculators c= new Calculators();
	
	@Test
	public void additionTest() {
		/* 
		 
		int actualResult = c.Addition(10,20);
		int expectedResult= 30;
		assertEquals(expectedResult, actualResult);   */
		
		assertEquals(30, c.Addition(10, 20));
	}
	
	@Test
	public void substractionTest() {
		int actualResult = c.Substraction(20, 4);
		int expectedResult=16;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void multiplicationTest() {
		int actualResult = c.Multiplication(20, 4);
		int expectedResult=80;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void divisionTest() {
		int actualResult = c.Division(20, 4);
		int expectedResult=5;
		assertEquals(expectedResult, actualResult);
	}


}
