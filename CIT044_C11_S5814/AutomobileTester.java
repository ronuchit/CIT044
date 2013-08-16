// 5814
// CIT044 Assignment 11 Exercise 5
/* Tests the automobile class's methods.
*/

import automobile.NegativeFuelException;
import automobile.InvalidSpeedException;
import automobile.AutomobileException;
import automobile.Automobile;

/** Tests the automobile class's methods.
*/
public class AutomobileTester
{
	/** Tests the automobile class's methods.
		@throws AutomobileException Exceptions related to the automobile.
	*/
	public static void main(String[] args) throws AutomobileException
	{
		final double VALID_FUEL = 50.0;
		final double INVALID_FUEL = -20.0;
		final int VALID_SPEED = 100;
		final int HIGH_SPEED = 200;
		final int LOW_SPEED = -50;
		final String LICENSE = "4JIC767";

		Automobile auto = new Automobile();

		// valid data
		System.out.println("There should be no exception.");
		try
		{
			auto.setFields(VALID_SPEED, VALID_FUEL, LICENSE);
		}
		catch(NegativeFuelException error)
		{
			System.out.println("Caught negative fuel exception.");
		}
		catch(InvalidSpeedException error)
		{
			System.out.println("Caught invalid speed exception.");
		}
		finally
		{
			displayState(auto);
			System.out.println();
		}

		// only fuel invalid
		System.out.println("There should be a negative fuel exception.");
		try
		{
			auto.setFields(VALID_SPEED, INVALID_FUEL, LICENSE);
		}
		catch(NegativeFuelException error)
		{
			System.out.println("Caught negative fuel exception.");
		}
		catch(InvalidSpeedException error)
		{
			System.out.println("Caught invalid speed exception.");
		}
		finally
		{
			displayState(auto);
			System.out.println();
		}

		// only speed invalid high
		System.out.println("There should be an invalid speed exception.");
		try
		{
			auto.setFields(HIGH_SPEED, VALID_FUEL, LICENSE);
		}
		catch(NegativeFuelException error)
		{
			System.out.println("Caught negative fuel exception.");
		}
		catch(InvalidSpeedException error)
		{
			System.out.println("Caught invalid speed exception.");
		}
		finally
		{
			displayState(auto);
			System.out.println();
		}

		// only speed invalid low
		System.out.println("There should be an invalid speed exception.");
		try
		{
			auto.setFields(LOW_SPEED, VALID_FUEL, LICENSE);
		}
		catch(NegativeFuelException error)
		{
			System.out.println("Caught negative fuel exception.");
		}
		catch(InvalidSpeedException error)
		{
			System.out.println("Caught invalid speed exception.");
		}
		finally
		{
			displayState(auto);
			System.out.println();
		}

		// both fuel and speed invalid
		System.out.println("There should be an invalid speed and " +
			"a negative fuel exception.");
		try
		{
			auto.setFields(HIGH_SPEED, INVALID_FUEL, LICENSE);
		}
		catch(NegativeFuelException error)
		{
			System.out.println("Caught negative fuel exception.");
		}
		catch(InvalidSpeedException error)
		{
			System.out.println("Caught invalid speed exception.");
		}
		finally
		{
			displayState(auto);
			System.out.println();
		}

		// both fuel and speed invalid, using generic handler
		System.out.println("There should be a generic exception.");
		try
		{
			auto.setFields(HIGH_SPEED, INVALID_FUEL, LICENSE);
		}
		catch(AutomobileException error)
		{
			System.out.println("Caught an exception related to the automobile.");
		}
		finally
		{
			displayState(auto);
		}
	}

	/** Display state of the Automobile object.
		@param auto The automobile object.
	*/
	public static void displayState(Automobile auto)
	{
		System.out.println("Speed of automobile: " + auto.getSpeed());
		System.out.println("Fuel Amount: " + auto.getFuelAmount());
		System.out.println("License Plate: " + auto.getLicensePlate());
	}
}