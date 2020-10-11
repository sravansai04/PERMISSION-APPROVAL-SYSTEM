package epproject;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InsertingDatalea extends HttpServlet
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
        try
{
      String username = request.getParameter("un");
      String password = request.getParameter("pw");
      Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","180031412");
      PreparedStatement pst = con.prepareStatement("insert into leader values(?,?)");
      pst.setString(1,username);
      pst.setString(2,password);
      int i = pst.executeUpdate();
      if(i!=0)
{
        out.println("<br>Record has been inserted");
      }
      else
{
        out.println("failed to Register");
      }
    }
    catch (Exception e){
      out.println(e);
    }
  }
}
