package com.capgemini.Sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class BAnkTree {

	public static void main(String[] args) {
		 ByPin com = new ByPin();
		 ByName comname = new ByName();
		 ByMirc commicr = new ByMirc();
		
		 
		TreeSet<Bank> tr = new TreeSet<Bank>(commicr);
		
		Bank e1 = new Bank(123,"MAYURI",223344l);
		Bank e2 = new Bank(245,"Ramesh",56745123l);
		Bank e3 = new Bank(3547,"Vidya",324795l);
		Bank e4 = new Bank(4547,"Rohit",486584l);
		
		tr.add(e1);
		tr.add(e2);
		tr.add(e3);
		tr.add(e4);
		
		Iterator<Bank> b = tr.iterator();
		while(b.hasNext()) {
			Bank s = b.next();
			System.out.println("Pin is :"+s.pin);
			System.out.println("Name is :"+s.name);
			System.out.println("MICR :"+s.micr);
			
		}
	}

}
