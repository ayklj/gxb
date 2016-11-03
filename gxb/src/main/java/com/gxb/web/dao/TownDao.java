package com.gxb.web.dao;

import java.util.List;

import com.gxb.web.entity.Town;

public interface TownDao {
	
	public List<Town> townByCoid(long coid) throws Exception;
	
}
