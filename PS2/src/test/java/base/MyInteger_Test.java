package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int n11 = 11;
		int n16 = 16;
		MyInteger m1 = new MyInteger (1);
		MyInteger m11 = new MyInteger (11);
		MyInteger c11 = new MyInteger (11);
		
		assertTrue("Test1 isEven(int) failed",MyInteger.isEven(n11)==false);
		assertFalse("Test1 isEven(int) failed",MyInteger.isEven(n11));
		
		assertTrue("Test1 isOdd(int) failed",MyInteger.isOdd(n11));
		assertTrue("Test2 isOdd(int) failed",MyInteger.isOdd(n16) == false);
		
		assertTrue("Test1 isPrime(int) failed",MyInteger.isPrime(n11));
		assertTrue("Test2 isPrime(int) failed",MyInteger.isPrime(n16) == false);
		
		assertTrue("Test1 MyI.equals(int) failed", m1.equals(n11) == false);
		assertTrue("Test1 MyI.equals(int) failed", m11.equals(n11));
		
		assertTrue("Test1 MyI.equals(MyI) failed", m1.equals(m11) == false);
		assertTrue("Test1 MyI.equals(MyI) failed", m11.equals(c11));
		
	}

}
