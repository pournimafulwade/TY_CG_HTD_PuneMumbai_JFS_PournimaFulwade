package com.capgemini.jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class GetInfo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		/*
		 * System.out.println("Enter UserId"); 
		 * int i = s.nextInt();
		 * System.out.println("Enter password"); 
		 * String p = s.next();
		 *  UserBean user =dao.userLogin(i,p);
		 */
		List<UserBean> userlist = dao.getAllInfo();
		//UserBean user1 = dao.getInfo(s.nextInt());
		
		if(userlist != null) {
			for(UserBean user: userlist) {
				System.out.println(user);
			}
			//System.out.println(user);
		} else {
			System.out.println("Something went Wrong");
	}
	}

}
