package com.platform.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.platform.entity.Menu;

@Mapper
public interface MenuDao {

	public void addMenu(Menu menu) throws Exception;
	
	public void deleteMenu(String menuId) throws Exception;
	
	public void updateMenu(Menu menu) throws Exception;
	
	public List<Menu> getAllMenu() throws Exception;
	
	public Menu getMenu(String menuId) throws Exception;
}
