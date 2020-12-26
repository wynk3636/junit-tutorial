package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	@Test
	public void test() {
		fail("not create");
	}
	
	@Test
	public void multiplyTest() {
		Calculator calc = new Calculator();
		
		int expected = 12;
		int actual = calc.multiply(3, 4);
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void multiplyTestError() {
		Calculator calc = new Calculator();
		
		int expected = 12;
		int actual = calc.multiply(5, 7);
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void divideTest() {
		Calculator calc = new Calculator();
		
		float expected = 1.5f;
		float actual = calc.divide(3, 2);
		
		assertThat(actual, is(expected));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void devideTest0Error() {
		Calculator calc = new Calculator();
		
		calc.divide(5, 0);
	}
	
}
