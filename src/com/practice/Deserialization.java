package com.practice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
public static void main(String[] args) {
try {
	FileInputStream fis=new FileInputStream("C:\\Users\\Shreyas\\Desktop\\practice.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Object o=ois.readObject();
	
	SerializationDemo s=(SerializationDemo)o;
    System.out.println(s.name);
	System.out.println(s.city);
	ois.close();
}
catch(Exception e) {
		System.out.println(e);
	}

}
}
