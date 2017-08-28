package main.java.controller.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class SearchResultsFilter
 */
@WebFilter("/SearchResultsFilter")
public class SearchResultsFilter implements Filter {

    /**
     * Default constructor.
     */
    public SearchResultsFilter() {
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

	if (request.getParameter("type") == null) {
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
