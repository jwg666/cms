/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.neusoft.model.portal.Permission;



/**
 * database table: tb_permission
 * database table comments: Permission
 * 
 *
 * @author jiawg-贾伟光
 * @Email jiawg@neusoft.com
 *
 
 */
@Repository
public class PermissionDAO extends HBaseDAO<Permission>{
		public List<Permission> findList(Map<String, Object> params) {		
			return findList(Permission.class, params);
		}	
}
