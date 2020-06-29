<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/6/29
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
sessionID:<%=session.getId()%><br>
<a href="../GetSessionServlet">获取Session</a>
<a href="../KeepSessionServlet">持久化Session</a>
<a href="../RemoveSessionServlet">设置Session立即失效</a>
name:<%=session.getAttribute("stu")%>
</body>
</html>
