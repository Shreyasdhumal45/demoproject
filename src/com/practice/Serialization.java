package com.practice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
public static void main(String[] args) {
	SerializationDemo s=new SerializationDemo();
	s.name="Shreyss";
	s.city="Pune";
	
	try {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Shreyas\\Desktop\\practice.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
