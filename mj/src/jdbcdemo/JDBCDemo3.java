package jdbcdemo;
import java.sql.*;



public class JDBCDemo3 {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///victory","root","mjmj");
			Statement st=con.createStatement();
			String query="select * from demo2";
			ResultSet s=st.executeQuery(query);
			while(s.next())
			{
				System.out.println(+s.getInt("id")        +s.getString("name"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
