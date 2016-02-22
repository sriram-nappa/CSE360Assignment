package cse360assign3;

/**
 * This Version of calculator class contains seven stub methods including
 * a constructor. Methods add, subtract, multiply and divide are used for 
 * performing arithmetic operations between the total variable and the value
 * passed as parameter to the methods.
 * 
 * @author Sriram Poondi Chinappa 
 * @pin 706
 * @ID 1209360616
 * 
 */

public class Calculator {

	private int total;
	
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
		total = total + value;
	}
	
	public void subtract (int value) {
	// This method subtracts value from total.
		total = total - value;
	}
	
	public void multiply (int value) {
	// This method performs multiplication between total and value.
		total = total * value;
	}
	
	public void divide (int value) {
	// This method performs division operation which divides the total by the parameter "value".
		total = (value == 0) ? 0 : total / value;
	}
	
	public String getHistory () {
		return "";
	}
}