/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.dao;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.neusoft.model.portal.File;



/**
 * database table: tb_file
 * database table comments: File
 * 
 *
 * @author jiawg-贾伟光
 * @Email jiawg@neusoft.com
 *
 
 */
@Repository
public class FileDAO extends HBaseDAO<File>{
		public List<File> findList(Map<String, Object> params) {		
			return findList(File.class, params);
		}	
}
