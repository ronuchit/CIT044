// 5814
// CIT044 Assignment 12 Exercise 1
/* A class with an inventory's record to help with the updating process.
*/

package inventory;

/** A class with an inventory's record to help with the updating process.
*/
public class InventoryRecord
{
	public String inventoryID;
	public int stockOnHand;
	public double cost;

	/** Default constructor: sets all data fields to appropriate
		default values.
	*/
	public InventoryRecord()
	{
		inventoryID = null;
		stockOnHand = 0;
		cost = 0.0;
	}
}