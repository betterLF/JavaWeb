<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/6/27
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% application.setAttribute("name1","安安");
    session.setAttribute("name2","呃呃");
    request.setAttribute("name3","喔喔");
    pageContext.setAttribute("name4","翻翻");
%>
application:<%=application.getAttribute("name1")%> <br>
session:<%=session.getAttribute("name2")%> <br>
request:<%=request.getAttribute("name3")%> <br>
pageContext:<%=pageContext.getAttribute("name4")%> <br>
<%--<jsp:forward page="hello.jsp"></jsp:forward>--%>
<a href="hello.jsp">Demo2</a>
</body>
</html>
