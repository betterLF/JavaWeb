package Servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
        /*
          实现登录功能
              1.获取用户名和密码
              2.判断用户名和密码是否正确(admin，dao)
              3.路径跳转
         */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //1.获取用户名和密码
        //response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        System.out.println(username);
        String password = request.getParameter("password");
        // 2.判断用户名和密码是否正确(admin，dao)
        if("admin2".equals(username)&&"admin2".equals(password)){
            //登录成功 转发跳转
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("HTML/login_success.html");
            requestDispatcher.forward(request,response);
        }else{//重定向跳转
            response.sendRedirect("HTML/loginDemo.html");
        }

    }
}
