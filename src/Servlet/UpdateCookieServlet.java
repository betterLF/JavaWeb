package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateCookieServlet")
public class UpdateCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //覆盖式修改
//        Cookie cookieName=new Cookie("stuName","bb");
//        response.addCookie(cookieName);
        //直接式修改
        Cookie[]cookies=request.getCookies();
        for (Cookie cookie:cookies){
            if("stuName".equals(cookie.getName())){
                cookie.setValue("cc");
                response.addCookie(cookie);
                break;
            }
        }
    }
}
