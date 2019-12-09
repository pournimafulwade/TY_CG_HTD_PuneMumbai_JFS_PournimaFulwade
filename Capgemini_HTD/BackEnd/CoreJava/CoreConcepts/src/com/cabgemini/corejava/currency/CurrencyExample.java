package com.cabgemini.corejava.currency;

import java.util.Currency;
import java.util.Set;

public class CurrencyExample {

	public static void main(String[] args) {

		Currency currencyCode1 =Currency.getInstance("INR");
		Currency currencyCode2 =Currency.getInstance("USD");
		
		String currencyCode1Symbol =currencyCode1.getSymbol();
		String currencyCode2Symbol =currencyCode2.getSymbol();

		System.out.println("Symbol for USD :"+currencyCode2Symbol);
		System.out.println("Symbol for INR :"+currencyCode1Symbol);
		System.out.println("*****************************************");
		
		String  currencyCode1Name = currencyCode1.getDisplayName();
		String currencyCode2Name =currencyCode2.getDisplayName();
		
		System.out.println("Display Name for INR : "+currencyCode1Name);
		System.out.println("Display anme for USD : "+currencyCode2Name);
		System.out.println("*********************************************");
		
		Set<Currency> currencies = Currency.getAvailableCurrencies();
		System.out.println(currencies);
		System.out.println("*************************************");
		
		int currencyCode1DefaultFraction = currencyCode1.getDefaultFractionDigits();
		int currencyCode2DefaultFraction = currencyCode2.getDefaultFractionDigits();
		
		System.out.println("Default Fraction Digits for INR : "+currencyCode1DefaultFraction);
		System.out.println("Default Fraction Digits for USD : "+currencyCode2DefaultFraction);
		System.out.println("*********************************************");


	}

}
