package com.training.hackerrank;

public class ChocolateFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amount = 0;
		int cost = 0;
		int wrappersToExchange = 0; 
		int noOfChocolates = getChocolates(amount, cost, wrappersToExchange);
		System.out.println(noOfChocolates);
	}

	private static int getChocolates(int amount, int cost, int wrappersToExchange) {
		int chocolates  = amount / cost ;
		
//		int wrappersCount = chocolates / wrappersToExchange;
//		int wrappersRemainder = chocolates % wrappersToExchange;
		
		
		
		
		
		
		return chocolates;
	}

}
