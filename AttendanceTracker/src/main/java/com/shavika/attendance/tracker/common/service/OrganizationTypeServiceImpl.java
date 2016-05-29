package com.shavika.attendance.tracker.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shavika.attendance.tracker.api.dto.OrganizationType;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;
import com.shavika.attendance.tracker.common.dao.OrganizationTypeDao;

@Service("organizationTypeService")
public class OrganizationTypeServiceImpl implements OrganizationTypeService {

	@Autowired
	OrganizationTypeDao organizationTypeDao;

	@Override
	public List<OrganizationType> getAllOrganizationType() throws ShavikaAppException {
		return organizationTypeDao.getAllOrganizationType();
	}

}
