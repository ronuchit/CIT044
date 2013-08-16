// 5814
// CIT044 Assignment 5 Exercise 2
/* This program prints "Accept" or "Reject" for a student applying to college
   based on their GPA and admission test score.
*/

import java.util.Scanner;

/** This class prints "Accept" or "Reject" for a student applying to college
    based on their GPA and admission test score.
*/
public class Admission02
{
	/** Prints "Accept" or "Reject" for a student applying to college
   		based on their GPA and admission test score.
	*/
	public static void main(String[] args)
	{
		double gpa = 0.0;
		int testScore = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the student's grade point average: ");
		gpa = keyboard.nextDouble();
		System.out.print("Please enter the student's admission test score: ");
		testScore = keyboard.nextInt();

		if ((gpa >= 3.0 && testScore >= 60) || (gpa < 3.0 && testScore >= 80))
			System.out.println("Accept");
		else
			System.out.println("Reject");

		System.out.println("Student's grade point average: " + gpa);
		System.out.println("Student's admission test score: " + testScore);
	}
}