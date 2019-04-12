package com.platform.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.dao.MenuDao;
import com.platform.entity.Menu;
import com.platform.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;
	
	@Override
	public void addMenu(Menu menu) throws Exception {
		String menuId = UUID.randomUUID().toString();
		menu.setMenuId(menuId);
		menu.setCreateTime(new Date());
		menuDao.addMenu(menu);
	}

	@Override
	public void deleteMenu(String menuId) throws Exception {
		menuDao.deleteMenu(menuId);
	}

	@Override
	public void updateMenu(Menu menu) throws Exception {
		menuDao.updateMenu(menu);
	}

	@Override
	public List<Menu> getAllMenu() throws Exception {
		return menuDao.getAllMenu();
	}

	@Override
	public Menu getMenu(String menuId) throws Exception {
		return menuDao.getMenu(menuId);
	}

}
