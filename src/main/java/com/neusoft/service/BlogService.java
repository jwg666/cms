package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.model.space.Blog;

public interface BlogService {
	public void save(Blog blog);
	public void update(Blog blog);
	public void delete(Blog blog);
	public List<Blog> getList(Map<String,Object> params);
	public void saveOrUpdate(Blog blog);
	public Blog getById(Long id);
}
