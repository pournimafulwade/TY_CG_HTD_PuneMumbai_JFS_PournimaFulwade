<%@page import="com.capgemini.springmvc.beans.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	/* String empId = (String) request.getAttribute("empId"); //1st method of login to display the data */
  /*   int empId = (int) request.getAttribute("empId");//2nd method of login to display the data
/* 	String password = (String) request.getAttribute("pwd"); */
	
	UserBean userBean = (UserBean) request.getAttribute("userBean");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 	Entered Employee Id = <%=empId %><br>
	Entered password = <%=password %> --%>
	
	<h3>Entered Employee Id= <%=userBean.getEmpId() %></h3>
	<h3>Entered password= <%=userBean.getPassword() %></h3>
	Entered DOB = <%=userBean.getDob() %>
	
</body>
</html>