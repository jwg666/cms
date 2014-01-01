/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.model.portal.Pwallpaper;

public interface PwallpaperService{

	/**
	 * 添加
	 * 
	 * @param pwallpaper
	 */
	public void save(Pwallpaper pwallpaper);

	/**
	 * 修改
	 * 
	 * @param pwallpaper
	 */
	public void update(Pwallpaper pwallpaper) ;
	

	/**
	 * 删除
	 * 
	 * @param pwallpaper
	 */
	public void delete(Pwallpaper pwallpaper);

	
	/**
	 * 获得
	 * 
	 * @param obid
	 * @return
	 */
	public Pwallpaper getById(Long id);
	
	/**
	 * 获取数据
	 * @param obid
	 * @return
	 */	
	public List<Pwallpaper> getList(Map<String,Object> params);
	/**
	 * 根据主键更新或者保存数据
	 * @param pwallpaper 
	 */	
	public void saveOrUpdate(Pwallpaper pwallpaper);
}
