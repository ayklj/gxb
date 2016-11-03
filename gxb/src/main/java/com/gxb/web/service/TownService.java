package com.gxb.web.service;

import java.util.List;

import com.gxb.web.entity.Town;

public interface TownService {
	
	public List<Town> townByCoid(long coid) throws Exception;
	
}
