import java.sql.*;
class update
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

			int sid=1;
			String sname="Kabir";

			String inser="UPDATE `student` SET 'name`='"+sname+"' WHERE id="+sid+";";
			stat.executeUpdate(inser);

			System.out.println("Update Success.....");
		}
		catch(Exception e)
		{
			System.out.println("Not Connected");
		}
	}
}