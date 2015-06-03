package lab.aikibo.exceptiontest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	
	String message = "Robert";
	MessageUtil mu = new MessageUtil(message);
	
	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		mu.printMessage();
	}
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, mu.salutationMessage());
	}
	
}
