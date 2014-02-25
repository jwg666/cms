/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */


package com.neusoft.service.impl;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.dao.PappDAO;
import com.neusoft.model.portal.Papp;
import com.neusoft.service.PappService;
import com.neusoft.util.ConverterUtil;

/**
 * 
 * @author jiawg-贾伟光
 *
 */
@Service("pappService")
@Transactional
public class PappServiceImpl implements PappService{
	@Resource
	private PappDAO pappDAO;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void save(Papp papp) {
		logger.info("save start");
		pappDAO.save(papp);
		logger.info("save end");
	}
	@Override
	public void update(Papp papp) {
		logger.info("update start");
		pappDAO.update(papp);
		logger.info("update end");		
	}
	@Override
	public void delete(Papp papp) {
		logger.info("delete start");
		pappDAO.delete(papp);
		logger.info("delete end");		
	}
	@Override
	public List<Papp> getList(Map<String, Object> params) {
		logger.info("getList start");
		List<Papp> pappList = pappDAO.findList(params);
		logger.info("getList end");
		return pappList;
	}
	@Override
	public void saveOrUpdate(Papp papp) {
		logger.info("saveOrUpdate start");
		pappDAO.saveOrUpdate(papp);
		logger.info("saveOrUpdate end");
		
	}
	@Override
	public Papp getById(Object id) {		
		return (Papp) pappDAO.getById(Papp.class,id.toString());
	}
	@Override
	public Papp get(Papp papp) {		
		return (Papp)pappDAO.get(Papp.class,ConverterUtil.toHashMap(papp));
	}

}
