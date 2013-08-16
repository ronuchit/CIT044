// 5814
// CIT044 Assignment 5 Exercise 1
/* This program uses a switch statement to display the price of a
   type of wood that is chosen by the user.
*/

import java.util.Scanner;

/** This class uses a switch statement to display the price of a
    type of wood that is chosen by the user.
*/
public class Furniture01
{
	/** Uses a switch statement to display the price of a
	    type of wood that is chosen by the user.
	*/
	public static void main(String[] args)
	{
		final int PINE = 1;
		final int OAK = 2;
		final int MAHOGANY = 3;
		final double PINE_PRICE = 100.00;
		final double OAK_PRICE = 225.00;
		final double MAHOGANY_PRICE = 310.00;
		final double DEFAULT_PRICE = 0.00;
		int woodChoice = 0;
		double price = 0.00;
		String wood = "";

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hello! This program will determine the price of " +
			"a table.");
		System.out.println("Please enter the type of wood that you would like.");
		System.out.println("Enter " + PINE + " for pine, " + OAK +
			" for oak, or " + MAHOGANY + " for mahogany.");
		woodChoice = keyboard.nextInt();

		switch(woodChoice)
		{
			case PINE:
				wood = "Pine";
				price = PINE_PRICE;
				break;
			case OAK:
				wood = "Oak";
				price = OAK_PRICE;
				break;
			case MAHOGANY:
				wood = "Mahogany";
				price = MAHOGANY_PRICE;
				break;
			default:
				wood = null;
				price = DEFAULT_PRICE;

		}

		if (wood == null)
			System.out.println("Sorry. Invalid wood choice.");
		else
			System.out.println(wood + " tables costs " + price + ".");
	}
}