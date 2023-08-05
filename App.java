package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		//instantiate both asterisklogger and spacedlogger here
		//testing both methods, log and error, on both instances
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Hello");
		asteriskLogger.error("Invalid");
		
		spacedLogger.log("Hello");
		spacedLogger.log("Invalid");

	}

}
