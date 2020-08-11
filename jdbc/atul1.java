import java.sql.*;
class atul1
{
	public static void main(String s[])
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/","root","");
			System.out.println("Connect Success.....");
			Statement stat=con.createStatement();
			stat.executeUpdate("CREATE DATABASE Natasha");
			System.out.println("Data Base Create Success.....");
		}
		catch(Exception e)
		{
			//System.out.println("Not Connected");
		}
	}
}
