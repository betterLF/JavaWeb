package Demo;

/**
 * @author lifei
 * @date 2020/6/28 8:02
 */
public class CookieDemo {
    /*
    Cookie
        *简介:实际上就是服务器保存在浏览器上的一段信息，主要用于区分不同的用户
        *运行原理：
              *请求
              *服务器创建一个Cookie对象，该Cookie对象携带用户信息，服务器发送(响应)给客户端
              *以后客户端再发送请求时，会携带Cookie对象
              *服务器会根据该Cookie对象(及信息)，区分不同用户
        *Cookie创建&获取&修改
               *创建
                           //创建Cookie对象并携带信息
                           Cookie cookieName=new Cookie("stuName","aa");
                           //响应给客户端
                           response.addCookie(cookieName);
               *获取
                           Cookie[] cookies = request.getCookies();
                           cookie.getName()|cookie.getValue()
               *修改
                   *覆盖式修改
                    Cookie cookieName=new Cookie("stuName","bb");
                    response.addCookie(cookieName);
                   *直接式修改
                    Cookie[]cookies=request.getCookies();
                    for (Cookie cookie:cookies){
                    if("stuName".equals(cookie.getName())){
                      cookie.setValue("cc");
                      response.addCookie(cookie);
                      break;
                   }
                  }
        *Cookie的键值问题
              *name不可以为中文，value可以为中文，但需要指定字符集问题
        *Cookie有效性
               *默认为会话级别(关闭浏览器和换浏览器后失效)
               *持久化：
                    *setMaxAge(ss:秒)
                      ss>0:ss秒后失效
                      ss=0:立即失效
                      ss<0:默认会话级别
               *持久化Cookie，该Cookie不是会话级别
        *Cookie有效路径
               *默认有效路径:当前项目路径
               *设置有效路径：一般设置有效路径，都是基于当前项目下的路径进行设置
                如：cookie.setPath(request.getContextPath()+"/a");
        *Cookie应用
               *记住密码 UserCookieServlet login2.html
        *Cookie缺陷
               *Cookie的value为String类型，不灵活
               *Cookie存放在浏览器中，不安全。
               *Cookie过多会浪费流量。

     */
}
