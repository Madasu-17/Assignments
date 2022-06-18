package com.zensar.bean;

public class Department {
	private int departmentId;
	private String departmantName;
	
	public Department() {
		super();
	}
	public Department(int departmentId, String departmantName) {
		super();
		this.departmentId = departmentId;
		this.departmantName = departmantName;

}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmantName() {
		return departmantName;
	}
	public void setDepartmantName(String departmantName) {
		this.departmantName = departmantName;
	}
	@Override
	public String toString() {
		return "Departmet [departmentId=" + departmentId + ", departmantName=" + departmantName + "]";
	}
}