package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "KeepCookieServlet")
public class KeepCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建cookie
        Cookie cookie=new Cookie("stuAge","18");
        //持久化cookie
        //cookie.setMaxAge(60);//60为秒数
        //有效路径
        cookie.setPath(request.getContextPath()+"/a");
        response.addCookie(cookie);

    }
}
