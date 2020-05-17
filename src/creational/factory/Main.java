package creational.factory;

public class Main {

	public static void main(String[] args) {
		
		IVehicle truck = VehicleFactory.produceVehicle(VehicleType.TRUCK);
		IVehicle motorCycle = VehicleFactory.produceVehicle(VehicleType.MOTORCYCLE);
		
		truck.getType();
		motorCycle.getType();
	}

}
