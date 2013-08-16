// 5814
// CIT044 Assignment 8 Exercise 3a
/* Creates the Taxpayer class with a social security number and yearly gross income.
*/

/** Taxpayer class has a social security number and yearly gross income.
*/
public class Taxpayer
{
	private StringBuilder socialSecNum = new StringBuilder("");
	private int yearlyGrossIncome = 0;

	/** Constructor: accepts two parameters for social security number
		and yearly gross income. Removes dashes from social security number
		and checks that it has 9 digits.
		@param ssn The social security number.
		@param income The yearly gross income.
	*/
	public Taxpayer(String ssn, int income)
	{
		int numberOfDashes = 0;
		StringBuilder ssnBuilder = new StringBuilder(ssn);
		for (int x = 0; x < (ssnBuilder.capacity() - 16); x++)
		{
			if (ssnBuilder.charAt(x) == '-')
				numberOfDashes++;
		}
		if (((ssnBuilder.capacity() - 16) - numberOfDashes) == 9)
			socialSecNum = ssnBuilder;
		else
			socialSecNum = null;

		yearlyGrossIncome = income;
	}

	/** Returns the social security number in the format XXX-XX-XXXX.
		@return snnBuilder The social security number.
	*/
	public StringBuilder getSocialSecNum()
	{
		if (socialSecNum == null)
		{
			StringBuilder defaultSSN = new StringBuilder("000-00-0000");
			return defaultSSN;
		}
		else
		{
			StringBuilder ssnBuilder = new StringBuilder(socialSecNum);
			ssnBuilder.insert(3,'-');
			ssnBuilder.insert(6,'-');
			return ssnBuilder;
		}
	}

	/** Returns the yearly gross income.
		@return yearlyGrossIncome The yearly gross income.
	*/
	public int getYearlyGrossIncome()
	{
		return yearlyGrossIncome;
	}
}