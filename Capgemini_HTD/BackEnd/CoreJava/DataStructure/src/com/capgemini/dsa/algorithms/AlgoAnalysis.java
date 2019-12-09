package com.capgemini.dsa.algorithms;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {

	public static void main(String[] args) {
//		long number = 999999L;
//		System.out.println(addUpto(number));
//		System.out.println(addUptoQuick(number));
		countingDuration2();
		countingDuration1();

		
	}// end of the main()

	public static long addUpto(Long number) {
		long total = 0L;
		for (long i = 0; i <= number; i++) {
			total = total + i;
		} // end of the for loop
		return total;
	}// end of the addUpto()

	public static long addUptoQuick(Long number) {
		return number * (number + 1) / 2;
	}// end of the addUptoQuick()

	public static void countingDuration1() {
		long number = 9999999999L;
		Instant start = Instant.now();
		System.out.println("addUpto : " + addUpto(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("addUpto time = " + seconds + "seconds");
	}//end of thecountingDuration1()
	
	public static void countingDuration2() {
		long number = 9999999999L;
		Instant start = Instant.now();
		System.out.println("addUptoQuick : " + addUptoQuick(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("addUptoQuick time = " + seconds + "seconds");
	}//end of thecountingDuration1()
}// end of the class
