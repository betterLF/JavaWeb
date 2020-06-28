<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/6/28
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="../UserCookieServlet" method="get">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username" value="${cookie.username.value}"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password" value="${cookie.password.value}"></td>
        </tr>
        <tr>
            <td>记住密码：</td>
            <td><input type="checkbox" name="rp" value="rp"></td>
        </tr>
        <tr>
            <td> <input type="submit" value="Submit" /></td>
        </tr>
    </table>
</form>
</body>
</html>
