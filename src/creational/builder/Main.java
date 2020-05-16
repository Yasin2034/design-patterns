package creational.builder;

public class Main {

	public static void main(String[] args) {
		House house = new House.HouseBuilder()
				.numBedrooms(1)
				.kitchenPresent(true).build();
		House house2 = new House.HouseBuilder().build();
        
        System.out.println(house);
        System.out.println(house2);
	}

}
