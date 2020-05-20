package structural.decorotar;

public class BeverageIceDecorator extends BeverageDecorator{

	public BeverageIceDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+" + ice";
	}

	@Override
	public double getCost() {
		return getCost()+0.15;
	}

}
