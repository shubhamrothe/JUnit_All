package com.example.demo.Classes;

public class ParameterizedAnnotation {

	public boolean isPalindrome(String s) {
		String reverse="";
		int l=s.length();
		for(int i=l-1; i>=0; i--) 
		{
			reverse = reverse + s.charAt(i);
		}
		if(s.equals(reverse))
		return true;
		else
			return false;
	}

	
	public String evenOrOddNumber(Integer num) {
		if(num%2==0)
			return "even";
		else
			return "false";
	}
}
