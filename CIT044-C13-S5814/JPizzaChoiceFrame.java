// 5814
// CIT044 Assignment 13 Exercise 1
/* Displays the total charge for a pizza with a user-entered size and
   topping using swing components.
*/

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/** Displays the total charge for a pizza with a user-entered size and
   topping using swing components.
*/
public class JPizzaChoiceFrame extends JFrame implements ActionListener
{
	private final double SMALL_PRICE = 6.99;
	private final double MEDIUM_PRICE = 8.99;
	private final double LARGE_PRICE = 12.50;
	private final double X_LARGE_PRICE = 15.00;
	private final double PEPPERONI_PRICE = 3.00;
	private final double OLIVES_PRICE = 2.00;
	private final double MUSHROOMS_PRICE = 2.50;
	private final double CHICKEN_PRICE = 4.00;
	private final double BELL_PEPPERS_PRICE = 1.50;
	private double sizePrice;
	private double toppingPrice;
	private double salesTax;
	private double totalPrice;
	private String infoString;

	JLabel sizeInfo = new JLabel("Please choose the size of the pizza " +
		"that you want.");
	JLabel toppingInfo = new JLabel("Please choose the topping that you " +
		"would like on your pizza.");
	Font bigFont = new Font("Arial", Font.PLAIN, 18);
	ButtonGroup sizeGroup = new ButtonGroup();
	JRadioButton small = new JRadioButton("Small: $" + SMALL_PRICE);
	JRadioButton medium = new JRadioButton("Medium: $" + MEDIUM_PRICE);
	JRadioButton large = new JRadioButton("Large: $" + LARGE_PRICE);
	JRadioButton xLarge = new JRadioButton("Extra Large: $" + X_LARGE_PRICE);
	JComboBox toppings = new JComboBox();
	JCheckBox isReseller = new JCheckBox("Are you a reseller?");
	JLabel idPrompt = new JLabel("Please enter your reseller ID: ");
	JTextField salesTaxID = new JTextField(15);
	JButton continueButton =
		new JButton("Please click here for pricing information");

	/** Constructor: initalizes all the default setting for the JFrame
	*/
	public JPizzaChoiceFrame()
	{
		super("Pizza Choice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		sizeInfo.setFont(bigFont);
		toppingInfo.setFont(bigFont);
		sizeGroup.add(small);
		sizeGroup.add(medium);
		sizeGroup.add(large);
		sizeGroup.add(xLarge);
		toppings.addItem("Pepperoni: $" + PEPPERONI_PRICE);
		toppings.addItem("Olives: $" + OLIVES_PRICE);
		toppings.addItem("Mushrooms: $" + MUSHROOMS_PRICE);
		toppings.addItem("Chicken: $" + CHICKEN_PRICE);
		toppings.addItem("Bell Peppers: $" + BELL_PEPPERS_PRICE);
		continueButton.setEnabled(true);
		add(sizeInfo);
		add(small);
		add(medium);
		add(large);
		add(xLarge);
		add(toppingInfo);
		add(toppings);
		add(isReseller);
		add(continueButton);
		isReseller.addActionListener(this);
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		xLarge.addActionListener(this);
		toppings.addActionListener(this);
		continueButton.addActionListener(this);
	}

	/** The steps that are to be taken after an action is performed on one
		of the JFrame components.
		@param The action event that occured.
	*/
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();

		if (source == isReseller)
		{
			if (isReseller.isSelected() == true)
			{
				add(idPrompt);
				add(salesTaxID);
				invalidate();
				validate();
				repaint();
			}
			else
			{
				remove(idPrompt);
				remove(salesTaxID);
				invalidate();
				validate();
				repaint();
			}
		}

		if (source == small)
		{
			sizePrice = SMALL_PRICE;
		}

		if (source == medium)
		{
			sizePrice = MEDIUM_PRICE;
		}

		if (source == large)
		{
			sizePrice = LARGE_PRICE;
		}

		if (source == xLarge)
		{
			sizePrice = X_LARGE_PRICE;
		}

		if (source == toppings)
		{
			switch(toppings.getSelectedIndex())
			{
				case 0:
					toppingPrice = PEPPERONI_PRICE;
					break;
				case 1:
					toppingPrice = OLIVES_PRICE;
					break;
				case 2:
					toppingPrice = MUSHROOMS_PRICE;
					break;
				case 3:
					toppingPrice = CHICKEN_PRICE;
					break;
				case 4:
					toppingPrice = BELL_PEPPERS_PRICE;
					break;
			}
		}

		if (source == continueButton)
		{
			if (isReseller.isSelected() == true)
			{
				salesTax = 0.0;
			}
			else
			{
				salesTax = 0.0925;
			}

			totalPrice = (sizePrice + toppingPrice) * (salesTax + 1);
			infoString = "Price of pizza: $" + sizePrice + "; Price of " +
				"topping: $" + toppingPrice + "; Sales tax: $" + salesTax +
				"; Total Price: $" + totalPrice;
			JLabel prices = new JLabel(infoString);
			add(prices);
			invalidate();
			validate();
			repaint();
		}
	}
}