package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.LoginUserMap;

/**
 * Servlet Filter implementation class LoginLimitFilter
 */
public class LoginLimitFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginLimitFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest servletRequest = (HttpServletRequest) request;
	    HttpServletResponse servletResponse = (HttpServletResponse) response;
	    HttpSession session = servletRequest.getSession();

	    //获取项目路径
	    String path = servletRequest.getContextPath(); 
	    String basePath = servletRequest.getScheme()+"://"+servletRequest.getServerName()+":"+servletRequest.getServerPort()+path;
	    String url =servletRequest.getRequestURI();
	    System.out.println(url+"----"+path);
	    basePath = "http://localhost:8080/ERPSystem/to/login.abc";
	    String sessionid = session.getId();
	    if(url.endsWith("login.abc")){
	    	chain.doFilter(request, response);
	    	return;
	    }
	    String userid = (String) session.getAttribute("userid");
	    if(userid!=null&&userid!=""){
	    	if(!LoginUserMap.isInLoginUsers(userid, sessionid)){//当前用户被挤掉了
	    		servletResponse.sendRedirect(basePath);//跳转到登录界面，并提示被挤掉的
	    		return;
	    	}
	    }else{//session过期或者没有登录
	    	servletResponse.sendRedirect(basePath);//跳转到登录界面，并提示被挤掉的
	    	return ;
	    }
	    
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
