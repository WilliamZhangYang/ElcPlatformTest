package com.platform.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.dao.RightDao;
import com.platform.entity.Right;
import com.platform.service.RightService;

@Service
public class RightServiceImpl implements RightService {

	@Autowired
	private RightDao rightDao;
	
	@Override
	public void addRight(Right right) throws Exception {
		String rightId = UUID.randomUUID().toString();
		right.setRightId(rightId);
		rightDao.addRight(right);
	}

	@Override
	public void deleteRight(String rightId) throws Exception {
		rightDao.deleteRight(rightId);
	}

	@Override
	public void updateRight(Right right) throws Exception {
		rightDao.updateRight(right);
	}

	@Override
	public List<Right> getAllRight() throws Exception {
		return rightDao.getAllRight();
	}

	@Override
	public Right getRight(String rightId) throws Exception {
		return rightDao.getRight(rightId);
	}

}
