package com.gxb.enums;

import com.gxb.common.base.BaseService;

public enum ServiceEnum {
	
	USER("",);
	
	private String uid;
	private BaseService<? extends Object> service;
	
	private ServiceEnum(String uid,BaseService<? extends Object> service){
		this.uid = uid;
		this.service = service;
	}
	
}
