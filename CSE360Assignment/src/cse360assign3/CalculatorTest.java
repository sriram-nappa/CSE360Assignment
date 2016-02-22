package cse360assign3;

/**
 * @author Sriram Poondi Chinappa 
 * @pin 706
 * @ID 1209360616
 *
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		// Test for constructor.
		Calculator cal = new Calculator();
		assertNotNull(cal);
	}
	
	@Test
	public void getTotal_Test() {
		// Test for getTotal method.
		Calculator cal = new Calculator();
		cal.add(5);
		cal.subtract(2);
		assertEquals("Total : ", 3,  cal.getTotal());
	}
	
	@Test
	public void add_Test() {
		// Test for add method.
		Calculator cal = new Calculator();
		cal.add(5);
		cal.add(-1);
		assertNotEquals(6, cal.getTotal());
		assertEquals("Total after Add() : ", 4, cal.getTotal());
	}
	
	@Test
	public void subtract_Test() {
		// Test for subtract method.
		Calculator cal = new Calculator();
		cal.subtract(5);
		cal.subtract(-5);
		assertNotEquals(10, cal.getTotal());
		assertEquals("Total after Subtract() : ", 0, cal.getTotal());
	}
	
	@Test
	public void multiply_Test() {
		// Test for multiply method.
		Calculator cal = new Calculator();
		cal.add(5);
		cal.multiply(6);
		assertNotEquals(11, cal.getTotal());
		assertEquals("Total after Multiply() : ", 30, cal.getTotal());
	}
	
	@Test
	public void divide_Test() {
		// Test for divide method.
		Calculator cal = new Calculator();
		cal.add(5);
		cal.divide(5);
		assertNotEquals(0, cal.getTotal());
		assertEquals("Total after Divide() : ", 1, cal.getTotal());
		cal.divide(0);
		assertEquals("Total after Divide by 0 :", 0, cal.getTotal());
	}
	
	@Test
	public void divideByZero_Test() {
		// Test for special case: Divide by Zero must return total as 0.
		Calculator cal = new Calculator();
		cal.add(5);
		cal.divide(0);
		assertEquals("Total after Divide by 0 :", 0, cal.getTotal());
	}

	@Test
	public void getHistory_Test() {
		// Test for getHistory method.
		Calculator cal = new Calculator();
		cal.add(5);
		cal.divide(5);
		cal.subtract(1);
		cal.divide(0);
		cal.add(10);
		cal.multiply(10);
		assertNotNull("History : ", cal.getHistory());
		assertEquals("History : ", "0 + 5 / 5 - 1 / 0 + 10 * 10", cal.getHistory());
		assertEquals("Total : ", 100, cal.getTotal());
	}
}