package com.platform.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.entity.User;
import com.platform.service.TestService;


@RestController
public class TestController {

	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private TestService testService;
	
	/*@GetMapping(name="/getMessage")*/
	public void getMessage() {
		log.info("hi!");
		/*User user = testService.getUser();
		log.info(user.getUserName());*/
	}
}
