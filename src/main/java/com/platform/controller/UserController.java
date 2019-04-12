package com.platform.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.platform.entity.User;
import com.platform.service.UserService;

/**
 * 用户管理类
 * 
 * @author zy
 *
 */
@RestController
@RequestMapping(value="/User")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value="/addUser")
	public void addUser(User user) {
		try {
			userService.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DeleteMapping(value="/deleteUser/{userId}")
	public void deleteUser(@PathVariable(value="userId") String userId) {
		try {
			userService.deleteUser(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@PutMapping(value="/updateUser")
	public void updateUser(User user) {
		try {
			userService.updateUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@GetMapping(value="/getAllUser")
	public List<User> getAllUser() {
		List<User> userList = null;
		try {
			userList = userService.getAllUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	@GetMapping(value="/getUser/{userId}")
	public User getUser(@PathVariable(value="userId") String userId) {
		User user = null;
		try {
			user = userService.getUser(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
