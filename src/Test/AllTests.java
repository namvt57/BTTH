package Test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for Test");
		//$JUnit-BEGIN$
		suite.addTestSuite(TestCountCharAt.class);
		suite.addTestSuite(TestSum.class);
		//$JUnit-END$
		return suite;
	}

}
