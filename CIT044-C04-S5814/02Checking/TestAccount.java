// 5814
// CIT044 Assignment 4 Exercise 2
/* This class tests the CheckingAccount class.
*/

/** This class tests the CheckingAccount class.
*/
public class TestAccount
{
	/** Test the CheckingAccount class.
	*/
	public static void main(String[] args)
	{
		int accountNumber;
		double balanceAmount;
		double minimumBalance;

		CheckingAccount firstAccount = new CheckingAccount(1234,300.00);
		accountNumber = firstAccount.getAccountNum();
		balanceAmount = firstAccount.getBalance();
		minimumBalance = firstAccount.getMinBalance();

		System.out.println("First Checking Account:");
		System.out.println("The account number should be 1234, the balance");
		System.out.println("300.00, and the minimum balance without fee 200.00.");
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balanceAmount);
		System.out.println("Minimum Balance Without Fee: " +
			minimumBalance + "\n");

		CheckingAccount secondAccount = new CheckingAccount(4321,500.00);
		accountNumber = secondAccount.getAccountNum();
		balanceAmount = secondAccount.getBalance();
		minimumBalance = secondAccount.getMinBalance();

		System.out.println("Second Checking Account:");
		System.out.println("The account number should be 4321, the balance");
		System.out.println("500.00, and the minimum balance without fee 200.00.");
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balanceAmount);
		System.out.println("Minimum Balance Without Fee: " +
			minimumBalance);
	}
}