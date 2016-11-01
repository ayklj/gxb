package com.gxb.web.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.gxb.common.base.BaseDao;
import com.gxb.web.dao.CityDao;
import com.gxb.web.entity.City;


@Repository
public class CityDaoImpl extends BaseDao<City> implements CityDao{
	
	
	public List<City> citysByPid(int pid) {
		CriteriaBuilder cb = getSession().getCriteriaBuilder();
		CriteriaQuery<City> cq = cb.createQuery(City.class);
		Root<City> root = cq.from(City.class);
		return getSession().createQuery(cq.where(cb.equal(root.get("pid"),pid))).getResultList();
	}
	
}
