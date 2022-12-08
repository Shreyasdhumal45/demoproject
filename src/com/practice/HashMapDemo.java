package com.practice;

import java.util.List;
import java.util.Set;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	
	public static void main(String[] args) {
		ArrayList<String> stat=new ArrayList();
		stat.add("Paper1");
		stat.add("Paper2");
		stat.add("Paper3");
		
		List<String> math=new ArrayList();
		
		math.add("Paper 3");
		math.add("Paper 4");  
		math.add("Paper 6");
		
		List <String> chem=new ArrayList();
		chem.add("Paper 7");
		chem.add("Paper 8");
		chem.add("Paper 9");
		                                                        	
		HashMap <String,List<String>>category=new HashMap();
		category.put("Stat",stat);
		category.put("Maths", math);
		category.put("Chem", chem);
		
		HashMap<String,HashMap <String,List<String>>>exam=new HashMap();
		exam.put("ExamPapers", category);
		
		Set<String> s=exam.keySet();
//		for(String i:s) {
//			System.out.println( i +" "+exam.get(i));
		
		Iterator<String> itr= s.iterator();	
		while(itr.hasNext()) {
	    String i=itr.next();
		System.out.println(i);
		System.out.println(exam.get(i));
		}
		
	
		
	//	exam.forEach((a,b)->System.out.println(a +""+b));
	}
	}

