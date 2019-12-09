package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;

import com.capgemini.springcore.annotations.bean.DepartmentBean;

public class DepartmentConfig {
@Bean(name="java developer")
	
	public DepartmentBean getJavaDev() {
		DepartmentBean departmentBean= new DepartmentBean();
		departmentBean.setDeptId(01);
		departmentBean.setDeptName("Java Developer");
		
		return departmentBean;
	}//end of the getDepartmentBean
	
	@Bean(name="python developer")
//	@Primary
	public DepartmentBean getPythonDev() {
		DepartmentBean departmentBean= new DepartmentBean();
		departmentBean.setDeptId(02);
		departmentBean.setDeptName("Python Developer");
		
		return departmentBean;
	}//end of the getDepartmentBean1
	
	@Bean(name ="tester")
	public DepartmentBean getTesting() {
		DepartmentBean departmentBean= new DepartmentBean();
		departmentBean.setDeptId(03);
		departmentBean.setDeptName("Tester");
		
		return departmentBean;
	}//end of the getDepartmentBean2

}
