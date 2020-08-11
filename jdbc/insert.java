import java.sql.*;
class insert
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

			String yname="kunal";
			String ylname="Sharma";
			String inser="INSERT INTO `student`(name,lname) VALUE ('"+yname+"','"+ylname+"');";
			stat.executeUpdate(inser);

			System.out.println("value insert Success.....");
		}
		catch(Exception e)
		{
			System.out.println("Not Connected");
		}
	}
}