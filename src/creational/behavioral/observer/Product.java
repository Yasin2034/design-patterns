package creational.behavioral.observer;

import java.util.ArrayList;

public class Product implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();

	private String name;
	private boolean availability;
	


	public Product(String name, boolean availability) {
		this.name = name;
		this.availability = availability;
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(name + " is avaible");
		}
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
		if (availability)
			notifyObservers();
	}

}
