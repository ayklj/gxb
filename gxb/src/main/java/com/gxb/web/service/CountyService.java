package com.gxb.web.service;

import java.util.List;

import com.gxb.web.entity.County;

public interface CountyService {
	
	public List<County> countyByCid(long cid) throws Exception;
	
}
