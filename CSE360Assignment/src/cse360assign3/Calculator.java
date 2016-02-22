package cse360assign3;

/**
 * Final Version of calculator class contains seven stub methods including
 * a constructor. Methods add, subtract, multiply and divide are used for 
 * performing arithmetic operations between the total variable and the value
 * passed as parameter to the methods. It also contains getHistory method which
 * returns the operations performed in a string as history of calculation.
 * 
 * @author Sriram Poondi Chinappa 
 * @pin 706
 * @ID 1209360616
 * 
 */

public class Calculator {

	private int total;
	private String result = "0";
	
	public Calculator () {
	// Constructor for the Calculator class.
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
	// This method returns total value.
		return total;
	}
	
	public void add (int value) {
	// This method adds the total with the value which is passed as a parameter.
		result += " + " + Integer.toString(value);
		total = total + value;
	}
	
	public void subtract (int value) {
	// This method subtracts value from total.
		result += " - " + Integer.toString(value);
		total = total - value;
	}
	
	public void multiply (int value) {
	// This method performs multiplication between total and value.
		result += " * " + Integer.toString(value);
		total = total * value;
	}
	
	public void divide (int value) {
	// This method performs division operation which divides the total by the parameter "value".
		result += " / " + Integer.toString(value);
		total = (value == 0) ? 0 : total / value;
	}
	
	public String getHistory () {
	// This method returns the history of arithmetic operations performed during calculation.
		return result;
	}
}