package com.gxb.common.mapping;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;

@Component
@Scope("singleton")
public class BaseServiceMapping {
	private static final Log log = LogFactory.getLog(BaseServiceMapping.class);
	
	public BaseServiceMapping(){
		log.debug("start");
	}
}
