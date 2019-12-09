package com.capgemini.jdbc.dao;

import java.util.List;

import com.capgemini.jdbc.beans.UserBean;

public interface UserDAO {
	public List<UserBean> getAllInfo();
	//public UserBean getInfo();


	public UserBean getInfo(int userid);
	public UserBean userLogin(int userId,String password);
	

}
