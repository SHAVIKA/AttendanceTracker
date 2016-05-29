package com.shavika.attendance.tracker.common.dao;

import java.util.List;

import com.shavika.attendance.tracker.api.dao.BaseDao;
import com.shavika.attendance.tracker.api.dto.Privilege;
import com.shavika.attendance.tracker.api.dto.Roles;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public abstract interface PrivilegeDao extends BaseDao<Privilege> {

	public abstract List<Privilege> getPrivilegesByUserRole(Roles paramUserRole) throws ShavikaAppException;

}
