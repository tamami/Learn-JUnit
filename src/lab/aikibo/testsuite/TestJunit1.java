package lab.aikibo.testsuite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit1 {
	
	String message = "Robert";
	MessageUtil mu = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, mu.printMessage());
	}

}
