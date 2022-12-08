package com.practice;

import java.util.Scanner;

public class F {

	public void factorial(int num){
		int i=1;
		while (i<=num) {
			if (num % i==0	) {
		System.out.println(i);}
		i++;
		}}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				int num=scan.nextInt();
			F f=new F();
      	f.factorial(num);	
			
	}
}

