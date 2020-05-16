package creational.abstractfactory;

public class Main {

	public static void main(String[] args) {
		CountryFactory turkishFactory = FactoryProvider.createFactory(FactoryType.TURKISH);
		City turkishCity = turkishFactory.createCity();
		Citizen turkishcitizen = turkishFactory.createCitizen();
		
		CountryFactory germanFactory = FactoryProvider.createFactory(FactoryType.GERMAN);
		City germanCity  = germanFactory.createCity();
		Citizen germanCitizen = germanFactory.createCitizen();
		
		
		turkishCity.getName();
		turkishcitizen.getCitizen();
		germanCity.getName();
		germanCitizen.getCitizen();
	}

}
