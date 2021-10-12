<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@page import="java.sql.*" %>
 <%@page import="java.io.*" %>
<body>
<%
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/harsh","root","Harsh12345#"); 
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM empl");

%>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>firstName</th>
				<th>lastName</th>
				<th>Salary</th>
				<th>Designation</th>
			</tr>
		</thead>
		
		<tbody >
			<tr<%while(rs.next()){ %>>
				<td><%=rs.getLong(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getString(3)%></td>
				<td><%=rs.getInt(4)%></td>
				<td><%=rs.getString(5)%></td>
			</tr <%} con.close(); %>>
		</tbody>
		
	</table>

</body>
</html>