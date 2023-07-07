
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updatedT" method="post">
TeacherId: <input type="number" name="TeacherId" value="<%=request.getParameter("id") %>"> <br> <br>

UpdatedName: <input type="text" name="TeacherName"> <br> <br>

UpdatedCno:<input type="number" name="TeacherCno"> <br> <br>

UpdatedEmail: <input type="email" name="TeacherEmail"><br> <br>

<input type="submit"> 
</body>
</html>