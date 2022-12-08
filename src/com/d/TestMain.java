package com.d;

public class TestMain {

	public static void main(String[] args) {
				Test test=Test.getDetails();
			Test test1=Test.getDetails();
				Test test3=test.getInfo();
	
				System.out.println(test.hashCode());
				System.out.println(test1.hashCode());
				System.out.println(test3.hashCode());
	}
	
}
