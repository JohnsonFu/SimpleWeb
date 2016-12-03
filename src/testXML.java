import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class testXML extends HttpServlet{
	private String diverClass;
	private String username;
	private String password;
	private String url;
	private Connection con;
	public testXML(){
		 diverClass = /* getServletConfig(). */getServletContext().getInitParameter("driver");
	     username=/* getServletConfig(). */getServletContext().getInitParameter("username");
	     password=/* getServletConfig(). */getServletContext().getInitParameter("password");
	 	url=/* getServletConfig(). */getServletContext().getInitParameter("url");
		try {
			Class.forName(diverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			con = DriverManager.getConnection(  
			          url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	public ResultSet Query(String sql){
		ResultSet result=null;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		try {
			 result=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args){
		testXML db=new testXML();
		ResultSet result=db.Query("select * from user");
		int rowCount=0;
		try {
			while(result.next())      
			 {      
			     System.out.println(result.getString("name"));    
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	}
	
}
