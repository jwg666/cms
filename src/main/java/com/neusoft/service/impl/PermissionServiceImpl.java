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

import com.neusoft.dao.PermissionDAO;
import com.neusoft.model.portal.Permission;
import com.neusoft.service.PermissionService;

/**
 * 
 * @author jiawg-贾伟光
 *
 */
@Service("permissionService")
@Transactional
public class PermissionServiceImpl implements PermissionService{
	@Resource
	private PermissionDAO permissionDAO;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void save(Permission permission) {
		logger.info("save start");
		permissionDAO.save(permission);
		logger.info("save end");
	}
	@Override
	public void update(Permission permission) {
		logger.info("update start");
		permissionDAO.update(permission);
		logger.info("update end");		
	}
	@Override
	public void delete(Permission permission) {
		logger.info("delete start");
		permissionDAO.delete(permission);
		logger.info("delete end");		
	}
	@Override
	public List<Permission> getList(Map<String, Object> params) {
		logger.info("getList start");
		List<Permission> permissionList = permissionDAO.findList(params);
		logger.info("getList end");
		return permissionList;
	}
	@Override
	public void saveOrUpdate(Permission permission) {
		logger.info("saveOrUpdate start");
		permissionDAO.saveOrUpdate(permission);
		logger.info("saveOrUpdate end");
		
	}
	@Override
	public Permission getById(Long id) {		
		return (Permission) permissionDAO.getById(Permission.class,id);
	}

}
