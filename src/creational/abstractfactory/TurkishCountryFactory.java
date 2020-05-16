package creational.abstractfactory;

public class TurkishCountryFactory implements CountryFactory {

	public Citizen createCitizen() {
		return new TurkishCitizen();
	}

	public City createCity() {
		return new TurkishCity();
	}

}
