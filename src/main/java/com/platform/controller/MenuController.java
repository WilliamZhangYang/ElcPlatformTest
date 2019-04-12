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

import com.platform.entity.Menu;
import com.platform.service.MenuService;

@RestController
@RequestMapping(value="/Menu")
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	@PostMapping(value="/addMenu")
	public void addMenu(Menu menu) {
		try {
			menuService.addMenu(menu);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DeleteMapping(value="/deleteMenu/{menuId}")
	public void deleteMenu(@PathVariable(value="menuId") String menuId) {
		try {
			menuService.deleteMenu(menuId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@PutMapping(value="/updateMenu")
	public void updateMenu(Menu menu) {
		try {
			menuService.updateMenu(menu);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@GetMapping(value="/getAllMenu")
	public List<Menu> getAllMenu() {
		List<Menu> menuList = null;
		try {
			menuList = menuService.getAllMenu();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menuList;
	}
	
	@GetMapping(value="/getMenu/{menuId}")
	public Menu getMenu(@PathVariable(value="menuId") String menuId) {
		Menu menu = null;
		try {
			menu = menuService.getMenu(menuId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menu;
	}
}
