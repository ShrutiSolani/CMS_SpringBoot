package com.example.demo.filter;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

public class MyNewFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("New filter is called");
        filterChain.doFilter(servletRequest, servletResponse);
    }

}
