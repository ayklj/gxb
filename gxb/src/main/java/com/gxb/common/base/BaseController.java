package com.gxb.common.base;

import javax.servlet.http.HttpServletRequest;

import com.gxb.common.constant.LocalConstant;

/**
 * 
 * 基本控制层
 * @date 2016年10月27日 10:05:41
 * @author KLJ
 *
 */
public final class BaseController {
	
	protected HttpServletRequest request() {
		return LocalConstant.LOCAL_REQUEST.get();
	}
	
}
