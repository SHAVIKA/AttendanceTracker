package com.shavika.attendance.tracker.organization.service;

import java.util.List;

import com.shavika.attendance.tracker.api.dto.Organization;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public interface OrganizationService {

	public abstract void save(Organization organization) throws ShavikaAppException;

	public abstract void update(Organization organization) throws ShavikaAppException;

	public abstract void delete(Organization organization) throws ShavikaAppException;

	public abstract void deleteById(long id) throws ShavikaAppException;

	public abstract void deleteAll() throws ShavikaAppException;

	public abstract Organization softDeleteById(long id) throws ShavikaAppException;

	public abstract List<Organization> getAllOrganization() throws ShavikaAppException;

	public abstract Organization getOrganization(long id) throws ShavikaAppException;

	public abstract boolean isOrganizationExist(Organization organization) throws ShavikaAppException;
}
