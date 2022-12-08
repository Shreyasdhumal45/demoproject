package com.test;
import java.util.Scanner;
public class Encapsulation {

	private int id;
	private String city;
	private String name;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
	return name;
	}
	public String setName(String name) {
		return this.name=name;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id  ");
		int id=scan.nextInt();
		System.out.println("Enter city   ");
		String city=scan.next();
		System.out.println("Enter name  ");
		String name=scan.next();
		
		scan.close();
		
		Encapsulation d=new Encapsulation();
		d.setId(id);
		d.setCity(city);
		d.setName(name);
		System.out.println("Student id is "+d.getId()+" And in the city "  +d.getCity()+",Name is "  +d.getName());
	
	}}	
