package com.platform.service;

import java.util.List;

import com.platform.entity.User;

public interface UserService {

	public void addUser(User user) throws Exception;
	
	public void deleteUser(String userId) throws Exception;
	
	public void updateUser(User user) throws Exception;
	
	public List<User> getAllUser() throws Exception;
	
	public User getUser(String userId) throws Exception;
}
