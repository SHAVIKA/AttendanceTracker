package com.shavika.attendance.tracker.employee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shavika.attendance.tracker.api.dao.BaseDaoImpl;
import com.shavika.attendance.tracker.api.dto.Employee;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

@Repository("employeeDao")
public class EmployeeDaoImpl extends BaseDaoImpl<Employee>implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployee() throws ShavikaAppException {
		// List<Employee> employeeList = getSession().getNamedQuery(GET_ALL_EMPLOYEE).list();
		List<Employee> employeeList = findAll(Employee.class);
		return employeeList;
	}

	@Override
	public Employee softDeleteById(long id) throws ShavikaAppException {
		Employee employee = (Employee) find(Employee.class, id);
		employee.setDeleted(true);
		update(employee);
		return employee;
	}

}
