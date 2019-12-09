package com.capgemini.springcore.annotations.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {

	private int empId;
	private String empName;
	@Autowired(required = false)
	@Qualifier("tester")
	private DepartmentBean departmentBean;

	// getters and setters()
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}

	// bean life-Cycle using Annotation

	@PostConstruct
	public void init() {
		System.out.println("Init Phase...");
	}// end of the init()

	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Phase...");
	}// end of the Destroy()
}// end of the class
