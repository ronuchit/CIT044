// 5814
// CIT044 Assignment 9 Exercise 7
/* Create references variables and instances of the Square, Cube, and SuitCase
   classes in order to test them.
*/

import edu.evc.cit044.Shape;
import edu.evc.cit044.Shipping;
import edu.evc.cit044.Square;
import edu.evc.cit044.Cube;
import edu.evc.cit044.SuitCase;

/** Create references variables and instances of the Square, Cube, and SuitCase
    classes in order to test them.
*/
public class DemoTester
{
	/** Create references variables and instances of the Square, Cube, and
	    SuitCase classes in order to test them.
	*/
	public static void main(String[] args)
	{
		final double SIDE_LENGTH = 5.0;
		final double LOWER_SIDE_LENGTH = 4.9;
		final double HIGHER_SIDE_LENGTH = 5.3;
		final double SUITCASE_LENGTH = 10.0;
		final double SUITCASE_HEIGHT = 15.0;
		final double SUITCASE_WIDTH = 20.0;
		final int NUMBER_OF_SHIPMENTS = 2;

		// square method testing
		Square squareRef = new Square(SIDE_LENGTH);
		Square lowerSquare = new Square(LOWER_SIDE_LENGTH);
		Square higherSquare = new Square(HIGHER_SIDE_LENGTH);

		System.out.println("Length of square's side (should be " +
			SIDE_LENGTH + "): " + squareRef.getSide());
		System.out.println("Is the side length approximately equal to " +
			LOWER_SIDE_LENGTH +	"? (should be true): " +
			squareRef.equals(lowerSquare));
		System.out.println("Is the side length approximately equal to " +
			HIGHER_SIDE_LENGTH + "? (should be false): " +
			squareRef.equals(higherSquare));
		System.out.println("As a string (should say Size=" + SIDE_LENGTH +
			"): " + squareRef.toString());
		System.out.println("Surface area of square (should be " +
			(SIDE_LENGTH * SIDE_LENGTH) + "): " + squareRef.getSurfaceArea());

		// cube method testing
		Cube cubeRef = new Cube(SIDE_LENGTH);
		Cube lowerCube = new Cube(LOWER_SIDE_LENGTH);
		Cube higherCube = new Cube(HIGHER_SIDE_LENGTH);
		System.out.println();

		System.out.println("Length of cube's side (should be " + SIDE_LENGTH +
			"): " + cubeRef.getSide());
		System.out.println("Is the side length approximately equal to " +
			LOWER_SIDE_LENGTH +	"? (should be true): " +
			cubeRef.equals(lowerCube));
		System.out.println("Is the side length approximately equal to " +
			HIGHER_SIDE_LENGTH + "? (should be false): " +
			cubeRef.equals(higherCube));
		System.out.println("As a string (should say Size=" + SIDE_LENGTH +
			 "): " + cubeRef.toString());
		System.out.println("Surface area of cube (should be " +
			(squareRef.getSurfaceArea() * 6) + "): " +
			cubeRef.getSurfaceArea());
		System.out.println("Volume of cube (should be " +
			(Math.pow(SIDE_LENGTH, 3)) + "): " + cubeRef.getVolume());
		System.out.println("Shipping size of cube (should be " +
			(SIDE_LENGTH * 3) + "): " +	cubeRef.shippingSize());

		// suitcase method testing
		SuitCase suitcaseRef = new SuitCase(SUITCASE_LENGTH, SUITCASE_WIDTH,
			SUITCASE_HEIGHT);
		System.out.println();

		System.out.println("Length of suitcase (should be " + SUITCASE_LENGTH +
			"): " + suitcaseRef.getLength());
		System.out.println("Height of suitcase (should be " + SUITCASE_HEIGHT +
			"): " + suitcaseRef.getHeight());
		System.out.println("Width of suitcase (should be " + SUITCASE_WIDTH +
			"): " + suitcaseRef.getWidth());
		System.out.println("Shipping size of suitcase (should be " +
			(SUITCASE_LENGTH + SUITCASE_HEIGHT + SUITCASE_WIDTH) + "): " +
			suitcaseRef.shippingSize());
		System.out.println("As a string: " + suitcaseRef.toString());

		// shape method testing
		Shape shapeRef = new Cube(SIDE_LENGTH);
		System.out.println();

		System.out.println("Surface area of the shape (should be " +
			cubeRef.getSurfaceArea() + "): " + shapeRef.getSurfaceArea());

		// shipping array testing
		Shipping[] shippingRef = new Shipping[NUMBER_OF_SHIPMENTS];
		shippingRef[0] = new Cube(SIDE_LENGTH);
		shippingRef[1] = new SuitCase(SUITCASE_LENGTH, SUITCASE_WIDTH,
			SUITCASE_HEIGHT);
		System.out.println();

		for (int x = 0; x < NUMBER_OF_SHIPMENTS; x++)
		{
			System.out.println("Item " + (x + 1));
			System.out.println("Shipping size: " +
				shippingRef[x].shippingSize());
			System.out.println("As a string: " +
				shippingRef[x].toString() + "\n");
		}
	}
}