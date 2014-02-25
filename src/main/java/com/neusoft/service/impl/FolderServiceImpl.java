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

import com.neusoft.dao.FolderDAO;
import com.neusoft.model.portal.Folder;
import com.neusoft.service.FolderService;
import com.neusoft.util.ConverterUtil;

/**
 * 
 * @author jiawg-贾伟光
 *
 */
@Service("folderService")
@Transactional
public class FolderServiceImpl implements FolderService{
	@Resource
	private FolderDAO folderDAO;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void save(Folder folder) {
		logger.info("save start");
		folderDAO.save(folder);
		logger.info("save end");
	}
	@Override
	public void update(Folder folder) {
		logger.info("update start");
		folderDAO.update(folder);
		logger.info("update end");		
	}
	@Override
	public void delete(Folder folder) {
		logger.info("delete start");
		folderDAO.delete(folder);
		logger.info("delete end");		
	}
	@Override
	public List<Folder> getList(Map<String, Object> params) {
		logger.info("getList start");
		List<Folder> folderList = folderDAO.findList(params);
		logger.info("getList end");
		return folderList;
	}
	@Override
	public void saveOrUpdate(Folder folder) {
		logger.info("saveOrUpdate start");
		folderDAO.saveOrUpdate(folder);
		logger.info("saveOrUpdate end");
		
	}
	@Override
	public Folder getById(Long id) {		
		return (Folder) folderDAO.getById(Folder.class,id);
	}
	@Override
	public Folder get(Folder folder) {		
		return (Folder)folderDAO.get(Folder.class, ConverterUtil.toHashMap(folder));
	}

}
