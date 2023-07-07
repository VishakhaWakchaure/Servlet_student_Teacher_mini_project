<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String name[]=new String[3]; %>   <%-- //declarationtag  <%! %> --%>
<%                                      //scriptlet tag <% %>
name[0]="vishakha";
name[1]="kailas";
name[2]="wakchaure";
%>

<%for(int i=0;i<name.length;i++){ %>
<%= name[i] %>                       <%-- //exprationTag <%= %> --%>
<% } %>
</body>
</html>