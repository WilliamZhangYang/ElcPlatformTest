package com.platform.entity;

import java.util.Date;

public class Menu {

	private String menuId;
	
	private String menuName;
	
	private String parentmenuId;
	
	private Date createTime;
	
	private String description;
	
	private String url;

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getParentmenuId() {
		return parentmenuId;
	}

	public void setParentmenuId(String parentmenuId) {
		this.parentmenuId = parentmenuId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
