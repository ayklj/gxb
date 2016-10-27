package com.gxb.common.mapping;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.gxb.common.base.inf.BaseService;

@Component
@Scope("singleton")
public class BaseServiceMapping implements ServiceMapping {
	private static final Log log = LogFactory.getLog(BaseServiceMapping.class);
	
	public BaseServiceMapping(){
		log.debug("start");
	}

	@SuppressWarnings("unchecked")
	public BaseService<Object> getBaseService(Class<? extends BaseService<? extends Object>> class1) {
		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
		return  (BaseService<Object>) wac.getBean(class1); 
	}

}
