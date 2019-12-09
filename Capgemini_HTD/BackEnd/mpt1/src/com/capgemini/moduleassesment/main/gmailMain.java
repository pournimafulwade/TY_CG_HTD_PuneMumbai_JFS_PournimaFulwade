package com.capgemini.moduleassesment.main;

import java.util.Scanner;

import com.capgemini.moduleassesment.dao.userDAO;
import com.capgemini.moduleassesment.factory.userFactory;

public class gmailMain {

	public static void main(String[] args) {
		userDAO obj = userFactory.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 to LOGIN");
		System.out.println("press 2 to REGISTER");
		
		System.out.println("\nselect the number and enter it");
		int button = Integer.parseInt(sc.nextLine());

 if (button == 1) {
					System.out.println("Enter A to COMPOSE MAIL");
					System.out.println("Enter B SHOW INBOX");
					
					System.out.println("enter the key");
					String mailchar = sc.nextLine();

					if (mailchar.equals("A")) {
						System.out.println("enter the userName:");
					String userName = sc.nextLine();

					System.out.println("enter the PASSWORD:");
					String password = sc.nextLine();
							                       
						
						userDAO obj1 = obj.composeMail(userName,password
								);
					} else if (mailchar.equals("B")) {
						System.out.println("enter the userName:");
						String userName = sc.nextLine();

						System.out.println("enter the PASSWORD:");
						String password = sc.nextLine();

						userDAO obj2 = obj.showInbox(userName, password);

					} else {
						System.out.println("Please enter correct character");
					}
}
 if(button==2)
 {
	 System.out.println("first register yoursefl");
	 System.out.println("enter the username:");
	 String userName = sc.nextLine();
	 System.out.println("enter the password");
	 String password = sc.nextLine();
	 
	 userDAO obj3 = obj.register(userName,password);
 }


		
	}



}
