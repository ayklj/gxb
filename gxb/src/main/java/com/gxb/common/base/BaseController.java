package com.gxb.common.base;

import javax.servlet.http.HttpServletRequest;

import com.gxb.common.constant.LocalConstant;

/**
 * 
 * �������Ʋ�
 * @date 2016��10��27�� 10:05:41
 * @author KLJ
 *
 */
public final class BaseController {
	
	protected HttpServletRequest request() {
		return LocalConstant.LOCAL_REQUEST.get();
	}
	
}
