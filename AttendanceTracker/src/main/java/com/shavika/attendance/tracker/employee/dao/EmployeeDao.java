package com.shavika.attendance.tracker.employee.dao;

import java.util.List;

import com.shavika.attendance.tracker.api.dao.BaseDao;
import com.shavika.attendance.tracker.api.dto.Employee;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public abstract interface EmployeeDao extends BaseDao<Employee> {

	public static final String EMPLOYEE_FIND_BY_EMPID = "getEmployeeByName";

	public abstract List<Employee> getAllEmployee() throws ShavikaAppException;

	public abstract Employee softDeleteById(long id) throws ShavikaAppException;

}
