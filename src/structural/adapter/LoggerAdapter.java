package structural.adapter;

public class LoggerYAdapter implements ILogger {

	LoggerY loggerY;
	
	public LoggerYAdapter(LoggerY logger) {
		this.loggerY = logger;
	}
	
	
	public void log() {
		loggerY.infoY();
	}

	
}
