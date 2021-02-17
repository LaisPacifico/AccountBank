package Calculations;

import java.util.Locale;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		CurrencyConverter converter = new CurrencyConverter();
		
		System.out.println("What is the dollar price?");
		double price = sc.nextDouble();
		converter.dollarPrice(price);
		System.out.println("How many dollars will be bought?");
		double buy = sc.nextDouble();
		converter.buyDollar(buy);
		
		
		System.out.println(converter.converterDollar(price, buy));

	}

}
