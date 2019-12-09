package com.capgemini.springcore.annotations.bean;

import com.capgemini.springcore.interfaces.Engine;

public class Volkswagen implements Engine {

	@Override
	public int getCC() {
		return 1800;
	}

	@Override
	public String getType() {
		return " Volkswagen 4-Stroke Diesel";
	}
}
