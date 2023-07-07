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
<form action="updated" method="post">
StudentId: <input type="number" name="StudentId" value="<%=request.getParameter("id") %>"> <br> <br>

UpdatedName: <input type="text" name="StudentName"> <br> <br>

UpdatedEmail: <input type="email" name="StudentEmail"><br> <br>
<input type="submit"> 

</form>
</body>
</html>