package com.shavika.attendance.tracker.organization.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shavika.attendance.tracker.api.dto.Organization;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;
import com.shavika.attendance.tracker.organization.dao.OrganizationDao;

@Service("organizationService")
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private OrganizationDao organizationDao;

	@Override
	public void save(Organization organization) throws ShavikaAppException {
		organizationDao.save(organization);
	}

	@Override
	public void update(Organization organization) throws ShavikaAppException {
		organizationDao.update(organization);
	}

	@Override
	public void delete(Organization organization) throws ShavikaAppException {
		organizationDao.delete(organization);
	}

	@Override
	public void deleteById(long id) throws ShavikaAppException {
		organizationDao.deleteById(Organization.class, id);
	}

	@Override
	public void deleteAll() throws ShavikaAppException {
		organizationDao.deleteAll(Organization.class);
	}

	@Override
	public List<Organization> getAllOrganization() throws ShavikaAppException {
		return organizationDao.findAll(Organization.class);
	}

	@Override
	public Organization getOrganization(long id) throws ShavikaAppException {
		return (Organization) organizationDao.find(Organization.class, id);
	}

	@Override
	public boolean isOrganizationExist(Organization organization) throws ShavikaAppException {
		return organizationDao.isRecordExist(Organization.class, organization.getId());
	}

	@Override
	public Organization softDeleteById(long id) throws ShavikaAppException {
		return organizationDao.softDeleteById(id);
	}
}
