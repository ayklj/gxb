package com.gxb.common.constant;

import javax.servlet.http.HttpServletRequest;

/**
 * ThreadLocal ȫ�ֳ�����
 * 
 * @date 2016��10��27�� 14:48:30
 * @author KLJ
 * 
 */
public final class LocalConstant {
	
	public static final ThreadLocal<HttpServletRequest> LOCAL_REQUEST = new ThreadLocal<HttpServletRequest>();
	
}
