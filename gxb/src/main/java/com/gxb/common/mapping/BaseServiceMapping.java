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
	
	private final Map<String,Object> map = new HashMap<String, Object>();
	
	public BaseServiceMapping(){
		log.debug("BaseServiceMapping -> start : 初始化开始");
		
		log.debug("BaseServiceMapping -> end   : 初始化完成");
	}
	
	public BaseService<?> getBaseService(String a) {
		
		return BeanTools.getSpringBean(UserServiceImpl.class);
	}

	public Class<?> getAdapterBean(String a) {
		
		return null;
	}

}
