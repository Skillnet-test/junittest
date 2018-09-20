package tutorialspoint;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class TestJunit {
	/*@Test
	
	   public void testAdd() {
	      String str = "Junit is working fine";
	      assertEquals("Junit is working fine",str);
	   }*/
	
	
	   String message = "Hello World";	
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {
		   message="New World";
	      assertEquals(message,messageUtil.printMessage());
	   }
	
	
	

}
