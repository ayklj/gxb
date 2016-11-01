package com.gxb.web.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gxb.common.base.BaseDao;
import com.gxb.web.dao.ProviceDao;
import com.gxb.web.entity.Provice;


@Repository
public class ProviceDaoImpl extends BaseDao<Provice> implements ProviceDao {
	
	public List<Provice> proviceAll() {
		return getSession().createQuery("from Provice", Provice.class).getResultList();
	}

}
