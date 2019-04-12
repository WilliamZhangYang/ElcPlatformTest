package com.platform.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.dao.UserDao;
import com.platform.entity.User;
import com.platform.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) throws Exception{
		String userId = UUID.randomUUID().toString();
		user.setUserId(userId);
		Date date = new Date();  
		user.setCreateTime(date);
		userDao.addUser(user);
	}

	@Override
	public void deleteUser(String userId) throws Exception {
		userDao.deleteUser(userId);
	}

	@Override
	public void updateUser(User user) throws Exception {
		userDao.updateUser(user);
	}

	@Override
	public List<User> getAllUser() throws Exception {
		List<User> userList = new ArrayList<User>();
		userList = userDao.getAllUser();
		return userList;
	}

	@Override
	public User getUser(String userId) throws Exception {
		User user = userDao.getUser(userId);
		return user;
	}

}
