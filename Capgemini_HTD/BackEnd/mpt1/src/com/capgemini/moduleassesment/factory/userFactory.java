package com.capgemini.moduleassesment.factory;

import com.capgemini.moduleassesment.dao.userDAO;
import com.capgemini.moduleassesment.dao.userDAOImple;

public class userFactory {


		



		private userFactory()
		{
			
		}
		
		public static userDAO getInstance()
		{
			userDAO user = new userDAOImple();
			return user;
		}
	}

	


