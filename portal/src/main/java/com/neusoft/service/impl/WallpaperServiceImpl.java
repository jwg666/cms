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

import com.neusoft.dao.WallpaperDAO;
import com.neusoft.model.portal.Wallpaper;
import com.neusoft.service.WallpaperService;

/**
 * 
 * @author jiawg-贾伟光
 *
 */
@Service("wallpaperService")
@Transactional
public class WallpaperServiceImpl implements WallpaperService{
	@Resource
	private WallpaperDAO wallpaperDAO;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void save(Wallpaper wallpaper) {
		logger.info("save start");
		wallpaperDAO.save(wallpaper);
		logger.info("save end");
	}
	@Override
	public void update(Wallpaper wallpaper) {
		logger.info("update start");
		wallpaperDAO.update(wallpaper);
		logger.info("update end");		
	}
	@Override
	public void delete(Wallpaper wallpaper) {
		logger.info("delete start");
		wallpaperDAO.delete(wallpaper);
		logger.info("delete end");		
	}
	@Override
	public List<Wallpaper> getList(Map<String, Object> params) {
		logger.info("getList start");
		List<Wallpaper> wallpaperList = wallpaperDAO.findList(params);
		logger.info("getList end");
		return wallpaperList;
	}
	@Override
	public void saveOrUpdate(Wallpaper wallpaper) {
		logger.info("saveOrUpdate start");
		wallpaperDAO.saveOrUpdate(wallpaper);
		logger.info("saveOrUpdate end");
		
	}
	@Override
	public Wallpaper getById(Object id) {		
		return (Wallpaper) wallpaperDAO.getById(Wallpaper.class,id.toString());
	}

}
