<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/6/27
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
application:<%=application.getAttribute("name1")%> <br>
session:<%=session.getAttribute("name2")%> <br>
request:<%=request.getAttribute("name3")%> <br>
pageContext:<%=pageContext.getAttribute("name4")%> <br>
这是我的第一个jsp页面
<br>
<%
    for(int i=0;i<=100;i+=2){
%>
<br><%=i%>;
<%!int i=1;%>
<%
    }
%>
</body>
</html>
