package com.zensar.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	@Autowired
	@Qualifier("department")
	private Department depDetails;
	public Employee() {
		super();
	}
	
	
	public Employee(Department depDetails) {
		super();
		this.depDetails = depDetails;
	}


	public Employee(int employeeId, String employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public Employee(int employeeId, String employeeName, int employeeSalary, Department depDetails) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.depDetails = depDetails;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Department getDepDetails() {
		return depDetails;
	}
	//@Autowired
	public void setDepDetails(Department depDetails) {
		this.depDetails = depDetails;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", depDetails=" + depDetails + "]";
	}
	
	
	

}
