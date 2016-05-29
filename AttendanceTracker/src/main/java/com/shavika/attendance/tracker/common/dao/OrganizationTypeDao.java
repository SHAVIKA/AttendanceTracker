package com.shavika.attendance.tracker.common.dao;

import java.util.List;

import com.shavika.attendance.tracker.api.dao.BaseDao;
import com.shavika.attendance.tracker.api.dto.OrganizationType;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public abstract interface OrganizationTypeDao extends BaseDao<OrganizationType> {

	public abstract List<OrganizationType> getAllOrganizationType() throws ShavikaAppException;

}
