package com.gxb.common.adapter;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.boot.cfgxml.internal.ConfigLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.gxb.common.base.inf.BaseService;
import com.gxb.common.constant.LocalConstant;
import com.gxb.common.mapping.BaseServiceMapping;
import com.gxb.common.mapping.ServiceMapping;
import com.gxb.common.rep.AjaxResponse;
import com.gxb.web.service.UserService;

public class SaveServiceAdapter implements ServiceAdapter {
	
	private static final Log log = LogFactory.getLog(SaveServiceAdapter.class);
	
	
	private AjaxResponse response = new AjaxResponse();
	
	private String a; // adapter;
	
	
	
	public void setA(String a) {
		this.a = a;
	}

	public AjaxResponse execute() {
		log.debug("execute() -> adapter : " + a);
		log.debug("execute() -> start");
		ServletRequest request = LocalConstant.LOCAL_REQUEST.get();
		ServletContext sc = LocalConstant.LOCAL_REQUEST.get().getServletContext();
		
		RequestContextUtils.getWebApplicationContext((HttpServletRequest)request);
//				.getWebApplicationContext(LocalConstant.LOCAL_REQUEST.get(),sc).getBean(BaseServiceMapping.class); 
		BaseService<Object> b = sm.getBaseService(UserService.class);
		try {
			b.save(null);
			log.debug(b.toString());
		} catch (Exception e) {
			log.debug("",e);
		}
		
		
		return response;
	}
	
}
