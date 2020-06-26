package Servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistServlet")
public class RegistServlet extends HttpServlet {
    /*
    实现伪注册
        1.获取用户名和密码
        1_2.
           校验用户名是否存在
        //2.调用dao接口，将用户名和密码保存到数据库
        3.跳转
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取用户名和密码
        String username = request.getParameter("username");
        //校验用户名是否存在
        if("admin2".equals(username)){
            //用户名已存在，注册失败，重定向
          response.sendRedirect("HTML/RegistDemo.html");
        }else{
            //用户名可以，注册成功，转发
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("HTML/regist_success.html");
            requestDispatcher.forward(request,response);
        }
    }
}
