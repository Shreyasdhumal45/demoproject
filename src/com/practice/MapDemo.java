package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	
	public static void main(String[] args) {
		Map<String,Integer> m= new<String,Integer> TreeMap();
		m.put("Ram",3);
		m.put("Sohan", 2);
		m.put("Ashok", 1);
		m.put("Ajay", 6);
		m.put("Prasanna",5);
		System.out.println(m);
	}
} 
