package com.platform.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.dao.RoleDao;
import com.platform.entity.Role;
import com.platform.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	@Override
	public void addRole(Role role) throws Exception {
		String roleId = UUID.randomUUID().toString();
		role.setRoleId(roleId);
		role.setCreateTime(new Date());
		roleDao.addRole(role);
	}

	@Override
	public void deleteRole(String roleId) throws Exception {
		roleDao.deleteRole(roleId);
	}

	@Override
	public void updateRole(Role role) throws Exception {
		roleDao.updateRole(role);
	}

	@Override
	public List<Role> getAllRole() throws Exception {
		return roleDao.getAllRole();
	}

	@Override
	public Role getRole(String roleId) throws Exception {
		return roleDao.getRole(roleId);
	}

}
