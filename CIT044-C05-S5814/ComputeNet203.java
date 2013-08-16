// 5814
// CIT044 Assignment 5 Exercise 3
/* This program calculates net pay of an employee based on their hourly
   pay rate and hours worked.
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

/** This class calculates net pay of an employee based on their hourly
    pay rate and hours worked.
*/
public class ComputeNet203
{
	/** Calculates net pay of an employee based on their hourly
	    pay rate and hours worked.
	*/
	public static void main(String[] args)
	{
		double hourlyRate = 0.0;
		int hoursWorked = 0;
		double grossPay = 0.0;
		double withholdingTax = 0.0;
		double netPay = 0.0;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter your hourly pay rate: ");
		hourlyRate = keyboard.nextDouble();
		System.out.print("Please enter the number of hours that you worked: ");
		hoursWorked = keyboard.nextInt();

		grossPay = hourlyRate * hoursWorked;
		if (grossPay > 500.00)
			withholdingTax = 0.2;
		else
			if (grossPay > 400.00)
				withholdingTax = 0.15;
			else
				if (grossPay > 300.00)
					withholdingTax = 0.12;
				else
					withholdingTax = 0.1;

		netPay = grossPay - (withholdingTax * grossPay);

		JOptionPane.showMessageDialog(null,"Hours Worked: " + hoursWorked +
			"\nHourly Pay Rate: $" + hourlyRate +
			"\nGross Pay: $" + grossPay +
			"\nWithholding Tax: " + (withholdingTax * 100) + "%" +
			"\nNet Pay: $" + netPay);
	}
}