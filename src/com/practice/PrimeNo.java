package com.practice;

import java.util.Scanner;

public class PrimeNo {

	
		public static void main(String[] args)   
		{  
		int count=0;
		int	n=1;
		int i=1,j=1; 
	
		int array[]=new int [5];
		while(n<=5) 
		{  
			j=1;  
			count=0;  
		while(j<=i)  
		{  
		if(i%j==0)  
		count++;  
		j++;   
		}  
		if(count==2)  
		{  
		System.out.println(i);  
		n++;  
		}  
		i++;  
		}  
		}  
		}  