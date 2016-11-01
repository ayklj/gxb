package com.gxb.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gxb.web.dao.CityDao;
import com.gxb.web.entity.City;
import com.gxb.web.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	CityDao dao;
	
	
	@Transactional(readOnly = true)
	public List<City> citysByPid(int pid) {
		return dao.citysByPid(pid);
	}

}
