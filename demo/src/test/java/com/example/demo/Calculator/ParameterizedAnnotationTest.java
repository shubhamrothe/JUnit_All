package com.example.demo.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.demo.Classes.ParameterizedAnnotation;

class ParameterizedAnnotationTest {
 	
	ParameterizedAnnotation ob = new ParameterizedAnnotation();

	@ParameterizedTest
	@ValueSource(strings= {"nayan", "radar", "madam"})
	public void isPalindromeCheckTest(String inputString) {
		 boolean actualResult = ob.isPalindrome(inputString);   
		 assertEquals(true, actualResult, "Input string" + inputString + " is a palindrome.");
	}
	
	//Check this method  -->It's not working
//	@ParameterizedTest
//	@CsvFileSource(resources="/data1.csv", numLinesToSkip=1)
//	public void evenOrOddTest(String input, String expected) {
//		
//		String actualResult = ob.evenOrOddNumber(Integer.parseInt(input));
//		assertEquals(expected, actualResult);
//	}
}
