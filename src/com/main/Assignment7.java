package com.main;

import java.util.Scanner;

public class Assignment7 {
//Q1-

	/*public int getNumberCube(int num){
		int a=num;	
	int b= a*a*a;
		return b;
		}
		
	public static void main(String[] args) {
		Assignment7 assign=new Assignment7();
		
   System.out.println(assign.getNumberCube(34));
	}
	
	
	} */

	//Q3-
	public void factor(int no) {
	
		for(int a=1;a<=no;a++) {
			if(no%a==0) {
				System.out.println(a);
			}
			
		}
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no");
		int no=scan.nextInt();
		scan.close();
		Assignment7 a=new Assignment7();
		a.factor(no);
	}
		
	}
	


