package epproject;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Insert1 extends HttpServlet
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
        	Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","180031412");
    		String username = request.getParameter("er");
    		 String Eid = request.getParameter("es");
    		PreparedStatement pst = con.prepareStatement("insert into master1 values(?,?)");
    		      pst.setString(1,username);
    		      pst.setString(2,Eid);


    		      int i = pst.executeUpdate();
    		      if(i!=0)
    		{
    		        out.println("inserted");
    		      }
    		      else
    		      {
    		              out.println("failed to insert");
    		            }
    		          }
    		          catch (Exception e){
    		            out.println(e);
    		          }
    		        }
    		      }
