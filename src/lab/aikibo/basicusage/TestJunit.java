package lab.aikibo.basicusage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lab.aikibo.util.MessageUtil;

public class TestJunit {
	
	String message = "Hello world";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		assertEquals(message, messageUtil.printMessage());
	}

}
