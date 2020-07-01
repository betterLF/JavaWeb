package Demo;

/**
 * @author lifei
 * @date 2020/7/1 8:50
 */
public class AjaxDemo {
    /*
    *Ajax
        *简介
           *Asynchronous JavaScript And Xml，直译为异步的JS和XML
           * Ajax也可以简单的理解为通过JS向服务器发送请求
           * 实际意义:不发生页面跳转，异步载入内容并改写页面内容的技术
        *异步请求&同步请求
           *同步解决问题:
                *1.请求：发送二次请求时，只能等上次请求响应后，才能执行
                *2.效率：就算我们需要刷新局部，也必须刷新整个页面
            *异步解决问题:
                *1.请求:Ajax请求不会影响其他请求
                *2.效率:局部刷新
        *使用
            js->ajax
            jQuery->ajax(常用)
                *语法
                  $.ajax({
                    type: "POST","请求方式：get|post",
                    url: "../AjaxServlet","请求路径"
                    data: "name=John&location=Boston",“参数”
                    dataType:预期服务器返回的数据类型，如xml|json|text
                    success:function(回调函数，请求成功时回调)
                      // PrintWriter writer = response.getWriter();
                      //  writer.write("success!!!");回调函数的参数时success!!!
                    error:function(回调函数:请求失败时回调)
                    (还有另外三个回调函数)
                });
                * Ajax简写
                     *$.post/get(url,[data],[callback],[dataType])
                     *  *$.getJson(url,[data],[callback])
     */
}
