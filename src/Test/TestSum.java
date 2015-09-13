package Test;

import junit.framework.TestCase;

public class TestSum extends TestCase {
	public void testsum(){
		TestJunit test1 = new TestJunit();
		int result = test1.sum(4, 5);
		assertEquals(9, result);
	}
}
