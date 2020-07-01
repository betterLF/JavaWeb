package Ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AjaxServlet")
public class AjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost()");
        String name = request.getParameter("name");
        String location = request.getParameter("location");
        System.out.println("name:"+name+"   location:"+location);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet()");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println(name);
        System.out.println(age);
        PrintWriter writer = response.getWriter();
        //writer.write("success!!!");
        //如果dataType:"json",则返回一定要是json格式,否则会报错
        writer.write("{\"msg\":\"success\"}");
    }
}
