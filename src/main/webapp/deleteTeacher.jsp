<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="deletedT" method="post">
TeacherId:<input type="number" name="TeacherId" value="<%=request.getParameter("id") %>"><br> <br>
<input type="submit">
</form>
</body>
</html>