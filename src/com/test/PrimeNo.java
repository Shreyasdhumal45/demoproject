package com.test;

import java.util.Scanner;

public class PrimeNo {

	public void prime(int no) {
		int count=0;
		for(int a=1;a<=no;a++) {
		
		if(no%a==0) {
			count++;
		}
		
		
		}
		if (count==2) {
			System.out.println(no+ " Is Prime no ");
			
		}else {
			System.out.println(no+ " is not prime no");
		}

		}
	
		
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
	System.out.println("Enter no");
		int no=scan.nextInt();
		
		
		PrimeNo p=new PrimeNo();
		p.prime(no);
	}
}
