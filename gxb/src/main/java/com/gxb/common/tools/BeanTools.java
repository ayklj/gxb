package com.gxb.common.tools;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.gxb.common.constant.LocalConstant;

public class BeanTools {
	public static <T> T getSpringBean(Class<T> t){
		HttpServletRequest request = (HttpServletRequest)LocalConstant.LOCAL_REQUEST.get();
		WebApplicationContext wc = RequestContextUtils.findWebApplicationContext(request);
		return wc.getBean(t);
	}
}
