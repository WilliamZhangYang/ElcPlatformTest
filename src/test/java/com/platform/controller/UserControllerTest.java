package com.platform.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.platform.ElcPlatformTestApplicationTests;
import com.platform.entity.User;
import com.platform.service.UserService;
import com.platform.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserControllerTest.class )//这里是启动类
public class UserControllerTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void test() {
		User user = new User();
		user.setLoginName("admin");
		user.setPassword("admin");
		user.setUserName("admin");
		user.setMobile("11111");
		user.setEmail("1111");
		try {
			userService.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
