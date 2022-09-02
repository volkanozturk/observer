package org.volkanozturk.observer;

import java.util.ArrayList;
import java.util.List;

public class Bitcoin {

	List<User> users = new ArrayList<>();
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		this.notifyObservers();
	}

	public void subscribe(User user){
		this.users.add(user);
	}

	public void unsubscribe(User user) {
		this.users.remove(user);
	}

	private void notifyObservers(){
		for(User u : this.users){
			u.update(this.getPrice());
		}
	}

}
