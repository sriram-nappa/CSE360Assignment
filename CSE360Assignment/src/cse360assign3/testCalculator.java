package cse360assign3;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author Sriram Poondi Chinappa 
 * @pin 706
 * @ID 1209360616
 * 
 */
public class testCalculator {

	@Test
	public void Calculator_Test() {
		Calculator cal = new Calculator();
		assertNotNull(cal);
	}
	
	@Test
	public void getTotal_Test() {
		Calculator cal = new Calculator();
		cal.add(5);
		cal.subtract(2);
		assertEquals("Total : ", 3,  cal.getTotal());
	}
	
	@Test
	public void add_Test() {
		Calculator cal = new Calculator();
		cal.add(5);
		cal.add(-1);
		assertNotEquals(6, cal.getTotal());
		assertEquals("Total after Add() : ", 4, cal.getTotal());
	}
	
	@Test
	public void subtract_Test() {
		Calculator cal = new Calculator();
		cal.subtract(5);
		cal.subtract(-5);
		assertNotEquals(10, cal.getTotal());
		assertEquals("Total after Subtract() : ", 0, cal.getTotal());
	}
	
	@Test
	public void multiply_Test() {
		Calculator cal = new Calculator();
		cal.add(5);
		cal.multiply(6);
		assertNotEquals(11, cal.getTotal());
		assertEquals("Total after Multiply() : ", 30, cal.getTotal());
	}
	
	@Test
	public void divide_Test() {
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
		Calculator cal = new Calculator();
		cal.add(5);
		cal.divide(0);
		assertEquals("Total after Divide by 0 :", 0, cal.getTotal());
	}
	
	@Test
	public void getHistory_Test() {
		fail("Not yet implemented");
	}
	
	
}