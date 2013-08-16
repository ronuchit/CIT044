// 5814
// CIT044 Assignment 14 Exercise 2
/* Listens for button clicks and displays the appropriate city name for that
   state.
*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/** Listens for button clicks and displays the appropriate city name for that
    state.
*/
public class CityDisplayer extends JFrame implements ActionListener
{
	private final int NUMBER_OF_STATES = 3;
	private JButton stateButton;
	private String cityNames;
	private JLabel cityLabel = new JLabel();

	/** Constructor: listens for button clicks.
		@param The state name.
		@param The city(cities) where the office is located.
		@param The reference to the JLabel into which the city name
			   is displayed.
	*/
	public CityDisplayer(String state, String city, JLabel label)
	{
		stateButton = new JButton(state);
		cityNames = city;
		cityLabel = label;
		stateButton.addActionListener(this);
	}

	/** Sets the text of the JLabel to the respective city(cities) name when
		a button is clicked.
	*/
	public void actionPerformed(ActionEvent e)
	{
		cityLabel.setText(cityNames);
	}

	/** Returns the JButton with the state name on it.
		@return The state button.
	*/
	public JButton getButton()
	{
		return stateButton;
	}

	/** Returns the JLabel with the current city(cities).
		@return The JLabel.
	*/
	public JLabel getCityLabel()
	{
		return cityLabel;
	}
}