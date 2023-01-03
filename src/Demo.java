import java.sql.*;
public class Demo {

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/abc";
		String uname = "root";
		String pass = "Mali@1996";
		String query = "select *from student";
	
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String userdata;
		while(rs.next())
		{
			String name = rs.getInt(1) + " " + rs.getString(2);
			System.out.println(name);
			
		}
		
		st.close();
		con.close();
	}

}
