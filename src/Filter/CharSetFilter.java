package Filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lifei
 * @date 2020/6/30 10:05
 */
public class CharSetFilter extends HttpFilter {
    @Override
    public void doFilter(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String code = this.getFilterConfig().getInitParameter("code");
        servletRequest.setCharacterEncoding(code);
        servletResponse.setContentType("text/html;charset=UTF-8");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
