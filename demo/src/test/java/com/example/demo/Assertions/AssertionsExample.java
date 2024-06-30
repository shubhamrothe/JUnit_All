package com.example.demo.Assertions;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsExample {
	
	// 1
	@Test
	public void TestExample() {	
//		System.out.println("Test case is passed !!");
		boolean value=true;
		Assertions.assertTrue(value);
		//Assertions.assertFalse(value);
	}
	
	//2
	@Test
	public void TestList() {
		Integer[] arr1= {1,2,3,4};
		List<Object> list1 = Arrays.asList(arr1);	
		List<Object> list2 = Arrays.asList(arr1);
		assertIterableEquals(list1, list2);
	}

	//3
	@Test
	public void TestException(){
		Assertions.assertThrows(RuntimeException.class, ()-> {
			//throw new RuntimeException("This is testing exception !!");
			System.out.println("This is testing executable");
		});
	}
}
