package com.platform.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.platform.entity.Role;

@Mapper
public interface RoleDao {
	
	public void addRole(Role role) throws Exception;
	
	public void deleteRole(String roleId) throws Exception;
	
	public void updateRole(Role role) throws Exception;
	
	public List<Role> getAllRole() throws Exception;
	
	public Role getRole(String roleId) throws Exception;
}
