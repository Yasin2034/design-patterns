package creational.behavioral.observer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Customer1");
		Customer customer2 = new Customer("Customer2");
		
		Product product = new Product("Iphone X", false);
		
		product.attach(customer1);
		product.attach(customer2);
		
		product.setAvailability(true);
		
	}

}
