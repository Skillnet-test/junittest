package tutorialspoint;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result result = JUnitCore.runClasses(TestJunit2.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
		

	}

}