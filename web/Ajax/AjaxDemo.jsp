<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/1
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
        $("#btn").click(function(){
                $.ajax({
                    type: "POST",
                    url: "../AjaxServlet",
                    data: "name=John&location=Boston",
                    success: function (msg) {
                        alert("Data Saved:" + msg);
                    }
                });
            });

            $("#btnGet").click(function(){
                $.get("../AjaxServlet",{"name":"asas","age":18},function (msg) {
                   alert("msg:"+msg.msg);
                },"json")
                // $.ajax({
                //     type: "Get",
                //     url: "../AjaxServlet",
                //     data: {"name":"asas","age":18},
                //     dataType:"json",
                //     success: function (msg) {
                //         alert("msg:" + msg.msg);
                //     },
                //     error:function () {
                //         alert("error");
                //     }
                // });
            });
        });
    </script>
</head>
<body>
<button id="btn">click Post</button>
<button id="btnGet">click get</button>
</body>
</html>
