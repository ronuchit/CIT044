// 5814
// CIT044 Assignment 2 Exercise 3
/* Converts a user-entered degrees Fahrenheit to degrees centigrade.
*/

import javax.swing.JOptionPane;

/** Converts a user-entered degrees Fahrenheit to degrees centigrade.
*/
public class DegreesConverter
{
	/** Converts a user-entered degrees Fahrenheit to degrees centigrade.
	*/
	public static void main (String[] args)
	{
		String degreesFString = "";
		double degreesC = 0.0;

		degreesFString = JOptionPane.showInputDialog(null, "What is the integer " +
		"Fahrenheit temperature you want to convert?");

		degreesC = (5.0 / 9.0) * (Integer.parseInt(degreesFString) - 32);
		JOptionPane.showMessageDialog(null, degreesFString + " degrees Fahrenheit " +
		"is " + degreesC + " degrees centigrade.");
	}
}

/** Test Cases:
	1. Input: 212
	2. Input: 100
	3. Input: 32
*/

/** Expected Results:
	1. Output: 212 degrees Fahrenheit is 100.0 degrees centigrade.
	2. Output: 100 degrees Fahrenheit is 37.7778 degrees centigrade.
	3. Output: 32 degrees Fahrenheit is 0.0 degrees centigrade.
*/

/** Actual Results:
	1. Output: 212 degrees Fahrenheit is 100.0 degrees centigrade.
	2. Output: 100 degrees Fahrenheit is 37.7778 degrees centigrade.
	3. Output: 32 degrees Fahrenheit is 0.0 degrees centigrade.
*/