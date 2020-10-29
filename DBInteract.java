package day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInteract {


	public DBInteract() {
		super();
		}
	
	public static void insert(int a,String b,int c) throws ClassNotFoundException, SQLException{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

		Connection con = DriverManager.getConnection("jdbc:derby:hsbcfl;create=true");
		PreparedStatement ps =con.prepareStatement("insert into employee values(?,?,?)");
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setInt(3, c);
		ps.execute();
		con.close();
	}
	
	public static void see() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:hsbcfl;create=true");
		Statement st=con.createStatement();
		;
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" "+rs.getString("name"));
		}
		con.close();
	}
	
	public static void update(int ID,String b,int c) throws ClassNotFoundException, SQLException 
	{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:hsbcfl;create=true");
		PreparedStatement ps=con.prepareStatement("update employee set name = (?) ,salary=(?) where empid=(?)");
		ps.setInt(2, c);
		ps.setString(1, b);
		ps.setInt(3, ID);
		ps.execute();
		con.close();
	}
	
	
	
	
}
