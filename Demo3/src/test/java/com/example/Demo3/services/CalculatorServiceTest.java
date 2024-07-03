package com.example.Demo3.services;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
// JUnit - 4
public class CalculatorServiceTest {

	CalculatorService ob = new CalculatorService();

	@BeforeClass  //--> to execute some logic before all test cases
	public static void init() {
		System.out.println("Before all test cases");
		System.out.println("Started at: " +new Date());
	}
	
	@AfterClass  //--> to execute some logic after all test cases eg. cleanup code
	public static void cleanup() {
		System.out.println("After all test cases !!");
		System.out.println("Finished at: " +new Date());
	}
	
	@Before  //--> to execute method before each test case
	public void beforeEach() {
		
	System.out.println("Before each test case: ");
	}
	
	@After //-- to execute method After each test case
	public void afterEach() {
		System.out.println("After each test case!!");
	}
	@Test
	public void AdditionTest() {
		int actualresult = ob.Addition(12, 6);
		
		int expectedResult = 18;   
		assertEquals(expectedResult, actualresult);
	}
	
	@Test(timeout= 200)
	public void SubstractionTest() {


//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		int actualresult = ob.Substraction(12, 6);
		
		int expectedResult = 6;   
		assertEquals(expectedResult, actualresult);
	}

	@Test
	public void MultiplicationTest() {
		int actualresult = ob.Multiplication(12, 6);
		
		int expectedResult = 72;   
		assertEquals(expectedResult, actualresult);
	}
	
	@Test
	public void DivisionTest() {
		int actualresult = ob.Division(12, 6);
		
		int expectedResult = 2;   
		assertEquals(expectedResult, actualresult);
	}
}
