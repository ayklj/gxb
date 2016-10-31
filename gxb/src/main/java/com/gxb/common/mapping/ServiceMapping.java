package com.gxb.common.mapping;

import com.gxb.common.base.inf.BaseService;

public interface ServiceMapping {
	
	public Class<?> getAdapterBean(String a);
	
	public BaseService<?> getBaseService(String a);
	
}
