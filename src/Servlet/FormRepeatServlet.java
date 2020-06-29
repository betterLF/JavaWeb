package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "FormRepeatServlet")
public class FormRepeatServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //分别取session域和隐藏域的uuid值
        String uuid2 = request.getParameter("uuid2");
        HttpSession session=request.getSession();
        Object uuid = session.getAttribute("uuid");
        // 判断是否相等
        if(uuid!=null&&uuid.toString().equals(uuid2)){
            //相等，提交，移除session域中的token
            System.out.println("summit");
            session.removeAttribute("uuid");
        }
        System.out.println("end!");

    }
}
