/**
 * Class ID: 70641
 * Assignment 2 
 * Description: This class implements functions to add and subtract the parameter value from the total.
 * 
 * @author Akhil Aji
 * @version 2.0
 * 
 */

package cse360assign2;

/**
 * The class AddingMachine adds and subtracts values from an initial starting value of 0 which is 
 * represented by the total value. This is presented to the user via the toString method.
 * 
 * @author akhilaji
 *
 */
public class AddingMachine {

	/**
	 * Stores the running total value to be returned to user.
	 */
	private int total;
	/**
	 * Stores the history of operations as a string 
	 */
	private String history = "0"; 
	/**
	 * Default constructor for the AddingMachine class.
	 * initializes the total value to 0
	 */
	public AddingMachine () {
		total = 0;  
	}
	
	/**
	 * This is a getter method to return the total.
	 * @return the total value after the operations
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * This method adds a Int value to the total. 
	 * @param This parameter has the value to be added
	 */
	public void add (int value) {
		total += value;
		history += "+" + value;
	}
	
	/**
	 * This method subtracts a Int value from the total
	 * @param This parameter has the value to be 
	 */
	public void subtract (int value) {
		total -= value;
		history += "-" + value;
	}
	
	/**
	 * This method returns the computed value
	 * @return computed value as a string
	 */
	public String toString () {
		return history;
	}

	/**
	 * This method resets the string and int values 
	 */
	public void clear() {
		history = "0";
		total = 0;
	}
	
}
