/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.neusoft.model.portal.App;



/**
 * database table: tb_app
 * database table comments: App
 * 
 *
 * @author jiawg-贾伟光
 * @Email jiawg@neusoft.com
 *
 
 */
@Repository
public class AppDAO extends HBaseDAO<App>{
		public List<App> findList(Map<String, Object> params) {		
			return findList(App.class, params);
		}	
}
