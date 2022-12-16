package com.features;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		
		String abc[]=new String [10];
		
		Optional<String> checknull=Optional.ofNullable(abc[5]);
		
	if(checknull.isPresent()) {
		System.out.println(abc[5].toLowerCase());
		
		
		
	}else
		System.out.println("String value is not present");
		
		
	}
}
