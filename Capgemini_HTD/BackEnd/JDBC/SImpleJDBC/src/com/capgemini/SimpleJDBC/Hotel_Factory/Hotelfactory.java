package com.capgemini.SimpleJDBC.Hotel_Factory;

import com.capgemini.SimpleJDBC.Hotel_Implimentation.Hotelimplementation;
import com.capgemini.SimpleJDBC.Hotel_Interface.Hotelinterface;

public class Hotelfactory {
	private Hotelfactory()
	{
		
	}//end of constructor
	
	public static Hotelinterface getInstance()
	{
		Hotelinterface hiobj = new Hotelimplementation();
		return hiobj;
	}//end of getInstance method
}//end oc class
