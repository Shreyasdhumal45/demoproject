package com.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	
	LinkedList ll=new LinkedList();
	ll.add(23);
	ll.add("Shreyas");
	ll.add("Aniket");
	ll.add(67);
	ll.add(75);
	ll.add(3,44);
	ll.addFirst(45);
	ll.remove(3);
	ll.addLast(54);
	System.out.println(ll);
}
		
	}

