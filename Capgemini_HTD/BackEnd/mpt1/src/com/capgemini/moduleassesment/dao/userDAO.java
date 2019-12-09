package com.capgemini.moduleassesment.dao;

public interface userDAO {
	public userDAO register(String userName,String passWord);
	public userDAO composeMail(String eMail,String passWord);
	public userDAO showInbox(String eMail,String passWord );

}
