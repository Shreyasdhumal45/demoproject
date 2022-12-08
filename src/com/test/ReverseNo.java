package com.test;

import java.util.Scanner;

public class ReverseNo {
	 
   public int reverse(int no) {
	int a=no;
	int b=0;
	int c;
	
	
		while(a!=0)	{
			c=a%10;
		    b=b*10+c;
		    a=a/10;
		}
		System.out.println(b);
		return b;
		}
	
    public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
    System.out.println("Enter the no for reverse");
	int no=scan.nextInt();
    scan.close();
    
    ReverseNo r=new ReverseNo();
   r.reverse(no);	}
	
}

