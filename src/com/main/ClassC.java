package com.main;

public class ClassC extends ClassB {
void m1() {
	System.out.println( "AS");
}
	public static void main(String[] args) {
		
		ClassA a=new ClassA();
		ClassC m=new ClassC();
		a.m1();
		m.m1();
	} }