package com.shavika.attendance.tracker.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.shavika.attendance.tracker.api.dto.Employee;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;
import com.shavika.attendance.tracker.employee.service.EmployeeService;

@RestController
public class EmployeeListRSController {

	@Autowired
	EmployeeService employeeService;

	/*************
	 * @method Get all Employee
	 * @return
	 * @throws ShavikaAppException
	 */
	@RequestMapping(value = "/employee/", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> allEmployees() throws ShavikaAppException {
		List<Employee> employees = employeeService.getAllEmployee();
		if (employees.isEmpty())
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
	}

	/*************
	 * @method Get specified Employee by Employee_ID
	 * @param id
	 * @return
	 * @throws ShavikaAppException
	 */
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") long id) throws ShavikaAppException {
		Employee employee = employeeService.getEmployee(id);
		if (employee == null)
			return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	/*************
	 * @method create new Employee.
	 * @param employee
	 * @param ucBuilder
	 * @return
	 * @throws ShavikaAppException
	 */
	@RequestMapping(value = "/employee/add/", method = RequestMethod.POST)
	public ResponseEntity<Void> createEmployee(@RequestBody Employee employee, UriComponentsBuilder ucBuilder) throws ShavikaAppException {
		if (employeeService.isEmployeeExist(employee))
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);

		employeeService.save(employee);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/employee/{id}").buildAndExpand(employee.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	/************
	 * @method Update existing Employee
	 * @param id
	 * @param emp
	 * @return
	 * @throws ShavikaAppException
	 */
	@RequestMapping(value = "/employee/update/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee emp) throws ShavikaAppException {
		Employee employee = employeeService.getEmployee(emp.getId());
		if (employee == null)
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);

		employee.setFirstName(emp.getFirstName());
		employee.setLastName(emp.getLastName());
		employee.setMiddleName(emp.getMiddleName());
		employeeService.update(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	/****************
	 * @method Delete the employee.
	 * @param id
	 * @return
	 * @throws ShavikaAppException
	 */
	@RequestMapping(value = "/employee/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") long id) throws ShavikaAppException {
		Employee employee = employeeService.getEmployee(id);
		if (employee == null)
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		employeeService.deleteById(id);
		return new ResponseEntity<Employee>(employee, HttpStatus.NO_CONTENT);
	}

	/****************
	 * @method Delete all the employee
	 * @return
	 * @throws ShavikaAppException
	 */
	@RequestMapping(value = "/employee/delete/", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteAllEmployee() throws ShavikaAppException {
		employeeService.deleteAll();
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/test/", method = RequestMethod.GET)
	public ResponseEntity<Void> test() throws ShavikaAppException {
		Employee employee = new Employee();
		employee.setEmployeeId("EMP300");
		employee.setFirstName("Bama");
		employee.setLastName("B");
		employee.setMiddleName("Bamini");
		employee.setCity("Mysore");
		employee.setDesignation("Manager");
		employee.setGender("M");
		System.out.println(employee);
		employeeService.save(employee);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
	public ResponseEntity<Void> test1(@PathVariable("id") long id) throws ShavikaAppException {
		Employee employee = employeeService.getEmployee(id);
		System.out.println("Before ====================>" + employee);
		employee.setEmployeeId("EMP2111");
		employee.setFirstName("Bama111");
		employee.setLastName("B1211");
		employee.setMiddleName("Bamini11");
		employee.setCity("Mysore111");
		employee.setDesignation("Manager123");
		employee.setGender("M");
		System.out.println("After ====================>" + employee);
		employeeService.update(employee);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/test1/{id}", method = RequestMethod.GET)
	public ResponseEntity<Void> test12(@PathVariable("id") long id) throws ShavikaAppException {
		// Employee employee = employeeService.getEmployee(id);
		// System.out.println("Before ====================>" + employee);
		// if (employee == null)
		// return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		employeeService.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/test1/", method = RequestMethod.GET)
	public ResponseEntity<Void> test123() throws ShavikaAppException {
		employeeService.deleteAll();
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/test2/{id}", method = RequestMethod.GET)
	public ResponseEntity<Void> test4(@PathVariable("id") long id) throws ShavikaAppException {
		employeeService.softDeleteById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
