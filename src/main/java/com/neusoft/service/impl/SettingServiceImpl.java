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

import com.neusoft.dao.SettingDAO;
import com.neusoft.model.portal.Setting;
import com.neusoft.service.SettingService;

/**
 * 
 * @author jiawg-贾伟光
 *
 */
@Service("settingService")
@Transactional
public class SettingServiceImpl implements SettingService{
	@Resource
	private SettingDAO settingDAO;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void save(Setting setting) {
		logger.info("save start");
		settingDAO.save(setting);
		logger.info("save end");
	}
	@Override
	public void update(Setting setting) {
		logger.info("update start");
		settingDAO.update(setting);
		logger.info("update end");		
	}
	@Override
	public void delete(Setting setting) {
		logger.info("delete start");
		settingDAO.delete(setting);
		logger.info("delete end");		
	}
	@Override
	public List<Setting> getList(Map<String, Object> params) {
		logger.info("getList start");
		List<Setting> settingList = settingDAO.findList(params);
		logger.info("getList end");
		return settingList;
	}
	@Override
	public void saveOrUpdate(Setting setting) {
		logger.info("saveOrUpdate start");
		settingDAO.saveOrUpdate(setting);
		logger.info("saveOrUpdate end");
		
	}
	@Override
	public Setting getById(Long id) {		
		return (Setting) settingDAO.getById(Setting.class,id);
	}

}
