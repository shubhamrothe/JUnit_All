package com.example.Demo3.services;

public class CalculatorService {

	public int Addition(int a, int b) {
		int c= a+b;
		System.out.println("Summation ="+ c);
		return c;
	}
	
	public int Substraction(int a, int b) {
		int c= a-b;
		System.out.println("Substraction = "+ c);
		return c;
	}
	
	public int Multiplication(int a, int b) {
		int c= a*b;
		System.out.println("Multiplication = "+ c);
		return c;
	}
	
	public int Division(int a, int b) {
		int c= a/b;
		System.out.println("Division = "+c);
		return c;
	}
}
