package com.gxb.common.constant;

import javax.servlet.ServletRequest;

/**
 * ThreadLocal ȫ�ֳ�����
 * 
 * @date 2016��10��27�� 14:48:30
 * @author KLJ
 * 
 */
public final class LocalConstant {
	
	public static final ThreadLocal<ServletRequest> LOCAL_REQUEST = new ThreadLocal<ServletRequest>();
	
}
