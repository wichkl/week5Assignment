package week5CodingAssignment;

public class AsteriskLogger implements Logger {
	//have to add unimplemented methods from the interface
	//implement variables for AsteriskLogger method
	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
	}

	@Override
	public void error(String errorMessage) {
		System.out.println("********************");
		System.out.println("***Error: " + errorMessage + "***");
		System.out.println("********************");
	}
}