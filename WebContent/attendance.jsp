<%@page import="java.sql.*" %>
<%
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","180031412");		
		String vsql = "select * from remark1";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(vsql);
		%>
		<html>
<form action="js" method="post">
		<body>
			<center>
			<table border=1>
				<tr><th>Username</th><th>Eid</th><th>Reason</th><th>Fromdate</th><th>Todate</th>
			
				</tr>
		<%
		while(rs.next()){
			%>
			<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
			</tr>
			<%	
		}
		%>
		</table>
username:<input type="text" name="uname"><br>
password:<input type="text" name="pwd"><br>
reason:<input type="text" name="re"><br>
<input type="submit" name="submit" value="Accept">
</body>
</form>
</html><%
		con.close();
	}catch(Exception e){
		out.println(e.getMessage());
                 }
%>
