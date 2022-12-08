package com.practice;

import java.util.HashMap;
import java.util.Map;

public class AllDemo {

	
	/*public HashMap<Integer,String> addAll(){
		HashMap<Integer,String> hm=new HashMap();
		hm.put(101," arg1");
		hm.put(100,"arg2");
		hm.put(102,"arg3");
		return hm;
	}
				public static void main(String[] args) {
					
				AllDemo ad=new AllDemo();
				System.out.println(ad.addAll());
				HashMap<Integer, String> hp=ad.addAll();
				System.out.println(hp);
				
	}
}
*/
	
	public static void main(String[] args) {
		
	
    HashMap<Employee,String> hm=new HashMap();
	
	Employee emp=new Employee();
    hm.put(emp,emp.getLastName());
			
    System.out.println(hm.get(emp));
	}
    
    
    
    
	
	
	
}
	
	
	
	
	
	
	
	
	