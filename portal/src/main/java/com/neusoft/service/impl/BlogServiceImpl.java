package com.neusoft.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.dao.BlogDAO;
import com.neusoft.model.space.Blog;
import com.neusoft.service.BlogService;
@Service("blogService")
//@Transactional
public class BlogServiceImpl implements BlogService {
	@Resource
	private BlogDAO blogDAO;
	@Override
	public void save(Blog blog) {
		blogDAO.save(blog);
	}

}
