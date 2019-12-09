package com.capgemini.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springrest.beans.EmployeeInfoBean;
import com.capgemini.springrest.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		return dao.getEmployee(empId);
	}//end of the getEmployee()

	@Override
	public EmployeeInfoBean authenticate(int empId, String pwd) {
		return dao.authenticate(empId, pwd);
	}//end of the authenticate()

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.addEmployee(employeeInfoBean);
	}//end of the addEmployee()

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.updateEmployee(employeeInfoBean);
	}//end of the updateEmployee()

	@Override
	public boolean deleteEmployee(int empId) {
		return dao.deleteEmployee(empId);
	}//end of the deleteEmployee()

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		return dao.getAllEmployees();
	}//end of the getAllEmployee()

}//end of the EmployeeServiceImpl class

