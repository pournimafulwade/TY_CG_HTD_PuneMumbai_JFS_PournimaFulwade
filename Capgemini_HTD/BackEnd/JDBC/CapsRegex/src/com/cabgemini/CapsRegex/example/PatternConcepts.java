package com.cabgemini.CapsRegex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcepts {
	
	
	public static void main(String[] args) {
		
		Pattern pat = Pattern.compile("\\d"); // this pat only check for single digit
		Matcher matcher = pat.matcher("1");
		System.out.println("pattern \\d: "+matcher.matches());
		
		pat = Pattern.compile("\\d+");   // pattern to take one or more than one digit
		matcher = pat.matcher("2542587255");
		System.out.println("patttern \\d+: "+matcher.matches());
		
		pat = Pattern.compile("\\d{0}");   // pattern to take exact number of digits which is mention in flower braces
		matcher = pat.matcher("");
		System.out.println("patttern \\d{x}: "+matcher.matches());
		
		pat = Pattern.compile("\\d{1,9}");   // pattern to take number of digits within the range
		matcher = pat.matcher("1234567890");
		System.out.println("patttern \\d{x,y}: "+matcher.matches());
		matcher = pat.matcher("12345678901");
		System.out.println("patttern \\d{x,y}: "+matcher.matches());
		
		pat = Pattern.compile("\\D");// this check for given input is not a digit it can be anything but it shold be single
		matcher = pat.matcher("S");
		System.out.println("pattern \\D: "+matcher.matches());
		matcher = pat.matcher("Sfgg");
		System.out.println("pattern \\D: "+matcher.matches());
		
		pat = Pattern.compile("\\D+");// this check for given input is not a digit it can be anything
		matcher = pat.matcher("Snehal");
		System.out.println("pattern \\D+: "+matcher.matches());
		
		pat = Pattern.compile("\\s");// this takes for the single space
		matcher = pat.matcher(" ");
		System.out.println("pattern \\s take single space: "+matcher.matches());
		
		pat = Pattern.compile("\\s+");// this takes for the multiple space
		matcher = pat.matcher("  ");
		System.out.println("pattern \\s+ take multiple space: "+matcher.matches());
		
		pat = Pattern.compile("\\S");// this takes anything than single space
		matcher = pat.matcher(" ");
		System.out.println("pattern \\S take anything single other than single space: "+matcher.matches());
		
		pat = Pattern.compile("\\S+");// this takes for the single space
		matcher = pat.matcher("Snehal");
		System.out.println("pattern \\S+ take anything other than Space: "+matcher.matches());
		
		pat = Pattern.compile("\\W");// it takes single special character and space but not char n digit
		matcher = pat.matcher("#");
		System.out.println("pattern \\W :take anything other than character "+matcher.matches());
		
		pat = Pattern.compile("\\W+");//it takes multiple special char n space
		matcher = pat.matcher("@#$@%");
		System.out.println("pattern \\W+ takes multiple special char n spacesa: "+matcher.matches());
		
		pat = Pattern.compile("\\w");  // take String type argument and only check for the single character
		matcher = pat.matcher("1");
		System.out.println("pattern \\w take string type input but only single : "+matcher.matches());
		
		pat = Pattern.compile("\\w+");   //  check for more than one character
		matcher = pat.matcher("1234");
		System.out.println("pattern \\w+ take more than one character(also digits): "+matcher.matches());
	}
	

}
