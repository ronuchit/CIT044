// 5814
// CIT044 Assignment 4 Exercise 3
/* Exercise 7, page 182
*/

public class MathTest
{
	public static void main(String[] args)
	{

		System.out.println("a. The square root of 30 is " + Math.sqrt(30) + ".\n");

		System.out.println("b. The sine of 100 is " + Math.sin(100) + ",\n" +
			"and the cosine of 100 is " + Math.cos(100) + ".\n");

		System.out.println("c1. The floor of 44.7 is " + Math.floor(44.7) + ".");
		System.out.println("The ceiling of 44.7 is " + Math.ceil(44.7) + ".");
		System.out.println("The round of 44.7 is " + Math.round(44.7) + ".\n");

		System.out.println("c2. The floor of -44.7 is " + Math.floor(-44.7) + ".");
		System.out.println("The ceiling of -44.7 is " + Math.ceil(-44.7) + ".");
		System.out.println("The round of -44.7 is " + Math.round(-44.7) + ".\n");

		System.out.println("d. The larger of the character K and the integer 70 " +
			"is " + (char) Math.max('K', 70) + ".");
		System.out.println("The smaller of these two is " + Math.min('K', 70) + ".\n");

		System.out.println("e. A random number between 0 and 10 is " +
			Math.round(Math.random() * 10) + ".");
	}
}