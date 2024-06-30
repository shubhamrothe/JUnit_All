package com.example.demo.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorsTest {

	Calculators c= new Calculators();
	
	@BeforeAll
	public static void init() {
		System.out.println("Test cases are getting executed from: "+ new Date());
	}
	
	@AfterAll
	public static void cleanup() {
		System.out.println("All test cases got executed at: " + new Date());
	}
	@BeforeEach
	public void beforeEachTestCase() {
		System.out.println("Test case start");
	}
	
	@AfterEach
	public void afterEachTestCase() {
		System.out.println("Test case end");
	}
	@Test
	public void additionTest() {
		/* 	 
		int actualResult = c.Addition(10,20);
		int expectedResult= 30;
		assertEquals(expectedResult, actualResult);   */
		
		Assertions.assertEquals(30, c.Addition(10, 20),"Test Fail !!");
	}
	
	@Test
	public void substractionTest() {
		int actualResult = c.Substraction(20, 4);
		int expectedResult=16;
		Assertions.assertEquals(expectedResult, actualResult);
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
