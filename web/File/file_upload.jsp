<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/2
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<h1>文件上传</h1>
<form action="../fileUploadServlet" method="post" enctype="multipart/form-data">
    姓名: <input type="text" name="uname"><br>
    上传文件: <input type="file" name="fileupload"><br>
    <input type="submit" value="上传朋友圈">
</form>
</body>
</html>
