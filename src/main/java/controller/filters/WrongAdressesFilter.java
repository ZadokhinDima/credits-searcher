package main.java.controller.filters;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class WrongAdressesFilter
 */
@WebFilter("/WrongAdressesFilter")
public class WrongAdressesFilter implements Filter {

    /**
     * Default constructor.
     */
    public WrongAdressesFilter() {
	// TODO Auto-generated constructor stub
    }

    /**
     * @see Filter#destroy()
     */
    @Override
    public void destroy() {
	// TODO Auto-generated method stub
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	    throws IOException, ServletException {

	List<String> addresses = Arrays
		.asList(new String[] { "/startPage.jsp", "/searchResults.jsp", "/errorPage.jsp" });
	if (!addresses.contains(((HttpServletRequest) request).getServletPath())) {
	    request.getRequestDispatcher("errorPage.html").forward(request, response);
	}
	chain.doFilter(request, response);
    }

    /**
     * @see Filter#init(FilterConfig)
     */
    @Override
    public void init(FilterConfig fConfig) throws ServletException {
	// TODO Auto-generated method stub
    }

}
