package com.shavika.attendance.tracker.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shavika.attendance.tracker.api.dto.Employee;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;
import com.shavika.attendance.tracker.employee.dao.EmployeeDao;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void save(Employee employee) throws ShavikaAppException {
		employeeDao.save(employee);
	}

	@Override
	public void update(Employee employee) throws ShavikaAppException {
		employeeDao.update(employee);
	}

	@Override
	public void delete(Employee employee) throws ShavikaAppException {
		employeeDao.delete(employee);
	}

	@Override
	public void deleteById(long id) throws ShavikaAppException {
		employeeDao.deleteById(Employee.class, id);
	}

	@Override
	public void deleteAll() throws ShavikaAppException {
		employeeDao.deleteAll(Employee.class);
	}

	@Override
	public List<Employee> getAllEmployee() throws ShavikaAppException {
		return employeeDao.findAll(Employee.class);
	}

	@Override
	public Employee getEmployee(long id) throws ShavikaAppException {
		return (Employee) employeeDao.find(Employee.class, id);
	}

	@Override
	public boolean isEmployeeExist(Employee employee) throws ShavikaAppException {
		return employeeDao.isRecordExist(Employee.class, employee.getId());
	}

	@Override
	public Employee softDeleteById(long id) throws ShavikaAppException {
		return employeeDao.softDeleteById(id);
	}
}
