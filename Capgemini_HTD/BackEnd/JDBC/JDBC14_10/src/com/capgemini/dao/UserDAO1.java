package com.capgemini.dao;

import java.util.List;

import com.capgemini.jdbc.beans.UserBean;

public interface UserDAO1 {
	//public List<UserBean> getAllInfo();
	//public UserBean getInfo();


	public UserBean1 getInfo(int userid);
	public UserBean1 UserLogin(String user,String password);
	

}
