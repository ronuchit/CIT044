// 5814
// CIT044 Assignment 11 Exercise 4
/* Creates a negative fuel exception for the automobile class.
*/

package automobile;

/** Creates a negative fuel exception for the automobile class.
*/
public class NegativeFuelException extends AutomobileException
{
	/** constructor: accepts no parameters
	*/
	public NegativeFuelException()
	{
		super("Invalid fuel amount. Fuel cannot be negative.");
	}

	/** constructor: accepts one parameter, the detail message
		@param message The detail message.
	*/
	public NegativeFuelException(String message)
	{
		super(message);
	}
}