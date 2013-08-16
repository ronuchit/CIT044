// 5814
// CIT044 Assignment 3 Exercise 1
/* This class allows the user to get the amount of quarters, dimes,
   nickels, and pennies necessary for the change.
*/

/** This class allows the user to get the amount of quarters, dimes,
   nickels, and pennies necessary for the change.
*/
public class ChangeMaker
{
	private int nCents;
	private int nQuarters;
	private int nDimes;
	private int nNickels;
	private int nPennies;

	// constructor
	public ChangeMaker(int cents)
	{
		nCents = cents;
	}

	// returns number of quarters
	public int getQuarters()
	{
		nQuarters = nCents / 25;
		return nQuarters;
	}

	// returns number of dimes
	public int getDimes()
	{
		nDimes = (nCents % 25) / 10;
		return nDimes;
	}

	// returns number of nickels
	public int getNickels()
	{
		nNickels = ((nCents % 25) % 10) / 5;
		return nNickels;
	}

	// returns number of pennies
	public int getPennies()
	{
		nPennies = ((nCents % 25) % 10) % 5;
		return nPennies;
	}
}