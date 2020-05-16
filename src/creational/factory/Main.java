package creational.factory;

public class Main {

	public static void main(String[] args) {
		
		IVehicle truck = VehicleFactory.produceVehicle("Truck");
		IVehicle motorCycle = VehicleFactory.produceVehicle("MotorCycle");
		
		truck.getType();
		motorCycle.getType();
	}

}
