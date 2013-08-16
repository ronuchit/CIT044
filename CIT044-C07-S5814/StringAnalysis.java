// 5814
// CIT044 Assignment 7 Exercise 1
/* This program analyzes some text entered by the user.
*/

import javax.swing.JOptionPane;

/** This class analyzes some text entered by the user.
*/
public class StringAnalysis
{
	/** Analyzes some text entered by the user.
	*/
	public static void main(String[] args)
	{
		int letterCount = 0;
		int digitCount = 0;
		int spaceCount = 0;
		String userString = new String();
		boolean cancelCheck = false;

		userString = JOptionPane.showInputDialog(null, "Please enter " +
		"the text to be analyzed.");

		while (userString.equals(""))
		{
			userString = JOptionPane.showInputDialog(null, "Please enter " +
			"the text to be analyzed.");
		}

		for (int x = 0; x < userString.length(); x++)
		{
			char currentChar;

			currentChar = userString.charAt(x);
			if (Character.isDigit(currentChar))
				digitCount++;
			if (Character.isLetter(currentChar))
				letterCount++;
			if (Character.isWhitespace(currentChar))
				spaceCount++;
		}

		StringBuilder userStringBuilder = new StringBuilder(userString);
		StringBuilder editedString = new StringBuilder();

		for (int x = 0; x < userString.length(); x++)
		{
			char currentChar;

			currentChar = Character.toLowerCase(userStringBuilder.charAt(x));

			if (Character.isLetter(currentChar))
			{
				for (int y = 0; y < x; y++)
				{
					if (currentChar ==
						Character.toLowerCase(userStringBuilder.charAt(y)))
					{
						userStringBuilder.setCharAt(x,'\0');
					}

				}
			}
			else
				userStringBuilder.setCharAt(x,'\0');
		}

		for (int x = 0; x < userStringBuilder.length(); x++)
		{
			char currentChar;

			currentChar = Character.toLowerCase(userStringBuilder.charAt(x));

			if (!(currentChar == '\0'))
				editedString.append(currentChar);
		}

		JOptionPane.showMessageDialog(null, "The string '" + userString +
			"' has " + userString.length() + " characters.\nThere are " +
			digitCount + " digits, " + letterCount + " letters, and " +
			spaceCount + " spaces in the string.\nThe unique letters in the " +
			"string are: " + editedString + ".");

	}
}