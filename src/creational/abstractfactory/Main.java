package creational.abstractfactory;

public class Main {

	public static void main(String[] args) {

		countryBuild(FactoryProvider.createFactory(FactoryType.TURKISH));
		System.out.println("---------------------------");
		countryBuild(FactoryProvider.createFactory(FactoryType.GERMAN));
	}

	public static void countryBuild(CountryFactory countryFactory) {
		City countryCity = countryFactory.createCity();
		Citizen citizenOfCountry = countryFactory.createCitizen();
		countryCity.getName();
		citizenOfCountry.getCitizen();
	}
}
