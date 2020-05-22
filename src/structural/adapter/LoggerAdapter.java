package structural.adapter;

public class LoggerAdapter implements ILogger {

	LoggerY loggerY;
	
	public LoggerAdapter(LoggerY logger) {
		this.loggerY = logger;
	}
	
	
	public void log() {
		loggerY.infoY();
	}

	
}
