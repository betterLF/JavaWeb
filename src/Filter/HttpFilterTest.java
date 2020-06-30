package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "HttpFilterTest")
public class HttpFilterTest extends HttpFilter {


    @Override
    public void doFilter(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        FilterConfig filterConfig=this.getFilterConfig();
        System.out.println(filterConfig);
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
