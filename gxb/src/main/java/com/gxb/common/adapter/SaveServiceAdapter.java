package com.gxb.common.adapter;



import java.lang.reflect.Field;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.gxb.common.base.inf.BaseService;
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
	 	try {
			buildBean(sm.getAdapterBeanClass(a));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	 	
//	 	BaseService<?> bs = sm.getBaseService(a);
		return response;
	}
	
	private Object buildBean(Class<?> cls) throws InstantiationException, IllegalAccessException{
		Object obj = cls.newInstance();
		Field[] fields = cls.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			//获取属性Type
			Class<?> type = fields[i].getType();
			
			//开启私有属性访问
			fields[i].setAccessible(true);
			
			//判断私有属性类型
			if(type == Integer.class){
				fields[i].set(obj, i);
			}else if(type == String.class){
				fields[i].set(obj, "Str"+i);
			}
			
			//关闭私有属性访问
			fields[i].setAccessible(false);
		}
		log.debug(obj.toString());
//		cls.newInstance();
		return null;
	}
	
}
