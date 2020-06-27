package Demo;

/**
 * @author lifei
 * @date 2020/6/27 10:06
 */
public class JSPDemo {
    /*
    JSP:java服务端页面
    Servlet=java+html
    Jsp=html+java
    JSP只能运行服务器(Web容器)中
    其本质是Servlet
                *JSP运行原理
                    *第一次访问JSP文件时会经过以下步骤
                         *服务器将.jsp文件翻译成.java文件
                         *将.java文件编译为.class文件
                         *运行
                    *文件未改变时，以后再访问，不会翻译和编译
                *JSP基本语法
                    *指令
                        *语法：<%@ %>
                    *脚本片段
                        *<%%>
                        *作用:书写java代码。(写在_jspService()中)
                           <%
                           for(int i=0;i<=100;i+=2){
                           %>
                    *表达式
                        *语法:<%= %>
                        *作用：输出数据到页面
                    *模板元素(html)
                    *声明
                        *语法:<%!%>
                        *作用：书写java代码。(类中)
                        <%!int i=1;%>
                     *注释：
                         *html<!---->
                         java://
                         jsp:<%-- --%>
                *JSP指令
                     *语法：<%@ 指令名 属性名1=属性值1 属性名2=属性值2%>
                     *常用指令
                         *page指令
                                  language:支持语言,只有java
                                  contentType:设置服务器属性
                                  import:导包
                                  errorPage:错误页面(当前页面出现错误显示的界面)
                                  isErrorPage:设置当前页面是否为错误页面
                          *include指令
                              作用:将目标页面包含到当前页面中
                              特点：静态包含，被包含的文件不会被翻译和编译
                *JSP动作标签
                     *语法:<jsp:标签名 属性名1=属性值1 属性名2=属性值2></jsp:标签名>
                     *常用的动作标签
                         *转发:
                              *带参数
                                 *<jsp:forward page="hello.jsp">
                                   <jsp:param value="18",name="age">
                                   </jsp:forward>
                                 此时hello.jsp界面可以通过<%=request.getParameter("age")%>得到18
                               *不带参数
                                   * *<jsp:forward page="hello.jsp"></jsp:forward>
                                      注意开始标签和结束标签中间不能有任何内容包括空格
                         *动态包含:
                                 *语法：<jsp:include page="hello.jsp"></jsp:include>
                                 *特点：被包含文件会先被翻页和编译
                *JSP九大隐藏对象
                      定义：可以在jsp中直接使用的对象(不需要我们new的对象,服务器实例化的九大隐含对象，并存放在Service()方法中)
                      *对象详情
                      *application
                                  *类型:ServletContent
                                  *作用:域对象
                                  *Servlet中的获取方式:this.getServletContext()
                      *session
                                  *类型:HttpSession
                                  *作用:域对象
                                  *Servlet中的获取方式:request.getSession()
                      *request
                                  *类型:HttpServletRequest
                                  *作用:域对象
                                  *Servlet中的获取方式:直接使用
                      *pageContext
                                  *类型:PageContext
                                  *作用:域对象 jspBoss(可以通过它获取其他8个隐含对象)
                                  *Servlet中的获取方式:无
                      *response
                                  *类型:HttpServletResponse
                                  *作用:域Servlet中的response对象一致
                                  *Servlet中的获取方式:直接使用
                      *page
                                  *类型:Object
                                  *作用：page=this,当前类的对象。
                                  *Servlet中的获取方式:直接使用
                      *out
                                  *类型:JspWriter
                                  *作用:与Servlet中的PrintWriter的作用类似(都继承了java.io.Writer)
                                  *Servlet中的获取方式:无
                      *config
                                  *类型:ServletConfig
                                  *作用:与Servlet中的ServletConfig的作用一致
                                  *Servlet中的获取方式:this.getServletConfig()
                      *exception
                                  *类型:Throwable
                                  *作用:接收处理异常信息
                                  *Servlet中的获取方式:无
                *JSP四大域对象
                     *域：区域:在web应用的不同资源中相互传递数据
                     程序区域
                     *域对象共有方法：
                     *getAttribute()
                     *setAttribute()
                     *removeAttribute()
                     *详情(按照区域大->小)objectDemo.jsp
                         *application
                                     *范围:当前项目中有效
                         *session
                                     *当前会话(浏览器未关闭,未换)中
                         *request
                                     *当前请求中有效
                         *pageContext
                                     *只在当前页面中生效
     */
}
