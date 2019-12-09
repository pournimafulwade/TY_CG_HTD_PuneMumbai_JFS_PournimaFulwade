package com.capgemini.set.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
	
	private static final Scanner sc =new Scanner(System.in) ;

	public static void main(String[] args) {
		MyStudentApp my = new MyStudentApp();
		while(true)
		{
		System.out.println( "Enter your option \n 1.add the values \n2.display the values \n3.exit ");
		int opt =sc.nextInt();
		
		switch(opt)
		{
		case 1 :my.add();
		break;
		case 2 :my.display();
		break;
		case 3 :System.exit(0);
		break;
		default :
			System.out.println("enter valid option");
		}
		}
		
		
	}

}
