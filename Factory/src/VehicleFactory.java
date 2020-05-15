
public class VehicleFactory {

	public static IVehicle produceVehicle(String type) {
		if(type.equalsIgnoreCase("Car")) return new Car();
		else if(type.equalsIgnoreCase("Truck")) return new Truck();
		else if(type.equalsIgnoreCase("MotorCycle")) return new MotorCycle();
		return null;
	}
}
