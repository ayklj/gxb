package com.gxb.web.dao;

import java.util.List;

import com.gxb.web.entity.Village;

public interface VillageDao {
	
	public List<Village> villageByTid(long tid) throws Exception;
	
}
