package lab.aikibo.testframework;

import org.junit.Test;

import lab.aikibo.util.MessageUtil;
import static org.junit.Assert.assertEquals;

public class TestJunit2 {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}

}
