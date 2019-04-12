package com.platform.service;

import java.util.List;

import com.platform.entity.Right;

public interface RightService {

	public void addRight(Right right) throws Exception;
	
	public void deleteRight(String rightId) throws Exception;
	
	public void updateRight(Right right) throws Exception;
	
	public List<Right> getAllRight() throws Exception;
	
	public Right getRight(String rightId) throws Exception;
}
