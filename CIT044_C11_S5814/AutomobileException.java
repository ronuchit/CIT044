// 5814
// CIT044 Assignment 11 Exercise 2
/* Creates exceptions for the automobile class.
*/

package automobile;

/** Creates exceptions for the automobile class.
*/
public class AutomobileException extends Exception
{
	/** constructor: accepts no parameters
	*/
	public AutomobileException()
	{
		super("Invalid entry.");
	}

	/** constructor: accepts one parameter, the detail message
		@param message The detail message.
	*/
	public AutomobileException(String message)
	{
		super(message);
	}
}