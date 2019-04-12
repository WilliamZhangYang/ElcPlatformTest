package com.platform.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.platform.entity.Right;

@Mapper
public interface RightDao {

	public void addRight(Right right) throws Exception;
	
	public void deleteRight(String rightId) throws Exception;
	
	public void updateRight(Right right) throws Exception;
	
	public List<Right> getAllRight() throws Exception;
	
	public Right getRight(String rightId) throws Exception;
}
