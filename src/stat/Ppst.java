package stat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ppst {
	PreparedStatement pps=null;
	Connection con=null;
	
	 public void insertStudentData(String firstName,String lastName,String city) {
		 
		try { 
		 ConnectionTest ct=new ConnectionTest();
		 con =ct.getConnectionDetails();
		 pps=con.prepareStatement("insert into student (firstName,lastName,city) values (?,?,?)");
			pps.setString(1, firstName);
			pps.setString(2, lastName);
			pps.setString(3, city);
			
			pps.executeUpdate();
			System.out.println("Success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	

	 }public static void main(String[] args) {
		
		 Scanner scan =new Scanner(System.in);
		 System.out.println("Enter the FirstName");
		 String firstName=scan.next();
		 System.out.println("Enter the Lastname");
		 String lastName=scan.next();
		 System.out.println("Enter the city");
		String city=scan.next();		
		
		Ppst ps= new Ppst();
		ps.insertStudentData(firstName, lastName, city);
	 
	 
	 }
	 }

