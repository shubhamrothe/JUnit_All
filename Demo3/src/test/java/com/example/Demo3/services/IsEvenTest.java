package com.example.Demo3.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsEvenTest {

	@Test
	public void isEvenTest() {
		IsEven ob = new IsEven();
		boolean actual = ob.isEven(4);
		boolean expected= true;
		assertEquals(expected, actual);
		
	}

}
