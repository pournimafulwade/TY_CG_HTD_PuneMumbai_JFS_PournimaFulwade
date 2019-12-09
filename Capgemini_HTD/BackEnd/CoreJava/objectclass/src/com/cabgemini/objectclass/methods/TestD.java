package com.cabgemini.objectclass.methods;

public class TestD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cow c = new Cow();
		c.id = 1;
		c.name = "ganga";
		c.height=45.3;
		
		Cow e = new Cow();
		e.id = 2;
		e.name = "tunga";
		e.height=46.3;
		
		Cow r = new Cow();
		r.id = 1;
		r.name = "ganga";
		r.height=44.3;
		
		Cow a = new Cow();
		a.id = 1;
		a.name = "ganga";
		a.height=45.3;
		
		
		System.out.println(c.equals(e));
		System.out.println(c.equals(r));
		System.out.println(c.equals(a));

	}

}
