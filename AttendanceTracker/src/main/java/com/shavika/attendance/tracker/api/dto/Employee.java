package com.shavika.attendance.tracker.api.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shavika.attendance.tracker.employee.dao.EmployeeDao;

@Entity
@Table(name = "EMPLOYEE")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@NamedQueries({ @NamedQuery(name = EmployeeDao.EMPLOYEE_FIND_BY_EMPID, query = "from Employee") })
public class Employee extends BaseDomain {

	private static final long serialVersionUID = 129404396970316733L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@Column(name = "EMPLOYEE_ID", length = 10, nullable = false)
	private String employeeId;

	@Column(name = "FIRST_NAME", length = 30, nullable = false)
	private String firstName;

	@Column(name = "MIDDLE_NAME", length = 10, nullable = true)
	private String middleName;

	@Column(name = "LAST_NAME", length = 20, nullable = true)
	private String lastName;

	@Column(name = "GENDER", length = 1, nullable = true)
	private String gender;

	@Column(name = "CITY", length = 20, nullable = true)
	private String city;

	@Column(name = "DESIGNATION", length = 30)
	private String designation;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeId, String firstName, String middleName, String lastName, String gender, String city, String designation) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.city = city;
		this.designation = designation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeId=" + employeeId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", gender="
				+ gender + ", city=" + city + ", designation=" + designation + "]";
	}

}
