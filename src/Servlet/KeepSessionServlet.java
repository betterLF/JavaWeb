package Servlet;

import Demo.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "KeepSessionServlet")
public class KeepSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //持久化Session->持久化特殊的Cookie
        Cookie[] cookies = request.getCookies();
        for (Cookie c:cookies){
            if("JSESSIONID".equals(c.getName())){
                c.setMaxAge(600);
                response.addCookie(c);
                break;
            }
        }
        //设置session的非活动时间
        HttpSession session=request.getSession();
        session.setMaxInactiveInterval(600);//秒数
        session.setAttribute("stu", new Student("aa",1));
    }
}
