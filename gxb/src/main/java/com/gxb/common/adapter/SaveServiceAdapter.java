package com.gxb.common.adapter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.gxb.common.base.inf.BaseService;
import com.gxb.common.constant.LocalConstant;
import com.gxb.common.mapping.BaseServiceMapping;
import com.gxb.common.mapping.ServiceMapping;
import com.gxb.common.rep.AjaxResponse;
import com.gxb.common.tools.BeanTools;

public class SaveServiceAdapter implements ServiceAdapter {
	
	private static final Log log = LogFactory.getLog(SaveServiceAdapter.class);
	
	
	private AjaxResponse response = new AjaxResponse();
	
	private String a; // adapter;
	
	private String data; // data
	
	public void setA(String a) {
		this.a = a;
	}
	
	public void setData(String data) {
		this.data = data;
	}



	public AjaxResponse execute() {
		log.debug("execute -> a    : " + a);
		log.debug("execute -> data : " + data);
	 	ServiceMapping sm = BeanTools.getSpringBean(BaseServiceMapping.class);
	 	Class<?> cls = sm.getAdapterBean(a);
	 	BaseService<?> bs = sm.getBaseService(a);
		return response;
	}
	
}
