package com.shavika.attendance.tracker.organization.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shavika.attendance.tracker.api.dao.BaseDaoImpl;
import com.shavika.attendance.tracker.api.dto.Organization;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

@Repository("organizationDao")
public class OrganizationDaoImpl extends BaseDaoImpl<Organization>implements OrganizationDao {

	@Override
	public List<Organization> getAllOrganization() throws ShavikaAppException {
		return (List<Organization>) findAll(Organization.class);
	}

	@Override
	public Organization softDeleteById(long id) throws ShavikaAppException {
		Organization organization = (Organization) find(Organization.class, id);
		organization.setDeleted(true);
		update(organization);
		return organization;
	}
}
