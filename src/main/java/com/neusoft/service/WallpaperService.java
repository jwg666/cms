/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.model.portal.Wallpaper;

public interface WallpaperService{

	/**
	 * 添加
	 * 
	 * @param wallpaper
	 */
	public void save(Wallpaper wallpaper);

	/**
	 * 修改
	 * 
	 * @param wallpaper
	 */
	public void update(Wallpaper wallpaper) ;
	

	/**
	 * 删除
	 * 
	 * @param wallpaper
	 */
	public void delete(Wallpaper wallpaper);

	
	/**
	 * 获得
	 * 
	 * @param obid
	 * @return
	 */
	public Wallpaper getById(Long id);
	
	/**
	 * 获取数据
	 * @param obid
	 * @return
	 */	
	public List<Wallpaper> getList(Map<String,Object> params);
	/**
	 * 根据主键更新或者保存数据
	 * @param wallpaper 
	 */	
	public void saveOrUpdate(Wallpaper wallpaper);
}
