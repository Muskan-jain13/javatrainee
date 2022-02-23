package jdbcdemo;
import java.sql.*;
public class JDBCDemo4 {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///victory","root","mjmj");
			Statement st=con.createStatement();
			String query="insert into demo2(id,name)values(?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
