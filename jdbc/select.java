import java.sql.*;
class select
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

			String inser="SELECT * FROM `student`;";
			ResultSet rs=stat.executeQuery(inser);
			System.out.println("ID"+"    "+"Name"+"    "+"Lname");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"   "+rs.getString(3));
			}


			//System.out.println("Update Success.....");
		}
		catch(Exception e)
		{
			System.out.println("Not Connected");
		}
	}
}