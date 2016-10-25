package com.gxb.common.base;

import java.io.Serializable;
import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

public abstract class BaseDao<T> {
	
	@Autowired
	private HibernateTemplate ht;
	
	public HibernateTemplate getHt(){
		return ht;
	}
	
	public Serializable save(T t) throws Exception{
		return getHt().save(t);
	}
	
	public Serializable saveNullToEmpty(T t) throws Exception{
		Class<? extends Object> tclass = t.getClass();
		Field[] fields = tclass.getDeclaredFields();
		for (Field field : fields) {
			if(field.get(t) == null){
				String typeName = field.getType().getName();
				if(String.class.getName().equals(typeName)){
					field.set(t, "");
				}
			}
		}
		return getHt().save(t);
	}
	
}
