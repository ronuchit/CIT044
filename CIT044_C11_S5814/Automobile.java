// 5814
// CIT044 Assignment 11 Exercise 1
/* Stores information about automobiles.
*/

package automobile;

/** Stores information about automobiles.
*/
public class Automobile
{
	private int milesPerHour;
	private double fuelAmount;
	private String licensePlate;

	/** default constructor: sets data fields to their default values
	*/
	public Automobile()
	{
		milesPerHour = 0;
		fuelAmount = 0.0;
		licensePlate = null;
	}

	/** set the values of the three data fields
		@param mph Miles per hour of the automobile.
		@param fuel Amount of fuel of the automobile.
		@param license The license plate number of the automobile.
		@throws AutomobileException Exceptions related to the automobile.
	*/
	public void setFields(int mph, double fuel, String license)
		throws AutomobileException
	{
		milesPerHour = mph;
		fuelAmount = fuel;
		licensePlate = license;

		if (fuel < 0)
		{
			fuelAmount = 0.0;
			throw(new NegativeFuelException(fuel +
				" is an invalid fuel amount."));
		}

		if (mph < -20 || mph > 120)
		{
			milesPerHour = 0;
			throw(new InvalidSpeedException(mph + " is an invalid speed. " +
				"The speed should be between -20 and 120 miles per hour."));
		}
	}

	/** get the speed of the automobile
		@return milesPerHour The speed of the automobile.
	*/
	public int getSpeed()
	{
		return milesPerHour;
	}

	/** get the fuel amount of the automobile
		@return fuelAmount The fuel amount of the automobile.
	*/
	public double getFuelAmount()
	{
		return fuelAmount;
	}

	/** get the license plate number of the automobile
		@return licensePlate The license plate number of the automobile.
	*/
	public String getLicensePlate()
	{
		return licensePlate;
	}
}