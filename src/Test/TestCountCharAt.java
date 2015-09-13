package Test;

import junit.framework.TestCase;

public class TestCountCharAt extends TestCase {
	public void testsum(){
		TestJunit test1 = new TestJunit();
		int result = test1.countCharAt("Ireport is...");
		assertEquals(2, result);
	}
}
