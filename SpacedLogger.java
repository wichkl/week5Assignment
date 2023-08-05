package week5CodingAssignment;

public class SpacedLogger implements Logger {
	//have to add unimplemented methods from the interface
	//implement variables for SpacedLogger method
	@Override
	public void log(String message) {
		StringBuilder spacedMessage = new StringBuilder();
		//run a enhanced for-loop to turn string into chararray to separate each letter and append spaces between each
		for (char c : message.toCharArray()) {
			spacedMessage.append(c).append(" ");
		}
		System.out.println(spacedMessage);
		
	}

	@Override
	public void error(String errorMessage) {
		System.out.println("ERROR: ");
		//reusing the log method to create the spaced out error message
		log(errorMessage);
		
	}
	
}
