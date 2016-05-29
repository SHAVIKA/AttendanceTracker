package com.shavika.attendance.tracker.employee.service;

import java.util.List;

import com.shavika.attendance.tracker.api.dto.Employee;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public interface EmployeeService {

	public abstract void save(Employee employee) throws ShavikaAppException;

	public abstract void update(Employee employee) throws ShavikaAppException;

	public abstract void delete(Employee employee) throws ShavikaAppException;

	public abstract void deleteById(long id) throws ShavikaAppException;

	public abstract void deleteAll() throws ShavikaAppException;

	public abstract Employee softDeleteById(long id) throws ShavikaAppException;

	public abstract List<Employee> getAllEmployee() throws ShavikaAppException;

	public abstract Employee getEmployee(long id) throws ShavikaAppException;

	public abstract boolean isEmployeeExist(Employee employee) throws ShavikaAppException;
}
