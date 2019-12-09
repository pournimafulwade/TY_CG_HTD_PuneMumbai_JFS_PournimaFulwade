package com.capgemini.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboot.beans.EmployeeInfoBean;
import com.capgemini.springboot.beans.EmployeeResponse;
import com.capgemini.springboot.service.EmployeeService;


//@Controller //normal controller
@RestController // is itself annotated with @Controller and @ResponseBody
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping(path = "/getEmployee",
			produces= {MediaType.APPLICATION_JSON_VALUE , MediaType.APPLICATION_XML_VALUE})
	@ResponseBody //object is coming into the body of the request
	public EmployeeResponse getEmployee(int empId) {
		EmployeeInfoBean employeeInfoBean =  service.getEmployee(empId);
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if(employeeInfoBean != null) {
			employeeResponse.setStatusCode(101);
			employeeResponse.setMessage("Success");
			employeeResponse.setDescription("employee Record Found...");
			employeeResponse.setEmployeeInfoBean(employeeInfoBean);
		}else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failed");
			employeeResponse.setDescription("Employee Id "+ empId + "Not Found!!!");
		}
		return employeeResponse;
	}//end of getEmployee()
	
	@PutMapping(path="/addEmployee",consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	@ResponseBody
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
	boolean isAdded = service.addEmployee(employeeInfoBean);
	
	EmployeeResponse employeeResponse = new EmployeeResponse();
	if(isAdded) {
		
		employeeResponse.setStatusCode(201);
		employeeResponse.setMessage("Success");
		employeeResponse.setDescription("Employee Added Successfully...");
	}
	else {
		employeeResponse.setStatusCode(401);
		employeeResponse.setMessage("Failed");
		employeeResponse.setDescription("Unable to Add the Employee Details!!!");
	}
	return employeeResponse;
	}//end of the addEmployee()
	
	@DeleteMapping(path="/deleteEmployee/{empId}",
			produces= {MediaType.APPLICATION_JSON_VALUE , MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse deleteEmployee(@PathVariable("empId") int empId) {
		boolean isDeleted =  service.deleteEmployee(empId);
		
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if(isDeleted) {
			employeeResponse.setStatusCode(101);
			employeeResponse.setMessage("Success");
			employeeResponse.setDescription("Employee Details Deleted successfully...");
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failed");
			employeeResponse.setDescription("unable to Detele the Employee Details!!!");
		}
		return employeeResponse;
	}//end of the deleteEmployee()
	
	@PostMapping(path="/updateEmployee",
			produces= {MediaType.APPLICATION_JSON_VALUE , MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated = service.updateEmployee(employeeInfoBean);
		
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if(isUpdated) {
			employeeResponse.setStatusCode(101);
			employeeResponse.setMessage("success");
			employeeResponse.setDescription("Successfully Updated the Employee record....");
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failed");
			employeeResponse.setDescription("Unable to Update the Employee Record!!!");
		}
		return employeeResponse;
	}//end of the updateEmployee()
	
	@GetMapping(path = "/getAll",
			produces= {MediaType.APPLICATION_JSON_VALUE , MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse getAllEmployee() {
		List<EmployeeInfoBean> employeeList = service.getAllEmployees();
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if(employeeList != null && !employeeList.isEmpty()) {
			employeeResponse.setStatusCode(101);
			employeeResponse.setMessage("Success");
			employeeResponse.setDescription("Employees Record Found..");
			employeeResponse.setEmployeeList(employeeList);
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failed");
			employeeResponse.setDescription("Unable to Fetch the Record!!");
		}
		return employeeResponse;
	}//end of the getAllEmployee()
}//end of the class
