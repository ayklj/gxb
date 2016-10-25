package com.gxb.common.base.inf;

import java.io.Serializable;

public interface BaseDao<T> {
	
	public Serializable save(T t) throws Exception;
	
	public Serializable saveNullToEmpty(T t) throws Exception;
}
