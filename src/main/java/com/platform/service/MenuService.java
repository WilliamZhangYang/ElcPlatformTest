package com.platform.service;


import java.util.List;

import com.platform.entity.Menu;

public interface MenuService {

	public void addMenu(Menu menu) throws Exception;
	
	public void deleteMenu(String menuId) throws Exception;
	
	public void updateMenu(Menu menu) throws Exception;
	
	public List<Menu> getAllMenu() throws Exception;
	
	public Menu getMenu(String menuId) throws Exception;
}
