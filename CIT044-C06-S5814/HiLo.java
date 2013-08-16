// 5814
// CIT044 Assignment 6 Exercise 1
/* Play the Hi Lo Game.
		The user gets 10 chances to guess a number between 0 and 100 inclusive
		chosen by random by the computer. If the user's guess is high they are
		told "Too High". If the user's guess is too low they are told "Too Low".
		When the user's guess is right, they are congratulated and told how many
		guesses it took. If the user's guess is less than 0 or greater than 100 the
		guess is not counted towards their ten guesses, they are reminded of the
		rules and told to guess again,
*/

import java.util.Scanner;

/** Play the Hi Lo Game.
		The user gets 10 chances to guess a number between 0 and 100 inclusive
		chosen by random by the computer. If the user's guess is high they are
		told "Too High". If the user's guess is too low they are told "Too Low".
		When the user's guess is right, they are congratulated and told how many
		guesses it took. If the user's guess is less than 0 or greater than 100 the
		guess is not counted towards their ten guesses, they are reminded of the
		rules and told to guess again,
*/
public class HiLo
{
	/** Play the Hi Lo Game.
			The user gets 10 chances to guess a number between 0 and 100 inclusive
			chosen by random by the computer. If the user's guess is high they are
			told "Too High". If the user's guess is too low they are told "Too Low".
			When the user's guess is right, they are congratulated and told how many
			guesses it took. If the user's guess is less than 0 or greater than 100 the
			guess is not counted towards their ten guesses, they are reminded of the
			rules and told to guess again,
	*/
	public static void main(String[] args)
	{
		int number = 0;
		int guess = 0;
		int chances = 0;
		final int MAX_NUM = 100;
		final int MIN_NUM = 0;
		final int MAX_CHANCES = 10;

		Scanner input = new Scanner(System.in);

		number = (int) (Math.random() * MAX_NUM);
		System.out.println("Hello. Welcome to the Hi Lo game. You have " +
			MAX_CHANCES + "chances to guess a number from " + MIN_NUM + "\nto " + MAX_NUM + ", " +
			"inclusive. You will be told if your guess is too high or too low.");

		do
		{
			System.out.print("Please enter your guess, between 1 and 100: ");
			guess = input.nextInt();
			while ((guess > MAX_NUM) || (guess < MIN_NUM))
			{
				System.out.println("Sorry, the number " + guess +
					" is out of range.");
				System.out.print("Please enter another guess, between 1 and 100: ");
				guess = input.nextInt();
			}

			if (guess > number)
				System.out.println("The guess " + guess + " is too high.");
			if (guess < number)
				System.out.println("The guess " + guess + " is too low.");

			chances += 1;

		} while ((guess != number) &&
		(chances < MAX_CHANCES));

		if (guess == number)
		{
			System.out.println("Congralutions! You correctly guessed the " +
			"number " + number + ".");
			System.out.println("It took you " + chances + " chances.");
			System.out.println("Thank you for playing!");
		}

		if (chances == MAX_CHANCES)
		{
			System.out.println("Sorry. You have used all of your ten chances.");
			System.out.println("The number was " + number + ".");
		}
	}
}