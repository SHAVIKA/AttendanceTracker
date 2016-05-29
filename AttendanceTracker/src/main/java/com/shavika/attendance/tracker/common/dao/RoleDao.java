package com.shavika.attendance.tracker.common.dao;

import com.shavika.attendance.tracker.api.dao.BaseDao;
import com.shavika.attendance.tracker.api.dto.Roles;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public abstract interface RoleDao extends BaseDao<Roles> {

	public static final String GET_USER_ROLE_BY_ROLE_NAME = "getUserRoleByRoleName";
	public static final String GET_USER_ROLE_BY_ROLE_ID = "getUserRoleById";

	public abstract Roles getUserRoleByRoleName(String paramString) throws ShavikaAppException;

	public abstract Roles getUserRoleByRoleId(int paramString) throws ShavikaAppException;
}
