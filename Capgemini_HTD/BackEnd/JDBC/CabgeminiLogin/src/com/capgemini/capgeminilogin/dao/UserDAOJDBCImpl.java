package com.capgemini.capgeminilogin.dao;

import java.io.FileReader;
import java.util.Properties;

import com.capgemini.capgeminilogin.beans.UserBean;

public class UserDAOJDBCImpl implements UserDAO{

	FileReader reader = null;
	Properties prop = null;
	UserBean user;
	
	public public UserDAOJDBCImpl() {
		
	}
	@Override
	public UserBean getInfo(int userid, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
