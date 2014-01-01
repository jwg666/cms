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

import com.neusoft.dao.AppDAO;
import com.neusoft.model.portal.App;
import com.neusoft.service.AppService;

/**
 * 
 * @author jiawg-贾伟光
 *
 */
@Service("appService")
@Transactional
public class AppServiceImpl implements AppService{
	@Resource
	private AppDAO appDAO;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void save(App app) {
		logger.info("save start");
		appDAO.save(app);
		logger.info("save end");
	}
	@Override
	public void update(App app) {
		logger.info("update start");
		appDAO.update(app);
		logger.info("update end");		
	}
	@Override
	public void delete(App app) {
		logger.info("delete start");
		appDAO.delete(app);
		logger.info("delete end");		
	}
	@Override
	public List<App> getList(Map<String, Object> params) {
		logger.info("getList start");
		List<App> appList = appDAO.findList(params);
		logger.info("getList end");
		return appList;
	}
	@Override
	public void saveOrUpdate(App app) {
		logger.info("saveOrUpdate start");
		appDAO.saveOrUpdate(app);
		logger.info("saveOrUpdate end");
		
	}
	@Override
	public App getById(Long id) {		
		return (App) appDAO.getById(App.class,id);
	}

}
