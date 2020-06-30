package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "userServletFilter")
public class userServletFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("userServletFilter()放行前");
        chain.doFilter(req, resp);
        System.out.println("userServletFilter()放行后");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
