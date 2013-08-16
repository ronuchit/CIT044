// 5814
// CIT044 Assignment 4 Exercise 1
/* This program creates a class named Household, with a number of occupants and
   amount of income, 3 overloaded constructors, and get and set methods for each
   data field.
*/

/** This class named Household has a number of occupants and
    amount of income, 3 overloaded constructors, and get and set methods for each
    data field.
*/
public class Household
{
	private int numOfOccupants;
	private int income;

	/** This default constructor sets number of occupants to 1 and income to 0
	*/
	public Household()
	{
		numOfOccupants = 1;
		income = 0;
	}

	/** This constructor receives an integer parameter that is assigned to the
			number of occupants.
		@param beginningOccupants The number of occupants to begin with.
	*/
	public Household(int beginningOccupants)
	{
		numOfOccupants = beginningOccupants;
		income = 0;
	}

	/** This constructor receives two integer parameters and assigns them to
			the number of occupants and amount of income, respectively.
		@param beginningOccupants The number of occupants to begin with.
		@param beginningIncome The amount of income to begin with.
	*/
	public Household(int beginningOccupants, int beginningIncome)
	{
		numOfOccupants = beginningOccupants;
		income = beginningIncome;
	}

	/** returns the number of occupants
		@return numOfOccupants The number of occupants.
	*/
	public int getNumOfOccupants()
	{
		return numOfOccupants;
	}

	/** sets the number of occupants
		@param occupants The new number of occupants.
	*/
	public void setNumOfOccupants(int occupants)
	{
		numOfOccupants = occupants;
	}

	/** returns the income amount
		@return income The amount of income.
	*/
	public int getIncome()
	{
		return income;
	}

	/** sets the income amount
		@param incomeAmount The new amount of income.
	*/
	public void setIncome(int incomeAmount)
	{
		income = incomeAmount;
	}
}