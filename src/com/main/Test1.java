package com.main;

public class Test1 {
public static void main(String[] args) {
	System.out.println("Line 1");
	System.out.println("Line 2");
	try {
		throw new Test("Invalid");
		
	}
	catch (Exception e) {
		e.getMessage();
		
	}
	System.out.println("Line 3");
}
	
	
	
	
}
