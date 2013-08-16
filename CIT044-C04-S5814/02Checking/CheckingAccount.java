// 5814
// CIT044 Assignment 4 Exercise 2
/* This class named CheckingAccount describes a checking account's number,
   balance, and minimum balance without a monthly fee.
*/

/** This class named CheckingAccount describes a checking account's number,
    balance, and minimum balance without a monthly fee.
*/
public class CheckingAccount
{
	private int accountNum;
	private double balance;
	private static double minBalance = 200.00;

	/** constructor: receives one integer and one double parameter and assigns
		them to the account number and balance, respectively
		@param beginningNum The account number to begin with.
		@param beginningBalance The balance to begin with.
	*/
	public CheckingAccount(int beginningNum, double beginningBalance)
	{
		accountNum = beginningNum;
		balance = beginningBalance;
	}

	/** returns the account number
		@return accountNum The account number.
	*/
	public int getAccountNum()
	{
		return accountNum;
	}

	/** returns the balance
		@return balance The balance.
	*/
	public double getBalance()
	{
		return balance;
	}

	/** returns the minimum balance without monthly fee
		@return minBalance The minimum balance without a monthly fee.
	*/
	public double getMinBalance()
	{
		return minBalance;
	}
}