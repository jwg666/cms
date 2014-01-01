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

import com.neusoft.dao.AppStarDAO;
import com.neusoft.model.portal.AppStar;
import com.neusoft.service.AppStarService;

/**
 * 
 * @author jiawg-贾伟光
 *
 */
@Service("appStarService")
@Transactional
public class AppStarServiceImpl implements AppStarService{
	@Resource
	private AppStarDAO appStarDAO;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void save(AppStar appStar) {
		logger.info("save start");
		appStarDAO.save(appStar);
		logger.info("save end");
	}
	@Override
	public void update(AppStar appStar) {
		logger.info("update start");
		appStarDAO.update(appStar);
		logger.info("update end");		
	}
	@Override
	public void delete(AppStar appStar) {
		logger.info("delete start");
		appStarDAO.delete(appStar);
		logger.info("delete end");		
	}
	@Override
	public List<AppStar> getList(Map<String, Object> params) {
		logger.info("getList start");
		List<AppStar> appStarList = appStarDAO.findList(params);
		logger.info("getList end");
		return appStarList;
	}
	@Override
	public void saveOrUpdate(AppStar appStar) {
		logger.info("saveOrUpdate start");
		appStarDAO.saveOrUpdate(appStar);
		logger.info("saveOrUpdate end");
		
	}
	@Override
	public AppStar getById(Long id) {		
		return (AppStar) appStarDAO.getById(AppStar.class,id);
	}

}
