package com.shavika.attendance.tracker.common.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shavika.attendance.tracker.api.dao.BaseDaoImpl;
import com.shavika.attendance.tracker.api.dto.OrganizationType;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

@Repository("organizationTypeDao")
public class OrganizationTypeDaoImpl extends BaseDaoImpl<OrganizationType>implements OrganizationTypeDao {

	@Override
	public List<OrganizationType> getAllOrganizationType() throws ShavikaAppException {
		return (List<OrganizationType>) findAll(OrganizationType.class);
	}
}
