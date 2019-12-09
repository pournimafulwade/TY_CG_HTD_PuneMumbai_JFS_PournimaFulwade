package com.capgemini.thread;

public class Patym extends Thread {
	PVR ref;
	
	public Patym(PVR r) {

		ref=r;
	}

	public void run()
	{
		ref.confirm();
	}
}
