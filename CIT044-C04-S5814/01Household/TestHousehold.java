// 5814
// CIT044 Assignment 4 Exercise 1
/* This program tests the Household class.
*/

/** This class tests the Household class.
*/
public class TestHousehold
{
	/** Test the Household class.
	*/
	public static void main(String[] args)
	{
		int occupants = 0;
		int income = 0;
		Household firstHouse = new Household();

		System.out.println("First House:");

		occupants = firstHouse.getNumOfOccupants();
		System.out.println("The number of occupants should be 1, the preset " +
			"value.");
		System.out.println("The number of occupants is " + occupants + ".\n");

		firstHouse.setNumOfOccupants(20);
		occupants = firstHouse.getNumOfOccupants();
		System.out.println("The number of occupants should now be set to 20.");
		System.out.println("The number of occupants is now " + occupants + ".\n");

		income = firstHouse.getIncome();
		System.out.println("The amount of income should be 0, the preset value.");
		System.out.println("The amount of income is " + income + ".\n");

		firstHouse.setIncome(300);
		income = firstHouse.getIncome();
		System.out.println("The amount of income should now be set to 300.");
		System.out.println("The amount of income is now " + income + ".\n");

		Household secondHouse = new Household(15);

		occupants = secondHouse.getNumOfOccupants();
		System.out.println("Second house:");
		System.out.println("The number of occupants should be 15, the preset " +
			"value.");
		System.out.println("The number of occupants is " + occupants + ".\n");

		Household thirdHouse = new Household(25,400);

		occupants = thirdHouse.getNumOfOccupants();
		income = thirdHouse.getIncome();
		System.out.println("Third house:");
		System.out.println("The number of occupants should be 25, the preset " +
			"value.");
		System.out.println("The number of occupants is " + occupants + ".\n");
		System.out.println("The amount of income should be 400, the preset value.");
		System.out.println("The amount of income is " + income + ".\n");
	}
}