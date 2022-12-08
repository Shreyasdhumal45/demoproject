package com.test;

public class P {
	public static void main(String[] args) 
	{int n=1;		for(int p=1;p<=25;p++) {
		int[] arr = {p++};
		for (int i=0 ; i<arr.length ;i++)
		
			while(n<=5) {
			int a=arr[i];
				int count=0;
			for (int j=1 ; j<=n ; j++)
			{   while(j<=p) {
				if(a%j==0)
					count++;	
				j++;
			}
			if(count==2) {
				System.out.println(n + " is prime");
				n++;
			}p++;
		
		}}
	}}}


