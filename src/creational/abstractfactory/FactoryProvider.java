package creational.abstractfactory;

public class FactoryProvider {

	public static CountryFactory createFactory(FactoryType type) {
		switch (type) {
		case GERMAN:
			return new GermanCountryFactory();
		case TURKISH:
			return new TurkishCountryFactory();
		default:
			return null;
		}
	}
}
