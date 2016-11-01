package com.gxb.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gxb.web.dao.ProviceDao;
import com.gxb.web.entity.Provice;
import com.gxb.web.service.ProviceService;

@Service
public class ProviceServiceImpl implements ProviceService {

	@Autowired
	ProviceDao dao;
	
	@Transactional(readOnly = true)
	public List<Provice> proviceAll() {
		return dao.proviceAll();
	}
	
}
