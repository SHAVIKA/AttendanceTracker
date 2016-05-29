package com.shavika.attendance.tracker.common.service;

import java.util.List;

import com.shavika.attendance.tracker.api.dto.Privilege;
import com.shavika.attendance.tracker.api.dto.Roles;
import com.shavika.attendance.tracker.api.dto.UserLogin;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public abstract interface UserService {

	public abstract UserLogin getUserLoginByName(String userName) throws ShavikaAppException;

	public abstract UserLogin getUserLoginByEmail(String userEmail) throws ShavikaAppException;

	public abstract Roles findUserRole(int paramInt) throws ShavikaAppException;

	public abstract List<Privilege> getPrivilegesByUserRole(Roles paramRole) throws ShavikaAppException;
}
