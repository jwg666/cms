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

import com.neusoft.dao.FileDAO;
import com.neusoft.model.portal.File;
import com.neusoft.service.FileService;

/**
 * 
 * @author jiawg-贾伟光
 *
 */
@Service("fileService")
@Transactional
public class FileServiceImpl implements FileService{
	@Resource
	private FileDAO fileDAO;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void save(File file) {
		logger.info("save start");
		fileDAO.save(file);
		logger.info("save end");
	}
	@Override
	public void update(File file) {
		logger.info("update start");
		fileDAO.update(file);
		logger.info("update end");		
	}
	@Override
	public void delete(File file) {
		logger.info("delete start");
		fileDAO.delete(file);
		logger.info("delete end");		
	}
	@Override
	public List<File> getList(Map<String, Object> params) {
		logger.info("getList start");
		List<File> fileList = fileDAO.findList(params);
		logger.info("getList end");
		return fileList;
	}
	@Override
	public void saveOrUpdate(File file) {
		logger.info("saveOrUpdate start");
		fileDAO.saveOrUpdate(file);
		logger.info("saveOrUpdate end");
		
	}
	@Override
	public File getById(Long id) {		
		return (File) fileDAO.getById(File.class,id);
	}

}
