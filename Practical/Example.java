package JDBC;
import java.sql.*;
public class Example {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/tree",
				"root", "Iaf@1932");
			Statement stmt= con.createStatement();
			System.out.println("Inserting records");
			String sql = "Insert into fruit values(43)";
			stmt.executeUpdate(sql);

	}
		catch(Exception e){
			System.out.println(e);
		}

}
}
