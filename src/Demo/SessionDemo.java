package Demo;

import java.util.UUID;

/**
 * @author lifei
 * @date 2020/6/28 10:22
 */
public class SessionDemo {
    /*
    Session
          *简介
              *类型：HttpSession
          *工作原理
              *请求
              *服务器创建Session，同时创建一个特殊的Cookie，该Cookie的key为JSESSIONID
              value为session的id
              *服务器将该Cookie对象发送(响应)给客户端
              *以后客户端再请求时，会携带该Cookie对象
              服务器会根据Cookie的value找到相应的Session,从而区分不同的用户
          *Session获取
                  *html(Servlet):request.getSession()
                  *jsp:直接获取(session是jsp的隐含对象)
          *Session有效性
                  *默认有效性:当前会话(因为特殊的Cookie是会话级别)
                  *持久化Session:
                       *持久化特殊Cookie Cookie[] cookies = request.getCookies();
                                        for (Cookie c:cookies){
                                        if("JSESSIONID".equals(c.getName())){
                                        c.setMaxAge(60);
                                        response.addCookie(c);
                                        break;
                                         }
                                        }
                         *Session存活时间
                                *默认为30min
                                *设置session的非活动时间(在tomcat的web.xml中设置)
                                       <session-config>
                                            <session-timeout>30</session-timeout>//分钟
                                       </session-config>
                                 *设置session的非活动时间(在doGet()方法中)
                                     HttpSession session=request.getSession();
                                     session.setMaxInactiveInterval(ss);//秒数
                                     *ss>0:ss秒后失效
                                     *ss<=0:永不失效(Tomcat>=7有效)
                                 *session立即失效:
                                         HttpSession session = request.getSession();
                                         //设置session失效
                                         session.invalidate();
          *Session钝化与活化：
                  *钝化:将session对象及session对象中的数据一同从内存中序列化到硬盘的过程称之为钝化(对象要实现Serializable接口)
                       *时机:服务器关闭时触发
                  *活化:将session对象及session对象中的数据，一同从硬盘反序列化到内存的过程称之为活化。
                       *时机:服务器启时触发
          *Session应用
               *表单重复提交问题
                   *转发，F5  解决:使用重定向
                   *提交后，网速慢，连续点击提交按钮  点击后，用disable
                   *提交后，点击回退按钮，继续提交
                        *提交-Servlet处理->响应
                        *思路:在Servlet中干预提交，第一次提交，以后不提交
                             1.使用UUID，作为Token，将Token存放到session域中和隐藏域中
                               *UUID是一个全球唯一的32位地16进制的随机数
                             2.提交，判断变量是否为初始值
                               true:提交，移除session域中的Token(UUID)
                               false:不提交
     */
    public static void main(String[] args) {
        String randomUUID=UUID.randomUUID().toString().replace("-","");
        System.out.println(randomUUID);
    }
}
