package com.shavika.attendance.tracker.common.service;

import java.util.List;

import com.shavika.attendance.tracker.api.dto.OrganizationType;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public interface OrganizationTypeService {

	public abstract List<OrganizationType> getAllOrganizationType() throws ShavikaAppException;

}
