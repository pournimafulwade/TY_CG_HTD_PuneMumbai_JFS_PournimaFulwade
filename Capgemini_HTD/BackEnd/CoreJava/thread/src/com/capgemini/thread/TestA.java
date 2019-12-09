package com.capgemini.thread;

public class TestA {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Pen p = new Pen();
		p.start();
		try {
			p.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Pen t = new Pen();
		t.start();
		try {
			p.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("Main Ended");
		
	}

}
