// 5814
// CIT044 Assignment 9 Exercise 5
/* Stores and uses the length of a side of a cube.
*/

package edu.evc.cit044;

/** Stores and uses the length of a side of a cube.
*/
public class Cube extends Square implements Shipping
{
	/** Constructor: sets length of of a side of cube
		@param length The length of one side of the cube.
	*/
	public Cube(double length)
	{
		super(length);
	}

	/** Returns the surface area of the cube.
		@return surfaceArea The surface area of the cube.
	*/
	public double getSurfaceArea()
	{
		double surfaceArea;

		surfaceArea = super.getSurfaceArea() * 6;
		return surfaceArea;
	}

	/** Returns the volume of the cube.
		@return volume The volume of the cube.
	*/
	public double getVolume()
	{
		double volume;

		volume = Math.pow(super.getSide(), 3);
		return volume;
	}

	/** Returns the shipping size of the cube.
		@return shippingSize The shipping size of the cube.
	*/
	public double shippingSize()
	{
		double shippingSize;

		shippingSize = super.getSide() * 3;
		return shippingSize;
	}
}