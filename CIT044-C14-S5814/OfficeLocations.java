// 5814
// CIT044 Assignment 14 Exercise 1
/* Creates three buttons which can be clicked on to get information
   about where in that state our office is located.
*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;




import javax.swing.JButton;

/** Creates three buttons which can be clicked on to get information
    about where in that state our office is located.
*/
public class OfficeLocations extends JFrame
{
	private JLabel info = new JLabel("Please click on a state to learn " +
		"where the offices are.");
	private Font infoFont = new Font("Arial", Font.PLAIN, 18);
	private String wyomingName = "Wyoming";
	private String coloradoName = "Colorado";
	private String nevadaName = "Nevada";
	private String wyomingOffice = "Cody";
	private String coloradoOffice = "Denver and Aspen";
	private String nevadaOffice = "Las Vegas and Reno";
	private JLabel cityLabel = new JLabel("Location Info");
	private JLabel blankLabel = new JLabel("");

	/** Creates three buttons which can be clicked on to get information
	    about where in that state our office is located.
	*/
	public OfficeLocations()
	{

		super("Office Locations");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		info.setFont(infoFont);
		setLayout(new BorderLayout());
		add(info, BorderLayout.NORTH);
		JPanel statePane = new JPanel(new GridLayout(3, 0));
		JPanel cityPane = new JPanel(new GridLayout());
		CityDisplayer[] cityList =
		{
			new CityDisplayer(wyomingName, wyomingOffice, cityLabel),
			new CityDisplayer(coloradoName, coloradoOffice, cityLabel),
			new CityDisplayer(nevadaName, nevadaOffice, cityLabel)
		};

		for (int x = 0; x < cityList.length; x++)
		{
			statePane.add(cityList[x].getButton());
		}

		add(statePane, BorderLayout.WEST);

		cityPane.add(blankLabel);

		for (int x = 0; x < cityList.length; x++)
		{
			cityPane.add(cityList[x].getCityLabel());
		}

		add(cityPane, BorderLayout.CENTER);
	}

	/** Instantiates an object of type StateDisplayer.
	*/
	public static void main(String[] args)
	{
		final int FRAME_WIDTH = 600;
		final int FRAME_HEIGHT = 400;
		OfficeLocations display = new OfficeLocations();
		display.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		display.setVisible(true);
	}
}