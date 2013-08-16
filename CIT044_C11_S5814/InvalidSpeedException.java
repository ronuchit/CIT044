// 5814
// CIT044 Assignment 11 Exercise 3
/* Creates an invalid speed exception for the automobile class.
*/

package automobile;

/** Creates an invalid speed exception for the automobile class.
*/
public class InvalidSpeedException extends AutomobileException
{
	/** constructor: accepts no parameters
	*/
	public InvalidSpeedException()
	{
		super("Invalid speed.");
	}

	/** constructor: accepts one parameter, the detail message
		@param message The detail message.
	*/
	public InvalidSpeedException(String message)
	{
		super(message);
	}
}