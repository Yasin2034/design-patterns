package structural.adapter;

public class Main {

	public static void main(String[] args) {
		
		ILogger logger = new LoggerX();
		logger.log();
		
		
		
		logger = new LoggerAdapter(new LoggerY());
		logger.log();

	}

}
