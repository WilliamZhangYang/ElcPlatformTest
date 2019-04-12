package com.platform.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.platform.entity.User;

@Mapper
public interface UserDao {

	public void addUser(User user) throws Exception;
	
	public void deleteUser(String userId) throws Exception;
	
	public void updateUser(User user) throws Exception;
	
	public List<User> getAllUser() throws Exception;
	
	public User getUser(String userId) throws Exception;
}
