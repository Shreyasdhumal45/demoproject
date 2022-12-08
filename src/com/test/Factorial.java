package com.test;
import java.util.Scanner;
public class Factorial {
	
	public int factorial(int no) {
	
	int i=1;
	int f=1;
	for(i=1;i<=no;i++) {
		f=f*i;
	}
	System.out.println(f);
	return f;
	}
	

public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the no  ");
	int no=scan.nextInt();
    scan.close();
	
	Factorial ad=new Factorial();
	ad.factorial(no);
}
}
