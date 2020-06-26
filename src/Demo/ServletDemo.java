package Demo;

/**
 * @author lifei
 * @date 2020/6/25 10:27
 */
public class ServletDemo {
    /*
    Servlet
           Servlet=java+html(url) Servlet Applet(服务端小程序)
           狭义上javax.servlet.Servlet接口及其子类
           广义上指实现了Servlet接口的实现类
    使用Servlet接口的方式
      创建一个类实现Servlet接口
      在web.xml中注册这个实现类
      Tomcat(Servlet容器)会创建实现类对象
      Servlet工作原理(执行流程)
      请求
      web.xml中url
      servlet-name
      servlet-class,找到指定Servlet
      默认执行service()，处理请求，做出响应
    Servlet生命周期：从创建到消亡的过程
    构造器
         执行次数：在整个生命周期中执行一次
         执行时机：第一次接收请求时执行
    init():
         执行次数：在整个生命周期中执行一次
         执行时机：第一次接收请求时执行
    service()
         执行次数：在整个生命周期中执行多次
         执行时机：每次接收请求时执行
    destroy()
         执行次数：在整个生命周期中执行一次
         执行时机：关闭服务器时执行
    ServletConfig和ServletContext区别
                 ServletConfig:代表了Servlet的配置对象
                 作用：
                    1:获取Servlet初始化参数
                    2:获取ServletConnect对象
                    3:获取Servlet名称
                 ServletContext:代表了Servlet的上下文对象
                 作用：
                     1:获取初始化参数
                     2:获取项目的真实路径
                     3：域对象
    最终创建Servlet方式
                     继承HttpServlet类
                     HttpServlet->GenericServlet->Servlet

                     HttpServlet:
                     1.override service():
                     HttpServletRequest request=(HttpServletRequest)req;
                     HttpServletResponse response=(HttpServletResponse)res;
                     2.overload service()
                    String method=request.getMethod();
                    if(method.eq(”Get“){
                     doGet();
                    }else if(method.eq(“post”){
                    doPost();
                    }
                     GenericServlet:
                     1:getServletConfig()  getServletContext()
                     2:abstract service()

     */
}
