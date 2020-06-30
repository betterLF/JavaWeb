package Demo;

/**
 * @author lifei
 * @date 2020/6/30 8:34
 */
public class FilterDemo {
    /*
    *Filter:过滤器
    * 简介:程序中的过滤器，可以过滤客户端与服务器之间的请求和响应
          *如:过滤字符集
          * Filter是web三大核心组件之一
                  *Servlet:处理用户请求
                  * Filter:过滤用户请求&响应
                  * Listener:监听器
           /web三大核心组件的共同点
               1.实现某个接口
               2.注册
         <filter>
               <filter-name>HelloWorldFilter</filter-name>
                <filter-class>Filter.HelloWorldFilter</filter-class>
          </filter>
        <filter-mapping>
            <filter-name>HelloWorldFilter</filter-name>
            <url-pattern>/userServlet</url-pattern>//url为要过滤的地址
        </filter-mapping>
    * HelloWorld
    * Filter的生命周期
            *构造器
                 *执行次数：执行一次
                 *执行时机：启动服务器时执行
            * init()
                 *执行次数：执行一次
                 *执行时机：启动服务器时执行
            * doFilter()
                 *执行次数：执行多次
                 *执行时机：每次过滤请求时执行
            * destroy()
                  *执行次数：执行一次
                  *执行时机：关闭服务器时执行
    * Filter的工作原理
                 *请求:服务器->filter->web资源  响应:web资源->filter->服务器
                 具体过程
                 * 请求
                 * 执行过滤器中的doFilter()，执行放行前的代码
                 * 放行请求，执行处理请求代码(Servlet)
                 * 执行过滤器中的doFilter()，执行放行后的代码
                 * 响应
    * 多个Filter的执行流程
           *请求
           * Filter1放行前
           * Filter2放行前
           * 处理请求，做出响应
           * Filter2放行后
           * Filter1放行后
       注意:Filter的先后顺序是在web.xml中url-pattern的先后顺序决定
    * Url的配置规则
        1.精准配置
             * <url-pattern>/userServlet</url-pattern>
             * <servlet-name>userServlet</servlet-name>(将url换成name)
        2.模糊配置,包含“*”的配置，称之为模糊配置
             *前置模糊  *.jsp 过滤当前项目下所有的jsp
             *后置模糊  "/Cookie/*" 过滤Cookie下的所有项目
    * HttpFilter
       *HttpServlet->GenericServlet->Servlet
       *HttpFilter
           *getXXX()
           *abstract doFilter()
           *overload doFilter()
     */



}
