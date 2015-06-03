package lab.aikibo.ignoretest;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestJunit {
	
	String message = "Robert";
	MessageUtil mu = new MessageUtil(message);
	
	@Ignore
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = "Robert";
		assertEquals(message, mu.printMessage());
	}
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, mu.salutationMessage());
	}

}
