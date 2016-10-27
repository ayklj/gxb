package com.gxb.common.adapter;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.gxb.common.rep.AjaxResponse;

public class BaseServiceAdapter implements ServiceAdapter {
	private static final Log log = LogFactory.getLog(BaseServiceAdapter.class);
	
	private String a; //adapter
	
	private String m; //method
	
	private AjaxResponse response = new AjaxResponse();
	
	/**
	 * 实现ServiceAdapter.
	 * @author KLJ
	 * 2016年10月26日 10:13:13 创建
	 */
	public AjaxResponse execute(){
		log.info("execute() -> adapter : " + a);
		log.info("execute() -> m : " + m);
		log.info("execute() -> start : " + a);
		
		return response;
	}

	public void setA(String a) {
		this.a = a;
	}

	public void setM(String m) {
		this.m = m;
	}
	
}
