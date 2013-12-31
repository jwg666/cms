package com.neusoft.service.impl;

import java.util.List;
import java.util.Map;

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
		logger.info("save start");
		blogDAO.save(blog);
		logger.info("save end");
	}
	@Override
	public void update(Blog blog) {
		logger.info("update start");
		blogDAO.update(blog);
		logger.info("update end");		
	}
	@Override
	public void delete(Blog blog) {
		logger.info("delete start");
		blogDAO.delete(blog);
		logger.info("delete end");		
	}
	@Override
	public List<Blog> getList(Map<String, Object> params) {
		logger.info("getList start");
		List<Blog> blogList = blogDAO.findList(params);
		logger.info("getList end");
		return blogList;
	}
	@Override
	public void saveOrUpdate(Blog blog) {
		logger.info("saveOrUpdate start");
		blogDAO.saveOrUpdate(blog);
		logger.info("saveOrUpdate end");
		
	}
	@Override
	public Blog getById(Long id) {		
		return (Blog) blogDAO.getById(Blog.class,id);
	}
	
}
