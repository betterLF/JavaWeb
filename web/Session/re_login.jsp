<%@ page import="java.util.UUID" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/6/29
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String uuid = UUID.randomUUID().toString().replace("-", "");
    session.setAttribute("uuid",uuid);
%>
<form action="../FormRepeatServlet" method="get">
    <input type="hidden" value="<%=uuid%>" name="uuid2">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td> <input type="submit" value="Submit" /></td>
        </tr>
    </table>
</form>

</body>
</html>
