package com.springbootproject.filterAndInterceptor.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter1 implements Filter {
    //    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
        System.out.println("MyFilter2 initialized");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter1 inside..");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("MyFilter1 completed");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
