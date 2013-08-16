// 5814
// CIT044 Assignment 8 Exercise 3b
/* Creates an array of ten Taxpayer objects.
*/

/** Creates an array of ten Taxpayer objects.
*/
public class TaxpayerDriver
{
	/** Creates an array of ten Taxpayer objects.
	*/
	public static void main(String[] args)
	{
		final int NUMBER_OF_PAYERS = 10;
		final String START_SSN = "32412";
		final int BEG_INCOME = 0;
		int integerSSN = 0;
		String ssn = "";
		Taxpayer[] payers = new Taxpayer[NUMBER_OF_PAYERS];

		for (int x = 0; x < NUMBER_OF_PAYERS; x++)
		{
			integerSSN = Integer.parseInt(START_SSN) + x;
			ssn = Integer.toString(integerSSN);
			payers[x] = new Taxpayer(ssn, (BEG_INCOME + (x * 10000)));
		}

		for (int x = 0; x < NUMBER_OF_PAYERS; x++)
		{
			System.out.println("Taxpayer number " + (x+ 1) + ":");
			System.out.println("Social Security Number: " +
				payers[x].getSocialSecNum());
			System.out.println("Yearly Gross Income: " +
				payers[x].getYearlyGrossIncome() + "\n");
		}
	}
}