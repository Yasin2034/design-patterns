package structural.decorator;


public class Main {

	public static void main(String[] args) {
		Beverage iceCoffee = new BeverageIceDecorator(new Coffee());
		Beverage iceAndSugarTea = new BeverageIceDecorator(new BeverageSugarDecorator(new Tea()));
		
		System.out.println(iceCoffee.getDescription());
		System.out.println(iceAndSugarTea.getDescription());
	}

}
