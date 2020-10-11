package epproject;

import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;
public class LoginLea extends HttpServlet
{
	private static final long serialVersionUID = 1L;
public void service(HttpServletRequest req,HttpServletResponse res)
{
	try
	{
	String uname=req.getParameter("uname");
	String pwd=req.getParameter("pwd");
	PrintWriter out=res.getWriter();
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","180031412");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from leader");
	int flag=0;
	while(rs.next())
	{
	if(uname.equals(rs.getString(1))&&pwd.equals(rs.getString(2)))
	{
	flag=1;
	break;
	}
	}
	con.close();
	if(flag==0){
	out.println("Login Again");
	RequestDispatcher rd=req.getRequestDispatcher("leaderlogin.html");
	rd.forward(req,res);
	}
	else
	{
	RequestDispatcher rd=req.getRequestDispatcher("attendance.jsp");
	rd.forward(req,res);
	}
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
}
}