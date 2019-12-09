package com.capgemini.springmvc.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.springmvc.beans.UserBean;

@Controller
public class SpringMVCController {
	//for date format
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"), true);
		
		binder.registerCustomEditor(Date.class, dateEditor);
	}//end of the InitBinder()

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ModelAndView displayHelloUser() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("WEB-INF/views/helloUser.jsp");

		return modelAndView;

	}// end of the displayHelloUser()

	@RequestMapping(path = "/loginForm", method = RequestMethod.GET)
	public ModelAndView displayLoginForm() {
		ModelAndView modelAndView = new ModelAndView();
		/* modelAndView.setViewName("WEB-INF/views/loginForm.jsp"); */
		modelAndView.setViewName("loginForm");

		return modelAndView;
	}// end of the displayLoginForm()

	
	//1st method to display the login details to the users 
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req, ModelAndView modelAndView) {
		String empIdVal = req.getParameter("empId");
		String password = req.getParameter("password");

		req.setAttribute("empId", empIdVal);
		req.setAttribute("pwd", password);

		/* modelAndView.setViewName("WEB-INF/views/usersDetails.jsp"); */
		modelAndView.setViewName("usersDetails");

		return modelAndView;
	}// end if the login()

	
	//2nd way to display the user details to the users 
	@RequestMapping(path = "/login2", method = RequestMethod.POST)
	public String login2(@RequestParam("empId") int empId, @RequestParam("password") String password,
			ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("pwd", password);

		return "/WEB-INF/views/usersDetails.jsp";
	}// end of the login2()
	
	
	//3rd way to display the data to the users
	@PostMapping("/login3")
public String login3(int empId,String password,ModelMap modelMap) {
	modelMap.addAttribute("empId",empId);
	modelMap.addAttribute("pwd", password);
	
	return "usersDetails";
}//end of the login3()

	@PostMapping("/login4")
	public String login4(UserBean userBean, ModelMap modelMap) {
		
		modelMap.addAttribute("userBean", userBean);
		
		return "usersDetails";
	}
	
}// end of the class