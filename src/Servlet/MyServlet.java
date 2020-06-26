package Servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //测试response
        System.out.println("doPost()");
        //1.服务器向客户端做出响应(文本|html)
        //获取响应流
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        //响应
      // writer.write("login success!");
       writer.write("<h1>登录login success!</h1>");
       //3.重定向
        //response.sendRedirect("HTML/login_success.html");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //测试request对象

        System.out.println("doGet()");
        //1.获取请求参数,通过name获取
        String username = request.getParameter("username");
        System.out.println(username);
        //2.获取项目虚拟路径
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        //转发   web\HTML\login_success.html
        //1.获取转发器，
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("HTML/login_success.html");
        //2，执行转发
        requestDispatcher.forward(request,response);
    }

}
