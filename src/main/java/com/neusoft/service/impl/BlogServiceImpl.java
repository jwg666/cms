package com.neusoft.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.dao.BlogDAO;
import com.neusoft.model.space.Blog;
import com.neusoft.service.BlogService;
@Service("blogService")
@Transactional
public class BlogServiceImpl implements BlogService {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Resource
	private BlogDAO blogDAO;
	@Override
	public void save(Blog blog) {
		logger.debug("---------------------");
		blogDAO.save(blog);
	}

}
