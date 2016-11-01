package com.gxb.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.gxb.common.constant.LocalConstant;

/**
 * ��������������local��ʼ��ʹ��
 * 2016��11��1�� 21:51:30
 * @author KLJ
 *
 */
public class BaseInterceptor implements HandlerInterceptor {
	private static final Log log = LogFactory.getLog(BaseInterceptor.class);
	
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.debug("preHandle");
		//װ��local
		localSet(request, response, handler);
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.debug("postHandle");
	}	

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		log.debug("afterCompletion");
		//ж��local
		localRemove();
	}
	
	private void localSet(HttpServletRequest request,HttpServletResponse response, Object handler){
		log.debug("localSet");
		LocalConstant.LOCAL_REQUEST.set(request);
		LocalConstant.LOCAL_SESSION_ID.set(request.getSession().getId());
	}
	
	private void localRemove(){
		log.debug("localRemove");
		LocalConstant.LOCAL_REQUEST.remove();
		LocalConstant.LOCAL_SESSION_ID.remove();
	}
}
