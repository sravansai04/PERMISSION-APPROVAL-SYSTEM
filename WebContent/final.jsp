<%@page import="java.sql.*" %>
<%
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","180031412");		
		String vsql = "select * from master";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(vsql);
		%>
		<html>
<form action="set" method="post">
		<body>
			<center>
			<table border=1>
				<tr>									<th>username</th><th>eid</th><th>reason</th>
				</tr>
		<%
		while(rs.next()){
			%>
			<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
			</tr>
			<%	
		}
		%>
		</table>
Username :<input type="text" name="er">
Eid:<input type="text" name="es">
<input type="submit" name="ep" value="ACCEPT">
</body>
</form>
</html>
		<%
		con.close();
	}catch(Exception e){
		out.println(e.getMessage());
                 }
%>
