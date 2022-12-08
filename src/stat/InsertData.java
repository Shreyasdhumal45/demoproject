package stat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertData {
public static void main(String[] args) throws SQLException {
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
		
		String sql=	"insert into student (firstName ,lastname,city) values('Parth','Pawar','Baramati')";
		
		Statement st=con.createStatement();
		st.execute(sql);
		System.out.println("Insertion Success");
	} catch (ClassNotFoundException e) {
				e.printStackTrace();
	}
}
}
