package com.gxb.common.base;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;

public abstract class BaseService<T>  {
	
	protected abstract com.gxb.common.base.inf.BaseDao<T> getDao();
	
	
	@Transactional(readOnly = false)
	public Serializable save(T t) throws Exception {
		return getDao().save(t);
	}
	

	@Transactional(readOnly = false)
	public Serializable saveNullToEmpty(T t) throws Exception {
		return getDao().saveNullToEmpty(t);
	}
	
}
