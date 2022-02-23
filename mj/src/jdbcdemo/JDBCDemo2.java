package jdbcdemo;
import java.sql.*;
public class JDBCDemo2 {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///victory","root","mjmj");
			Statement st=con.createStatement();
			String query="insert into  demo2(id,name)values(101,'Muskan'),(102,'Divyam'),(103,'Dhriti')";
			int i=st.executeUpdate(query);
			if(i>0)
			{
				System.out.println("Record inserted");
			}
			else
			{
				System.out.println("Record not inserted");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
