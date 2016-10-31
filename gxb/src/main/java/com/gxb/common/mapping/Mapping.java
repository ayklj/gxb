package com.gxb.common.mapping;

import com.gxb.web.entity.User;
import com.gxb.web.service.UserService;

public enum Mapping {
	
	
	USER("c435fb7e9f7611e6aea2000c2906dc0f",User.class,UserService.class);
	
	private String id;
	private Class<?> entityClass;
	private Class<?> serviceClass;
	
	private Mapping(String id,Class<?> entityClass,Class<?> serviceClass){
		this.id = id;
		this.entityClass = entityClass;
		this.serviceClass = serviceClass;
	}

	public String getId() {
		return id;
	}

	public Class<?> getServiceClass() {
		return serviceClass;
	}

	public Class<?> getEntityClass() {
		return entityClass;
	}
	
	
}
