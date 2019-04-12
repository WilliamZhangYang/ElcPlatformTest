package com.platform.service;

import java.util.List;

import com.platform.entity.Role;

public interface RoleService {

	public void addRole(Role role) throws Exception;
	
	public void deleteRole(String roleId) throws Exception;
	
	public void updateRole(Role role) throws Exception;
	
	public List<Role> getAllRole() throws Exception;
	
	public Role getRole(String roleId) throws Exception;
}
