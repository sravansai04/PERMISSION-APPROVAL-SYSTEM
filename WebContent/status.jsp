<%@page import="java.sql.*" %>
<%
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","180031412");
		if( con != null )
			System.out.println("connected...");
		else
			System.out.println("not connected..");
		String vsql = "select * from master1";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(vsql);
		%>
		<html>

		<body>
			<center>
			<table border=1>
				<tr>									<th>username</th><th>eid</th>
			
				</tr>
		<%
		while(rs.next()){
			%>
			<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getString(2)%></td>
                        
			</tr>
			<%	
		}
		%>
		</table>

</body>

</html>
		<%
		con.close();
	}catch(Exception e){
		out.println(e.getMessage());
                 }
%>
