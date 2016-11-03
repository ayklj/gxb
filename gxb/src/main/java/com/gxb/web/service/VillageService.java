package com.gxb.web.service;

import java.util.List;

import com.gxb.web.entity.Village;

/**
 * 村级
 * @author klj
 * 2016年11月3日 10:48:51
 */
public interface VillageService {
	
	public List<Village> villageByTid(long tid) throws Exception;
	
}
