package Demo;

/**
 * @author lifei
 * @date 2020/6/26 9:24
 */
public class Demo {
    /*
               1:请求和响应
                  请求:客户端向服务器
                      类型；HttpServletRequest  request
                      定义：代表了客户端向服务器发送的请求报文，该对象由服务器(web容器|Servlet容器)创建
                           发送给Service()->doGet()或doPost()
                      作用：1.获取请求参数
                            request.getParameter("username")
                            request.getParameterValues(name)
                           2.获取项目虚拟路径
                             request.getContextPath()
                           3.转发(路径跳转)
                           //1.获取转发器
                            request.getRequestDispatcher("HTML/login_success.html");
                           //2，执行转发
                             requestDispatcher.forward(request,response);
                           4.域对象(4个)
                  响应:服务器向客户端
                      类型：HttpServletResponse response
                      定义：代表了服务器向客户端发送的响应报文，该对象由服务器(web容器|Servlet容器)创建
                           发送给Service()->doGet()或doPost()
                      作用：1.服务器向客户端做出响应(文本|html)
                              //获取响应流
                                PrintWriter writer = response.getWriter();
                              //响应
                                writer.write("login success!");
                                writer.write("<h1>login success!</h1>");
                           2.重定向(路径跳转)
                              response.sendRedirect("HTML/login_success.html");
               2：转发与重定向区别
                  转发地址栏不变，重定向地址栏改变
                  转发客户端发送一次请求，重定向客户端发送两次请求
                  转发可以访问web-inf下资源，重定向不能
                            因为web-inf目录属于web应用的私有目录(客户端无法直接访问)
                  转发可以携带request对象，重定向不能
               3：Servlet练习(伪登录/伪注册)
               4：web项目应用路径问题
               在web应用中，由于使用转发跳转路径时，地址栏不变，此时使用相对路径(../)存在404现象
               因此使用绝对路径解决web应用中的路径问题
               绝对路径，一”/“开头的是绝对路径
               “/”代表：由服务器解析，代表当前项目路径  http://localhost:8081/TomcatDemo_war_exploded
                       情况1:web.xml中的url
                       情况2：转发  直接在前面加/
                       由浏览器解析，代表当前服务器路径 http://localhost:8081
                       情况1:html中路径  eg:src script|img href:link|a action:form
                       情况2:重定向 在前面+request.getContextPath()+"..."
               5：web应用乱码问题
                  乱码:编码与解码不一致时，出现乱码现象
                  编码：将字符转化成二进制的过程称之为编码
                  解码：将二进制转化为字符的过程称之为解码
                  *请求乱码:客户端编码与服务器解码不一致
                  *响应乱码:服务器编码与客户端解码不一致
                  默认客户端与服务器端的编码与解码情况
                      *服务器的编码和解码默认一致：ISO-8859-1(不支持中文)
                      *客户端(浏览器)编码默认为:<meta charset="UTF-8">
                                   解码默认为:GBK
                   解决web中乱码问题
                      *请求乱码
                            post:request.setCharacterEncoding("UTF-8");
                            get:在server.xml中修改  <Connector port="8081"
                                                    URIEncoding="UTF-8
			                                        />
                      *响应乱码
                              *直接将服务器编码设置为GBK
                               //response.setCharacterEncoding("GBK");
                              *将服务器编码与浏览器编码统一设置为UTF-8
                               response.setContentType("text/html;charset=UTF-8");
               6：项目第二阶段
     */
}
