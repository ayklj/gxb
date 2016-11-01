package com.gxb.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gxb.web.dao.CountyDao;
import com.gxb.web.entity.County;
import com.gxb.web.service.CountyService;

@Service
public class CountyServiceImpl implements CountyService{
	
	@Autowired
	CountyDao dao;
	
	@Transactional
	public List<County> countyByCid(long cid) throws Exception {
		return dao.countyByCid(cid);
	}
	
}
