package creational.factory;

public class VehicleFactory {

	public static IVehicle produceVehicle(VehicleType type) {
		switch (type) {
		case CAR:
			return new Car();
		case TRUCK:
			return new Truck();
		case MOTORCYCLE:
			return new MotorCycle();
		default:
			throw new IllegalArgumentException();
		}
	}
}
