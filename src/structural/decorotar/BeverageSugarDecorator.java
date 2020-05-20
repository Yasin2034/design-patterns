package structural.decorotar;

public class BeverageSugarDecorator extends BeverageDecorator {

	public BeverageSugarDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double getCost() {
		return beverage.getCost()+0.35;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+" + sugar";
	}
}
