package com.example.demo.Calculator;

public class EvenOdd {

	public boolean evenOddNumber(int number) {
		if(number%2==0) {
			System.out.println("Entered number is Even");
			return true;
		}else {
			System.out.println("Entered number is Odd");
			return false;
		}
	}
}
