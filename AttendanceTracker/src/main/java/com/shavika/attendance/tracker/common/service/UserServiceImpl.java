package com.shavika.attendance.tracker.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shavika.attendance.tracker.api.dto.Privilege;
import com.shavika.attendance.tracker.api.dto.Roles;
import com.shavika.attendance.tracker.api.dto.UserLogin;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;
import com.shavika.attendance.tracker.common.dao.PrivilegeDao;
import com.shavika.attendance.tracker.common.dao.RoleDao;
import com.shavika.attendance.tracker.common.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private PrivilegeDao privilegeDao;

	@Override
	public UserLogin getUserLoginByName(String userName) throws ShavikaAppException {
		return this.userDao.getAnyUserLoginByName(userName);
	}

	@Override
	public UserLogin getUserLoginByEmail(String userEmail) throws ShavikaAppException {
		return this.userDao.getUserLoginByEmail(userEmail);
	}

	@Override
	public Roles findUserRole(int userRoleId) throws ShavikaAppException {
		return (Roles) this.roleDao.getUserRoleByRoleId(userRoleId);
		// return (Roles) this.roleDao.findById(Roles.class, userRoleId);
	}

	@Override
	public List<Privilege> getPrivilegesByUserRole(Roles userRole) throws ShavikaAppException {
		return privilegeDao.getPrivilegesByUserRole(userRole);
	}
}
