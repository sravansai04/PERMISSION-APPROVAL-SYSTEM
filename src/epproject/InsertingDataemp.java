package epproject;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InsertingDataemp extends HttpServlet
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
String Firstname = request.getParameter("T1");
String Lastname = request.getParameter("T2");
String EmpId = request.getParameter("T3");
      String username = request.getParameter("un");
      String password = request.getParameter("pw");
      String Email = request.getParameter("mail");
      String Mobileno = request.getParameter("mob");

      Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","180031412");

	String vsql = "create table employee(pid number(4) primary key,pname varchar2(20),price number(10,2))";

		Statement stmt = con.createStatement();
		int n = stmt.executeUpdate(vsql);

		PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
pst.setString(1,Firstname);
pst.setString(2,Lastname);
pst.setString(3,EmpId);
      pst.setString(4,username);
      pst.setString(5,password);
pst.setString(6,Email);
pst.setString(7,Mobileno);
      
      int i = pst.executeUpdate();
      if(i!=0)
      {
        out.println("<br>Record has been inserted");
        RequestDispatcher rd=request.getRequestDispatcher("employelogin.html");
rd.forward(request,response);

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
