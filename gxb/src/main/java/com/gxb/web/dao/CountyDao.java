package com.gxb.web.dao;

import java.util.List;

import com.gxb.web.entity.County;

public interface CountyDao {

	public List<County> countyByCid(long cid) throws Exception;
	
}
