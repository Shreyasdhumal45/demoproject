package com.main;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFile {
public static void main(String[] args) {// throws FileNotFoundException {

  

	try {
		FileInputStream file = new FileInputStream("C:\\Users\\Shreyas\\Desktop\\practice.txt");

		Scanner scan=new Scanner(file);
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
			}
		scan.close();
		}
	    catch (Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}
	
	

}}