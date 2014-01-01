/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.model.portal.Folder;

public interface FolderService{

	/**
	 * 添加
	 * 
	 * @param folder
	 */
	public void save(Folder folder);

	/**
	 * 修改
	 * 
	 * @param folder
	 */
	public void update(Folder folder) ;
	

	/**
	 * 删除
	 * 
	 * @param folder
	 */
	public void delete(Folder folder);

	
	/**
	 * 获得
	 * 
	 * @param obid
	 * @return
	 */
	public Folder getById(Long id);
	
	/**
	 * 获取数据
	 * @param obid
	 * @return
	 */	
	public List<Folder> getList(Map<String,Object> params);
	/**
	 * 根据主键更新或者保存数据
	 * @param folder 
	 */	
	public void saveOrUpdate(Folder folder);
}
