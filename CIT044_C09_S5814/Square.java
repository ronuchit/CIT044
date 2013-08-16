// 5814
// CIT044 Assignment 9 Exercise 4
/* Stores and uses the length of a side of a square.
*/

package edu.evc.cit044;

/** Stores and uses the length of a side of a square.
*/
public class Square extends Shape
{
	private double sideLength;

	/** Constructor: sets the length of one side of the square, sets 0 if the
		side is less than or equal to 0
		@param length The length of one side of the square.
	*/
	public Square(double length)
	{
		sideLength = length;
		if (sideLength < 0)
			sideLength = 0;
	}

	/** Returns the length of one side of the square.
		@return sideLength The length one side of the square.
	*/
	public double getSide()
	{
		return sideLength;
	}

	/** Returns true if the sides of the two instances are within .1 tolerance.
		@return isEqual The boolean expression used to determine whether
				the sides of the two instances are within .1 tolerance.
	*/
	public boolean equals(Square otherSquare)
	{
		double tolerance;
		boolean isEqual;

		tolerance = Math.abs(sideLength - (otherSquare.getSide()));
		isEqual = true;
		if (tolerance > 0.1)
			isEqual = false;
		return isEqual;
	}

	/** Returns the text 'Size=' and side of the square, as a string.
		@return sizeInfo The text 'Size=' and side of the square, as a string.
	*/
	public String toString()
	{
		String sizeInfo;

		sizeInfo = "Size=" + sideLength;
		return sizeInfo;
	}

	/** Returns the surface area of the square.
		@return surfaceArea The surface area of the square.
	*/
	public double getSurfaceArea()
	{
		double surfaceArea;

		surfaceArea = sideLength * sideLength;
		return surfaceArea;
	}
}