package stat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Preparestatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
         
		
		/*	
		 String sql = "insert into student(firstName,lastName,city)"
					+ "values('Shreyas','Dhumal','pune')";
		  Statement statement = con.createStatement();
            statement.executeUpdate(sql);
			 //statement.execute(sql);
*/      
			
			PreparedStatement ps= con.prepareStatement( "insert into student(firstName,lastName,city) +"
					+ "values(?,?,?)");
			
             ps.setString(1, "Gaurav");
             ps.setString(2, "Sakunke");
             ps.setString(3, "Pune");
             
			 con.close();
			//statement.close();
			 System.out.println("Insertion successfully...");
		} catch (Exception e) {
			System.out.println(e);
		}
        
	}   
}       
