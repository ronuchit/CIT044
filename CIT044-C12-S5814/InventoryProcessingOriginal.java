// 5814
// CIT044 Assignment 12 Exercise 3
/* Uses a buffered stream to read and write binary data from an inventory file.
*/

package inventory;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.lang.ClassNotFoundException;
import java.io.EOFException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/** Uses a buffered stream to read and write binary data from an inventory file.
	@throws Exceptions related to the inventory.
*/
public class InventoryProcessingOriginal extends InventoryRecord
{
	public static final int READ = 1;
	public static final int WRITE = 2;
	private DataInputStream istream;
	private DataOutputStream ostream;
	private InventoryRecord record;

	/** Constructor: accepts name of file and whether it is to be read
		or written.
		@param The file name.
		@param Whether the file is to be read or written.
		@throws An exception if the second parameter is invalid.
		@throws An exception when the file is not found.
		@throws An input/output exception.

	*/
	public InventoryProcessing(String filename, int readOrWrite)
		throws InventoryException, FileNotFoundException, IOException
	{
		if (readOrWrite == READ)
		{
						System.out.println("hi");
			istream = new DataInputStream
				(new FileInputStream(filename));
							System.out.println("hi");
		}

		else
			if (readOrWrite == WRITE)
			{
				ostream = new DataOutputStream
					(new FileOutputStream(filename));
			}

			else
				if ((readOrWrite != READ) && (readOrWrite != WRITE))
				{
					throw(new InventoryException(
						"Sorry, the file is neither an input nor an output file."));
				}
	}

	/** Reads a record from the file and returns an InventoryRecord object.
		@return The InventoryRecord object.
		@throws An exception when the end of the file is reached.
	*/
	public InventoryRecord read()
		throws EOFException, IOException, ClassNotFoundException
	{
		record = (InventoryRecord)istream.readUTF();
		return record;
	}

	/** Writes a record from the file given an InventoryRecord object.
		@param The InventoryRecord object.
	*/
	public void write(InventoryRecord record) throws IOException
	{
		ostream.write(record);
	}

	/** Closes the input file.
		@param Whether the file is to be read or written.
		@throws An exception if the parameter is invalid.
	*/
	public void closeFile(int readOrWrite)
		throws InventoryException, IOException
	{
		if (readOrWrite == READ)
		{
			istream.close();
		}
		if (readOrWrite == WRITE)
		{
			ostream.close();
		}
		if ((readOrWrite != READ) && (readOrWrite != WRITE))
		{
			throw(new InventoryException(
				"Sorry, the file could not be closed."));
		}
		record.inventoryID = null;
	}
}