package com.gxb.web.service;

import java.util.List;

import com.gxb.web.entity.Village;

/**
 * �弶
 * @author klj
 * 2016��11��3�� 10:48:51
 */
public interface VillageService {
	
	public List<Village> villageByTid(long tid) throws Exception;
	
}
