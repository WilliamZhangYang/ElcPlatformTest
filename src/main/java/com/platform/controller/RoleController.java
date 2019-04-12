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

import com.platform.entity.Role;
import com.platform.service.RoleService;

@RestController
@RequestMapping(value="/Role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@PostMapping(value="/addRole")
	public void addRole(Role role) {
		try {
			roleService.addRole(role);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DeleteMapping(value="/deleteRole/{roleId}")
	public void deleteRole(@PathVariable(value="roleId") String roleId) {
		try {
			roleService.deleteRole(roleId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@PutMapping(value="/updateRole")
	public void updateRole(Role role) {
		try {
			roleService.updateRole(role);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@GetMapping(value="/getAllRole")
	public List<Role> getAllRole(){
		List<Role> roleList = null;
		try {
			roleList = roleService.getAllRole();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roleList;
	}
	
	@GetMapping(value="/getRole/{roleId}")
	public Role getRole(@PathVariable(value="roleId") String roleId) {
		Role role = null;
		try {
			role = roleService.getRole(roleId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return role;
	}
}
