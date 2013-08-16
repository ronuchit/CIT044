// 5814
// CIT044 Assignment 12 Exercise 2
/* Throws unique expections for the InventoryProcessing and InventoryUpdate
   classes.
*/

package inventory;

/** Throws unique expections for the InventoryProcessing and InventoryUpdate
   classes.
*/
public class InventoryException extends Exception
{
	/** constructor: accepts one parameter, the detail message
		@param message The detail message.
	*/
	public InventoryException(String message)
	{
		super(message);
	}
}