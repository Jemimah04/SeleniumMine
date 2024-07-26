package Generic_Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {

	
	
	public void dataBaseConnection(WebDriver driver) throws Throwable
	{
		Driver driverRef=new Driver();
		 DriverManager.registerDriver(driverRef);
        }
	
	public void dataBaseClose() throws Throwable
	{
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders", "root", "jemi");
		//step3:-Create sql statement
      Statement state = con.createStatement();
	     String query = "select * from student";
	
//	     //step4:-Execute Statement/Query 
	     ResultSet result=   state.executeQuery(query);
	
	     while (result.next())
	     {
System.out.println(result.getInt(1) + "\t" + result.getString(2) + "\t" + result.getString(3) + "\t" + result.getString(4));
		}
	     //step5:- close database
	     con.close();
	}
}
