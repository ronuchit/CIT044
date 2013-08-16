// 5814
// CIT044 Assignment 3 Exercise 2
/* This class asks the user the amount of change they wish to have.
   Then, it displays the amount of quarters, dimes, nickels, and pennies
   necessary for the change.
*/

import java.util.Scanner;

/** This class asks the user the amount of change they wish to have.
    Then, it displays the amount of quarters, dimes, nickels, and pennies
    necessary for the change.
*/
public class ChangeMakerDriver
{
	/** This method calls two other methods: one receives user input, and
		one does the calculations and prints the final output to the screen.
	*/
	public static void main (String[] args)
	{
		int cents = 0;

		cents = getCents();
		ChangeMaker yourChange = new ChangeMaker(cents);
		calcChange(cents,yourChange);
	}

	/** This method receives the amount of change from the user.
	*/
	public static int getCents()
	{
		int change = 0;

		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter the amount of change in cents: ");
		change = inputDevice.nextInt();
		return (change);
	}

	/** This method prints the number of each coin necessary to the screen.
	*/
	public static void calcChange(int cents, ChangeMaker yourChange)
	{
		System.out.println("To make change for " + cents + " cents, " +
		"you would need " + yourChange.getQuarters() + " quarters, " +
		yourChange.getDimes() + " dimes,\n" + yourChange.getNickels() +
		" nickels, and " + yourChange.getPennies() + " pennies.");
	}
}