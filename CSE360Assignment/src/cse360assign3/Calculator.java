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

	/*
	* Constructor for the Calculator class.
	*/
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/*
	*  This method returns total value.
	*/
	public int getTotal () {
		return total;
	}
	
	/*
	*  This method adds the total with the value which is passed as a parameter.
	*  @param value - value that needs to be added to the total.
	*/
	public void add (int value) {
		result += " + " + Integer.toString(value);
		total = total + value;
	}
	
	/*
	*  This method subtracts value from total.
	*  @param value - value that needs to be subtracted from total.
	*/
	public void subtract (int value) {
		result += " - " + Integer.toString(value);
		total = total - value;
	}
	
	/*
	*  This method performs multiplication between total and value.
	*  @param value - value that needs to be multiplied by the total.
	*/
	public void multiply (int value) {
		result += " * " + Integer.toString(value);
		total = total * value;
	}
	
	/*
	*  This method performs division operation which divides the total by the parameter "value".
	*  @param value - value that needs to be divided from the total.
	*/
	public void divide (int value) {
		result += " / " + Integer.toString(value);
		total = (value == 0) ? 0 : total / value;
	}
	
	/*
	*  This method returns the history of arithmetic operations performed during calculation.
	*/
	public String getHistory () {
		return result;
	}
}
