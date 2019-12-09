package com.capgemini.capgeminilogin.factory;

import com.capgemini.capgeminilogin.dao.UserDAO;
import com.capgemini.capgeminilogin.dao.UserDAOJDBCImpl;

public class UserFactory {
	private UserFactory()
	{
		
	}

	public static UserDAO getInstance() {
		UserDAO dao =new UserDAOJDBCImpl();
		return dao;
	} 

}
