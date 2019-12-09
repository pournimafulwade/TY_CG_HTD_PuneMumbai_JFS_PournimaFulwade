package com.capgemini.capgeminilogin.dao;

import com.capgemini.capgeminilogin.beans.UserBean;

public interface UserDAO {
	public UserBean getInfo(int userid , String password) ;

}
