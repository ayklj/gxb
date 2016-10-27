package com.gxb.common.adapter;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.gxb.common.constant.LocalConstant;
import com.gxb.common.rep.AjaxResponse;

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
		log.debug(LocalConstant.LOCAL_REQUEST.get().getAttribute("test").toString());
		return response;
	}
	
}
