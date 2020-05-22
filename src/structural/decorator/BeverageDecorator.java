package structural.decorator;

public abstract class BeverageDecorator implements Beverage {

	protected Beverage beverage;
	
	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}


    public abstract String getDescription();


	public abstract double getCost();
	
	
	
}
