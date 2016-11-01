package com.gxb.web.dao;

import java.util.List;

import com.gxb.web.entity.City;

public interface CityDao {
	
	public List<City> citysByPid(int pid);
	
}
