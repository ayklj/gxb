package com.gxb.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gxb.web.dao.TownDao;
import com.gxb.web.entity.Town;
import com.gxb.web.service.TownService;

@Service
public class TownServiceImpl implements TownService {

	@Autowired
	TownDao dao;
	
	@Transactional(readOnly = true)
	public List<Town> townByCoid(long coid) throws Exception {
		return dao.townByCoid(coid);
	}

}
