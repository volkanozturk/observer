package org.volkanozturk.observer;

public class Corporate implements User{

	private final static int INVESTMENT_FACTOR = 9;

	@Override
	public void update(int price) {

		System.out.println("I am a corporate, and I will invest " + price * INVESTMENT_FACTOR);


	}
}
