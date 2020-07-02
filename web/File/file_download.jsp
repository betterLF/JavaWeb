<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/2
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件下载</title>
</head>
<body>
<h1>文件商店</h1>
<%--<a href="${pageContext.request.contextPath}/File/download/11.jpg">11.jpg</a>--%>
<a href="${pageContext.request.contextPath}/fileDownloadServlet?fileName=11.jpg">11.jpg</a>
<a href="${pageContext.request.contextPath}/fileDownloadServlet?fileName=2020.7.3.txt">2020.7.3.txt</a>
<a href="${pageContext.request.contextPath}/fileDownloadServlet?fileName=位置指纹算法.pdf">位置指纹算法.pdf</a>
</body>
</html>
