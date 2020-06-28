package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet")
public class UserCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String rp=request.getParameter("rp");
        if(rp==null){//如果未勾选
            return;
        }
        //如果勾选
        //将数据存放Cookie中
        Cookie cookieName=new Cookie("username",username);
        Cookie cookiePwd=new Cookie("password",password);
        //将Cookie持久化
        cookieName.setMaxAge(60*60*24*7);//7天
        cookiePwd.setMaxAge(60*60*24*7);
        //将Cookie响应给浏览器
        response.addCookie(cookieName);
        response.addCookie(cookiePwd);
        //调转
    }
}
