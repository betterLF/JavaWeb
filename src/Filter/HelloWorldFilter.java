package Filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lifei
 * @date 2020/6/30 8:46
 */
public class HelloWorldFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("HelloWorldFilter()放行前");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("HelloWorldFilter()放行后");
    }

    @Override
    public void destroy() {

    }
}
