<%--
  Created by IntelliJ IDEA.
  User: fcheb
  Date: 2/22/2022
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My First JSP</title>
</head>
<body>
    <% response.getWriter().println("<h1>Nom : "+ request.getParameter("name")+"</h1>"); %>
    <h1>Nom : <%=  request.getParameter("name") %> </h1>
    <h1>Nom : <%=  request.getAttribute("name") %> </h1>
    <h1>Nom : ${name} </h1>
</body>
</html>
