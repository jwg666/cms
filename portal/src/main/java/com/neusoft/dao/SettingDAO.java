/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.neusoft.model.portal.Setting;



/**
 * database table: tb_setting
 * database table comments: Setting
 * 
 *
 * @author jiawg-贾伟光
 * @Email jiawg@neusoft.com
 *
 
 */
@Repository
public class SettingDAO extends HBaseDAO<Setting>{
		public List<Setting> findList(Map<String, Object> params) {		
			return findList(Setting.class, params);
		}	
}
