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

import com.neusoft.dao.PwallpaperDAO;
import com.neusoft.model.portal.Pwallpaper;
import com.neusoft.service.PwallpaperService;

/**
 * 
 * @author jiawg-贾伟光
 *
 */
@Service("pwallpaperService")
@Transactional
public class PwallpaperServiceImpl implements PwallpaperService{
	@Resource
	private PwallpaperDAO pwallpaperDAO;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void save(Pwallpaper pwallpaper) {
		logger.info("save start");
		pwallpaperDAO.save(pwallpaper);
		logger.info("save end");
	}
	@Override
	public void update(Pwallpaper pwallpaper) {
		logger.info("update start");
		pwallpaperDAO.update(pwallpaper);
		logger.info("update end");		
	}
	@Override
	public void delete(Pwallpaper pwallpaper) {
		logger.info("delete start");
		pwallpaperDAO.delete(pwallpaper);
		logger.info("delete end");		
	}
	@Override
	public List<Pwallpaper> getList(Map<String, Object> params) {
		logger.info("getList start");
		List<Pwallpaper> pwallpaperList = pwallpaperDAO.findList(params);
		logger.info("getList end");
		return pwallpaperList;
	}
	@Override
	public void saveOrUpdate(Pwallpaper pwallpaper) {
		logger.info("saveOrUpdate start");
		pwallpaperDAO.saveOrUpdate(pwallpaper);
		logger.info("saveOrUpdate end");
		
	}
	@Override
	public Pwallpaper getById(Long id) {		
		return (Pwallpaper) pwallpaperDAO.getById(Pwallpaper.class,id);
	}

}
