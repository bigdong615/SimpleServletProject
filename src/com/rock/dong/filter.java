package com.rock.dong;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Set the HTTP content-type to text/plain for timezone database files.
 * 
 * @author kamleshk
 *
 */
public class filter
        implements Filter {

    public void init(FilterConfig aConfig) throws ServletException {
        //do nothing
    }

    /**
     * Set the HTTP content-type to text/plain for timezone database files.
     * TODO: Right now I do not see a need to add logic of reading the file and identifying the content-type
     * Hence keeping it simple, if we have more than one type of files in timezone database folder then we will have 
     * to open file to identify its content-type
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        response.setContentType("text/plain; charset=UTF-8");
        chain.doFilter(request, response);
    }

    public void destroy() {
        //do nothing
    }
}