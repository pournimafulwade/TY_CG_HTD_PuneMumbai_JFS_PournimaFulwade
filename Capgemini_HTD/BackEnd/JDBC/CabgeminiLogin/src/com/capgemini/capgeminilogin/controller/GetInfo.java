package com.capgemini.capgeminilogin.controller;

import java.util.Scanner;

import com.capgemini.capgeminilogin.beans.UserBean;
import com.capgemini.capgeminilogin.dao.UserDAO;
import com.capgemini.capgeminilogin.factory.UserFactory;

public class GetInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		System.out.println("Enter the userid and password :");
		UserBean user =dao.getInfo(sc.nextInt(), sc.nextLine());
		if(user!=null)
		{
			System.out.println(user);
		}
		else
		{
			System.out.println("something went wrong");
		}
		sc.close();
	}

}
