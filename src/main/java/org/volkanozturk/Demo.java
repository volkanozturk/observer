package org.volkanozturk;

import org.volkanozturk.observer.Bitcoin;
import org.volkanozturk.observer.Corporate;
import org.volkanozturk.observer.Trader;

public class Demo {
	public static void main(String[] args) {

		Bitcoin bitcoin = new Bitcoin();

		Trader trader = new Trader();
		Corporate corporate = new Corporate();

		bitcoin.subscribe(trader);
		bitcoin.subscribe(corporate);
		bitcoin.setPrice(32);

		System.out.println("---------------------");
		bitcoin.unsubscribe(trader);
		bitcoin.setPrice(10);



	}
}
