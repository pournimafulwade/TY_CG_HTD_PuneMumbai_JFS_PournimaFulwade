package com.capgemini.exrej;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcepts {

	public static void main(String[] args) {
		Pattern  pat = Pattern.compile("\\d"); //will create pattern  and \\d is for single digit input 
		Matcher mat =pat.matcher("1"); //take input that needs to be matched
		System.out.println("For Pattern \\d: "+mat.matches()); //Matches help u to match pattern and input
		
		Pattern p = Pattern.compile("\\d+"); //will take multiple digit as input
		Matcher m = p.matcher("1234");
		System.out.println("For pattern \\d+ :"+m.matches());
		
		Pattern p2 = Pattern.compile("\\d{0}");
		Matcher m2 = p2.matcher("");
		System.out.println("For pattern \\d{0} :"+m2.matches());
		
		Pattern p5 = Pattern.compile("\\d{9}"); //to enter that number of digits only(equal to 10 only)
		Matcher m5 = p5.matcher("123");
		System.out.println("For pattern \\d{9} :"+m5.matches());
		
		
		Pattern p3 =Pattern.compile("\\d{1,6}"); //It will accept values only within range of 1-10, not more than 10,neither less then 1
		Matcher m3= p3.matcher("123456");
		System.out.println("For Pattern \\d{,} :" +m3.matches());
		
		Pattern p4 =Pattern.compile("\\d{1,9}");
		Matcher m4= p4.matcher("0123645");
		System.out.println("For Pattern \\d{1,9} :" +m4.matches());
		
		Pattern  p6 = Pattern.compile("\\D"); //match Anything except digit(Special Characters also) 
		Matcher m6 =p6.matcher("@"); //take input that needs to be matched
		System.out.println("For Pattern \\D: "+m6.matches());
		
		Pattern p7 = Pattern.compile("\\D+"); //To enter String (also accept space)
		Matcher m7 = p7.matcher("MayuriShinde");
		System.out.println("For Pattern \\D+ :"+m7.matches() );
		
		Pattern p8 = Pattern.compile("\\D{1,10}"); //True for character between 1-10(No number accepted)
		Matcher m8 = p8.matcher("mayuri");
		System.out.println("For Pattern \\D{1,10} :"+m8.matches());
		
		Pattern p9 = Pattern.compile("\\s"); //Space 
		Matcher m9 = p9.matcher(" ");
		System.out.println("For Pattern \\s :"+m9.matches());
		
		Pattern p10 = Pattern.compile("\\s+"); //Multiple spaces
		Matcher m10 = p10.matcher("   ");
		System.out.println("For Pattern \\s+ :"+m10.matches());
		
		Pattern p11 = Pattern.compile("\\S"); //single character only, it can be anything except space
		Matcher m11 = p11.matcher("@");
		System.out.println("For Pattern \\S :"+m11.matches());
		
		Pattern p12 = Pattern.compile("\\S+"); //String with Any special Character
		Matcher m12 = p12.matcher("Mayuri12@gmail.com");
		System.out.println("For Pattern \\S+ :"+m12.matches());
		
		Pattern p13 = Pattern.compile("\\w"); //Accept only single char and number (not special char)
		Matcher m13 = p13.matcher("1");
		System.out.println("For Pattern \\w :"+m13.matches());
		
		Pattern p14 = Pattern.compile("\\w+"); //Accept string but not special character and space
		Matcher m14 = p14.matcher("mayuri26shinde");
		System.out.println("For Pattern \\w+ :"+m14.matches());
		
		Pattern p15 = Pattern.compile("\\W"); //Accept only single Special Character
		Matcher m15 = p15.matcher("#");
		System.out.println("For Pattern \\W :"+m15.matches());
		
		
		Pattern p16 = Pattern.compile("\\W+"); //Accept group of Special Character only
		Matcher m16 = p16.matcher("#@!");
		System.out.println("For Pattern \\W+ :"+m16.matches());
		
		
	}
	
	

}
