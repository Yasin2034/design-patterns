package creational.behavioral.observer;

public class Customer implements Observer {

	private String name;
	
	public Customer(String name) {
		this.name = name;
	}

	public void update(String message) {
		System.out.println("Hello " + getName()+", " + message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
