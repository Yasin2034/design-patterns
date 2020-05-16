package creational.abstractfactory;

public class GermanCountryFactory implements CountryFactory {

	public Citizen createCitizen() {
		return new GermanCitizen();
	}

	public City createCity() {
		return new GermanCity();
	}

}
