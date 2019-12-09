package com.capgemini.springcore.annotations.bean;

import com.capgemini.springcore.interfaces.Engine;

public class ISuzu implements Engine {

	@Override
	public int getCC() {
		return 1700;
	}

	@Override
	public String getType() {
		return "ISuzu4-Stroke Petrol";
	}
}//end of the class
