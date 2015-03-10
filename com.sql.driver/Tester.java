import java.sql.*;

public class Tester{
	
	static Connection con;
	static Statement stmt;
	static ResultSet rs;

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		
		DriverManager.registerDriver(new MyDriver());
		
		con = DriverManager.getConnection("jdbc:odbc:MYSQL", "root", "123");
		
		stmt = con.createStatement();
		
		rs = stmt.executeQuery("SELECT* from tab1");
		
		while(rs.next()){
			System.out.println(rs.getInt("id")+" "+rs.getString("name"));
		}
	}
}