package lab.aikibo.execTest;

public class MessageUtil {
	
	private String message;
	
	// constructor
	// @param message to be printed
	public MessageUtil(String message) {
		this.message = message;
	}
	
	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}

}
