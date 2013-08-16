// 5814
// CIT044 Assignment 8 Exercise 2
/* Prints the price of a pizza of a user-entered size (S for small,
   M for medium, L for large, and X for extra large).
*/

import java.util.Scanner;

/** Prints the price of a pizza of a user-entered size (S for small,
   M for medium, L for large, and X for extra large).
*/
public class PizzaChoice
{
	/** Prints the price of a pizza of a user-entered size (S for small,
	    M for medium, L for large, and X for extra large).
	*/
	public static void main(String[] args)
	{
		char[] sizes =    { 'S',  'M',   'L',   'X'};
		double[] prices = {6.99, 8.99, 12.50, 15.00};
		char chosenSize;
		double priceOfPizza = 0.0;
		boolean isValid = false;

		Scanner inputDevice = new Scanner(System.in);

		System.out.println("Please enter the size of the pizza.");
		System.out.println(sizes[0] + " for small, " + sizes[1] + " for medium, " +
			sizes[2] + " for large, " +	"and " + sizes[3] + " for extra large.");
		chosenSize = inputDevice.nextLine().charAt(0);
		chosenSize = Character.toUpperCase(chosenSize);

		for (int x = 0; x < sizes.length; x++)
		{
			if (chosenSize == sizes[x])
			{
				isValid = true;
				priceOfPizza = prices[x];
			}
		}

		if (isValid == true)
			System.out.println("A " + chosenSize + " size pizza costs $" +
				priceOfPizza + ".");
		else
			System.out.println(chosenSize + " is an invalid pizza size.");
	}
}