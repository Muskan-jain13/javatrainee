package jdbcdemo;
import java.sql.*;
public class JDBCDemo {
public static void main(String[]args) throws SQLException
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///victory","root","mjmj");
		Statement st=con.createStatement();
		String query="create table demo2(id int,name varchar(20))";
		st.executeUpdate(query);
		System.out.println("created!!");
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
}
	
}
