package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ArraylistDemo {

	
	public static void main(String[] args) {
		
	ArrayList al=new ArrayList();
	
	al.add(10);
	al.add("Shreyas");
	al.add(25);
	al.add("Dj");
	//al.remove(2);
	al.add(2,23);
	System.out.println( al.size());
	System.out.println(al.contains(25));
	
	//System.out.println(al);
	
	Iterator itr= al.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
//	for(Object i:al);
//	System.out.println(al); 
	
	
	ArrayList<String> al1=new ArrayList<String>();
	al1.add("Sd");
	al1.add("Ad");
	al1.add("Gs");
	Collections.sort(al1);
	System.out.println(al1);
	al.addAll(al1);
	System.out.println(al);
	
	
	
	
    LinkedList ll=new LinkedList();
	ll.add(3);
}
}

