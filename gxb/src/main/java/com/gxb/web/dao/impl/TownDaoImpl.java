package com.gxb.web.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.gxb.common.base.BaseDao;
import com.gxb.web.dao.TownDao;
import com.gxb.web.entity.Town;

@Repository
public class TownDaoImpl extends BaseDao<Town> implements TownDao {

	/**
	 * 根据县城获取乡镇级
	 * @author klj
	 * 2016年11月3日10:47:06
	 */
	public List<Town> townByCoid(long coid) throws Exception {
		CriteriaBuilder cb = getCb();
		CriteriaQuery<Town> cq = cb.createQuery(Town.class);
		Root<Town> root = cq.from(Town.class);
		return getSession().createQuery(cq.where(cb.equal(root.get("coid"), coid))).getResultList();
	}

}
