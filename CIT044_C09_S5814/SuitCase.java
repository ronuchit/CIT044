// 5814
// CIT044 Assignment 9 Exercise 6
/* Stores and uses the height, length, and width of a suitcase.
*/

package edu.evc.cit044;

/** Stores and uses the height, length, and width of a suitcase.
*/
public class SuitCase implements Shipping
{
	private double length;
	private double width;
	private double height;

	/** Constructor: sets length, width, and height of suitcase.
		@param len The length of the suitcase.
		@param wid The width of the suitcase.
		@param heig The height of the suitcase.
	*/
	public SuitCase(double len, double wid, double heig)
	{
		length = len;
		width = wid;
		height = heig;
	}

	/** Returns the length of the suitcase.
		@return length The length of the suitcase.
	*/
	public double getLength()
	{
		return length;
	}

	/** Returns the width of the suitcase.
		@return width The width of the suitcase.
	*/
	public double getWidth()
	{
		return width;
	}

	/** Returns the height of the suitcase.
		@return height The height of the suitcase.
	*/
	public double getHeight()
	{
		return height;
	}

	/** Returns a string displaying the height, width, and length of the
		suitcase.
		@return infoString The string with the dimensions of the suitcase.
	*/
	public String toString()
	{
		String infoString;

		infoString = "Length=" + length + "\nWidth=" + width +
			"\nHeight=" + height;
		return infoString;
	}

	/** Returns the shipping size of the suitcase.
		@return shippingSize The shipping size of the suitcase.
	*/
	public double shippingSize()
	{
		double shippingSize;

		shippingSize = length + width + height;
		return shippingSize;
	}
}