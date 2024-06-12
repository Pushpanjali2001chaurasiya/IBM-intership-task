package insert;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Index")
public class insert extends HttpServlet{
	protected static final String INSERT_QUERY = "INSERT INTO pihu(NAME,AGE,CITY,COLLEGE) VALUE (?,?,?,?)" ;
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String name  = req.getParameter("name");
		String age  = req.getParameter("age");
		String city  = req.getParameter("city");
		String college  = req.getParameter("college");


		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/java_conn","root","")){
					PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
					{
						ps.setString(1,name);
						ps.setString(2,age);
						ps.setString(3,city);
						ps.setString(4,college);
					int count = ps.executeUpdate();
					if(count==0) {
						pw.println("Record not Submitted");
					}else {
						pw.println("Record submitted in database");
					}

					}
		}
				catch(SQLException se) {
					pw.println(se.getMessage());
					se.printStackTrace();
				}
		catch(Exception e) {
			pw.println(e.getMessage());
			e.printStackTrace();
		
	}
	
	}
	
	}