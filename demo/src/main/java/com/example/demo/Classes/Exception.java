package com.example.demo.Classes;

public class Exception {

	//These method converts integer to string 
	public static Integer convertStringToInteger(String str) {
		if(str==null || str.trim().length()==0) {
			throw new IllegalArgumentException("String must not be null/empty !!");
		}	
		return Integer.valueOf(str);	
	}
}
