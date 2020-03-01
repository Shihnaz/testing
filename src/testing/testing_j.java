package testing;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import calcu.Calculator;

public class testing_j {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	
	public void positive() {
		int a = 6;
		int b = 20;
		Calculator calc = new Calculator();
		int result = calc.add(a, b);
		assertTrue(result==26);
	}
	@Test
	  public void negative() {
		int a = -10;
		int b = -20;
		Calculator calc = new Calculator();
		int result = calc.add(a, b);
		assertTrue(result==-30);}
	@Test
	 public  void diffrent() {
		int a = -10;
		int b = 20;
		Calculator calc = new Calculator();
		int result = calc.add(a, b);
		assertTrue(result==10);
	}

	
	
	
	
	
}
