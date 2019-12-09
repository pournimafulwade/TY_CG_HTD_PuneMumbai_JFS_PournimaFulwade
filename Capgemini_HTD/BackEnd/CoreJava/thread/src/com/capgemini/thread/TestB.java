package com.capgemini.thread;

public class TestB {

	public static void main(String[] args) {
		PVR a = new PVR();
		
		Paytm p = new Paytm(a);
		p.start();
		Paytm t = new Paytm(a);
		t.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.leaveMe();

	}

}
