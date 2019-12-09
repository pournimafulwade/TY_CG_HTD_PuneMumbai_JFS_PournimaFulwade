package com.capgemini.sorting;

import java.util.Iterator;
import java.util.TreeSet;

public class BankTest {
	
	public static void main(String[] args) {
		ByPin bp = new ByPin();
		ByName bn = new ByName();
		ByMirc bm = new ByMirc();
		TreeSet<Bank> ts = new TreeSet<Bank>(bm);
		
		Bank b1 =new Bank(11234,"HDFC",98765442l);
		Bank b2 =new Bank(33452,"SBI",96475856l);
		Bank b3 =new Bank(99876,"ICICI",2349576l);
		Bank b4 =new Bank(44536,"BOI",23097563l);
		Bank b5 =new Bank(88765,"Axis",9536473l);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		Iterator<Bank> it =ts.iterator();
		while(it.hasNext())
		{
			Bank b = it.next();
			System.out.println("PIN : "+b.pin);
			System.out.println("name : "+b.name);
			System.out.println("MICR : "+b.micr);
			System.out.println("----------------------");
		}
		
	}

}
