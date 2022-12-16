package com.features;
@FunctionalInterface
public interface Test {

	public void add();
	
	public static void demo() {
		System.out.println("This is static method");
		
	}
	
	default void d1() {
		
		System.out.println("This is default method");
		
	}
	
	
	
	
}
