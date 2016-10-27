package com.gxb.common.constant;

import javax.servlet.ServletRequest;

/**
 * ThreadLocal 全局常量类
 * 
 * @date 2016年10月27日 14:48:30
 * @author KLJ
 * 
 */
public final class LocalConstant {
	
	public static final ThreadLocal<ServletRequest> LOCAL_REQUEST = new ThreadLocal<ServletRequest>();
	
}
