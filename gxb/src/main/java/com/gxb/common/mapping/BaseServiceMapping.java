package com.gxb.common.mapping;


import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.gxb.common.base.inf.BaseService;
import com.gxb.common.tools.BeanTools;
import com.gxb.web.service.impl.UserServiceImpl;

@Component
@Scope("singleton")
public class BaseServiceMapping implements ServiceMapping {
	
	private static final Log log = LogFactory.getLog(BaseServiceMapping.class);
	
	private final Map<String,Mapping> map = new HashMap<String, Mapping>();
	
	public BaseServiceMapping(){
		log.debug("BaseServiceMapping -> start : 初始化开始");
		Mapping[] mapping = Mapping.values();
		for (int i = 0; i < mapping.length; i++) {
			map.put(mapping[i].getId(),mapping[i]);
		}
		log.debug("BaseServiceMapping -> end   : 初始化完成");
	}
	
	public BaseService<?> getBaseService(String a) {
		return BeanTools.getSpringBean(UserServiceImpl.class);
	}

	public Class<?> getAdapterBeanClass(String a) {
		Mapping mapping = map.get(a);
		return mapping.getEntityClass();
	}

}
