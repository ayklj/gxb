package com.gxb.common.constant;

import javax.servlet.http.HttpServletRequest;

/**
 * ThreadLocal 全局常量类
 * 
 * @date 2016年10月27日 14:48:30
 * @author KLJ
 * 
 */
public final class LocalConstant {
	
	public static final ThreadLocal<HttpServletRequest> LOCAL_REQUEST = new ThreadLocal<HttpServletRequest>();
	
}
