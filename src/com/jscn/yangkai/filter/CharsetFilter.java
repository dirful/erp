package com.jscn.yangkai.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class CharsetFilter implements Filter {
	
	String charset=null;
	
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(charset);
		chain.doFilter(request, response);		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		
		charset=config.getInitParameter("charset");
	}

}