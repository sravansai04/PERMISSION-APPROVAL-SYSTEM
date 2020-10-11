package epproject;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
public class Rem extends HttpServlet
{
	private static final long serialVersionUID = 1L;
public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
        try
{
        	Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","180031412");
    		String username = request.getParameter("user");
    		 String Eid = request.getParameter("eid");
    		 String rm = request.getParameter("remarks");
    		 String d1 = request.getParameter("sdate");
    		 String d2 = request.getParameter("edate");
    		PreparedStatement pst = con.prepareStatement("insert into remark1 values(?,?,?,?,?)");
    		      pst.setString(1,username);
    		      pst.setString(2,Eid);
    		      pst.setString(3,rm);
    		      pst.setString(4,d1);
    		      pst.setString(5,d2);
    		      int i = pst.executeUpdate();
    		      if(i!=0)
    		{
    		        out.println("<br>Remark has been inserted");
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