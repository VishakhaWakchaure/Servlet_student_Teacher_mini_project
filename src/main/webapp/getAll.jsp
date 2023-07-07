
>
<%@page import="java.util.List"%>
<%@page import="com.jsp.dto.Student"%>
<%@page import="com.jsp.service.StudentService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% StudentService studentService=new StudentService();
%>
<% List<Student> students=studentService.getAllStudent(); %>
<table border="2px">
<tr>
<th>sId</th>
<th>Name</th>
<th>Email</th>
<th>Update</th>
<th>Delete</th>
<th>GetById</th>


</tr>
<%for(Student p:students){
%>
<tr>
<td><%=p.getId() %></td>
<td><%=p.getName() %></td>
<td><%=p.getEmail() %></td>
<td><a href="updateStudent.jsp?id=<%= p.getId() %>">Update</a></td>
<td><a href="deleteStudent.jsp?id=<%= p.getId() %>">Delete</a></td>
<td><a href="getByIdStudent.jsp?id=<%= p.getId() %>">GetById</a></td>

</tr>

<%} %>
</table>
</body>
</html>