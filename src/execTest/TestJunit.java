package execTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	
	String message = "Hello world";
	MessageUtil mu = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		assertEquals(message, mu.printMessage());
	}

}
