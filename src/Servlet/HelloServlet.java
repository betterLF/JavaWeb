package Servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author lifei
 * @date 2020/6/25 10:36
 */

public class HelloServlet implements Servlet{
    private ServletConfig servletConfig;
      // 创建servlet对象后执行init
    public void init(ServletConfig servletConfig) {
      this.servletConfig=servletConfig;
    }

    public ServletConfig getServletConfig() {
        return null;
    }
/*
处理用户的请求
 */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        System.out.println("service()!!!");
        String encode = servletConfig.getInitParameter("encode");
        System.out.println(encode);
        System.out.println(servletConfig.getServletContext());
        System.out.println(servletConfig.getServletName());
        //获取上下文的参数
        System.out.println(servletConfig.getServletContext().getInitParameter("gae"));
        //获取真实路径
        servletConfig.getServletContext().getRealPath("HelloServlet.class");

    }

    public String getServletInfo() {
        return null;
    }
  //servlet消亡时执行
    public void destroy() {

    }
}


