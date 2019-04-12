package com.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.entity.Right;
import com.platform.service.RightService;

@RestController
@RequestMapping(value="/Right")
public class RightController {
	
	@Autowired
	private RightService rightService;
	
	@PostMapping(value="/addRight")
	public void addRight(Right right) {
		try {
			rightService.addRight(right);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DeleteMapping(value="/deleteRight/{rightId}")
	public void deleteRight(@PathVariable(value="rightId") String rightId) {
		try {
			rightService.deleteRight(rightId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@PutMapping(value="/updateRight")
	public void updateRight(Right right) {
		try {
			rightService.updateRight(right);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@GetMapping(value="/getAllRight")
	public List<Right> getAllRight() {
		List<Right> rightList = null;
		try {
			rightList = rightService.getAllRight();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rightList;
	}
	
	@GetMapping(value="/getRight/{rightId}")
	public Right getRight(@PathVariable(value="rightId") String rightId) {
		Right right = null;
		try {
			right = rightService.getRight(rightId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return right;
	}

}
