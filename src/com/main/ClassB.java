package com.main;

public class ClassB extends ClassA{

	void m3() {
		System.out.println("Name is Shreyas");
	}
	void m4() {
		System.out.println("Dattakrupa Niwas");
	}
	public static void main(String[] args) {
		ClassA ad=new ClassB();
		ad.m1();
		ClassB sd=new ClassB();
		sd.m1();
	}
	
	
	 
	
	
}
