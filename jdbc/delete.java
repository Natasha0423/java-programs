import java.sql.*;
class delete
{
	public static void main(String s[])
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/kunal","root","");
			System.out.println("Connect Success.....");
			Statement stat=con.createStatement();

			int sid=5;
			String inser="DELETE FROM `student` WHERE id="+sid+";";
			stat.executeUpdate(inser);

			System.out.println("Delete Success.....");
		}
		catch(Exception e)
		{
			System.out.println("Not Connected");
		}
	}
}