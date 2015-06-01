package lab.aikibo.testsuite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit2 {
	
	String message = "Robert";
	MessageUtil mu = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, mu.salutationMessage());
	}

}
