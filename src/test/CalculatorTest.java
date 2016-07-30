package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	
	@BeforeClass
	public static void beforeClassExample()  {
		System.out.println("Wykona sie raz przed wszystkimi testami");
	}
	
	@AfterClass
	public static void afterClassExample() {
		System.out.println("Wykona sie raz po wszystkich testach");
	}
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testSum() throws Exception {
		double z1 = 1.9;
		double z2 = 1.5;
		
		double wynik = classUnderTest.sum(z1, z2);
		
		Assert.assertEquals(3.4, wynik, 0.00001);
	}

}
