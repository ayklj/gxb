package com.gxb.common.mapping;

import com.gxb.common.base.inf.BaseService;

public interface ServiceMapping {
	
	public BaseService<Object> getBaseService(Class<? extends BaseService<? extends Object>> class1);
	
}
