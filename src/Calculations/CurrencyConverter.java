package Calculations;

import java.util.Scanner;

public class CurrencyConverter {
Scanner sc;
	
	private double priceDollar;
	private double dollarBuy;
	
	
	public double getPriceDollar() {
		return priceDollar;
	}

	public void setPriceDollar(double priceDollar) {
		this.priceDollar = priceDollar;
	}

	public double getDollarBuy() {
		return dollarBuy;
	}

	public void setDollarBuy(double C) {
		this.dollarBuy = dollarBuy;
	}

	
	
	public double dollarPrice(double priceDollar) {
		return priceDollar;
	}
	
	public double  buyDollar(double dollarBuy) {
		return dollarBuy;
	}
	
	public double converterDollar(double priceDollar, double dollarBuy) {
		return priceDollar * dollarBuy;
	}
}
