package com.platform.dao;

import org.apache.ibatis.annotations.Mapper;

import com.platform.entity.User;

@Mapper
public interface TestDao {

	public User getUser();
}
