package com.gxb.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.gxb.common.constant.LocalConstant;

public class BaseInterceptor implements HandlerInterceptor {
	private static final Log log = LogFactory.getLog(BaseInterceptor.class);
	
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("test", "test");
		LocalConstant.LOCAL_REQUEST.set(request);
		
		log.debug("preHandle");
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.debug("postHandle");
	}	

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		log.debug("afterCompletion");
		LocalConstant.LOCAL_REQUEST.remove();
	}

}
