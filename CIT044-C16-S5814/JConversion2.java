// 5814
// CIT044 Assignment 16 Exercise 1
/* Converts kilometers to miles and vice versa using an applet.
*/

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import java.lang.NumberFormatException;

/** Converts kilometers to miles and vice versa using an applet.
*/
public class JConversion2 extends JApplet implements ActionListener
{
	JLabel kilToMiles = new JLabel("Please enter the number " +
		"of kilometers to be converted to miles.");
	JTextField kilToMilesField = new JTextField(10);
	JLabel milesToKil = new JLabel("Please enter the number " +
		"of miles to be converted to kilometers.");
	JTextField milesToKilField = new JTextField(10);
	JButton convert = new JButton("Convert!");
	JLabel kilToMilesLabel = new JLabel();
	JLabel milesToKilLabel = new JLabel();
	private double miles = 0;
	private double kilometers = 0;
	private double miles2 = 0;
	private double kilometers2 = 0;
	private final double CONVERSION_RATE = 1.609344;
	Container con = getContentPane();
	private boolean isFirstValid = false;
	private boolean isSecondValid = false;

	/** Initializes the components on the JFrame.
	*/
	public void init()
	{
		con.setLayout(new FlowLayout());
		add(kilToMiles);
		add(kilToMilesField);
		add(milesToKil);
		add(milesToKilField);
		add(convert);
		convert.addActionListener(this);
	}

	/** Deals with displaying computed results when the button is pressed.
	*/
	public void actionPerformed(ActionEvent e)
	{
		kilToMilesLabel.setText("");
		milesToKilLabel.setText("");
		if (kilToMilesField.getText() != "\0")
		{
			try
			{
				kilometers = Double.parseDouble(kilToMilesField.getText());
				miles = kilometers / CONVERSION_RATE;
				miles = (int)(miles * 100) / 100.0; //format to two decimal places
				kilToMilesLabel.setText("There are " + String.valueOf(miles) +
					" miles in " + String.valueOf(kilometers) + " kilometers.");
				isFirstValid = true;

			}
			catch(NumberFormatException excep)
			{
				kilToMilesLabel.setText("Sorry, you did not enter a valid value.");
			}
			finally
			{
				add(kilToMilesLabel);
				invalidate();
				validate();
				repaint();
			}
		}

		if (milesToKilField.getText() != "\0")
		{
			try
			{
				miles2 = Double.parseDouble(milesToKilField.getText());
				kilometers2 = miles2 * CONVERSION_RATE;
				kilometers2 = (int)(kilometers2 * 100) / 100.0; //format to two decimal places
				milesToKilLabel.setText("There are " + String.valueOf(kilometers2) +
					" kilometers in " + String.valueOf(miles2) + " miles.");
				isSecondValid = true;
			}
			catch(NumberFormatException excep)
			{
				milesToKilLabel.setText("Sorry, you did not enter a valid value.");
			}
			finally
			{
				add(milesToKilLabel);
				invalidate();
				validate();
				repaint();
			}
		}

		if ((isFirstValid == true) && (isSecondValid == true))
		{
			play(getCodeBase(), "flute.au");
		}
		else
		{
			play(getCodeBase(), "piano.au");
		}

		isFirstValid = false;
		isSecondValid = false;
	}
}