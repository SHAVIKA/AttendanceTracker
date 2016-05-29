package com.shavika.attendance.tracker.organization.dao;

import java.util.List;

import com.shavika.attendance.tracker.api.dao.BaseDao;
import com.shavika.attendance.tracker.api.dto.Organization;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public abstract interface OrganizationDao extends BaseDao<Organization> {

	public abstract List<Organization> getAllOrganization() throws ShavikaAppException;

	public abstract Organization softDeleteById(long id) throws ShavikaAppException;
}
