package org.volkanozturk.observer;

public class Trader implements User{

	private final static int INVESTMENT_FACTOR = 5;

	@Override
	public void update(int price) {
		System.out.println("I am a trade, and I will invest " + price * INVESTMENT_FACTOR);


	}
}
