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
import inventory.InventoryRecord;

/** Uses a buffered stream to read and write binary data from an inventory file.
*/
public class InventoryProcessing
{
	public static final int READ = 1;
	public static final int WRITE = 2;
	private DataInputStream istream;
	private DataOutputStream ostream;
	private InventoryRecord record = new InventoryRecord();

	/** Constructor: accepts name of file and whether it is to be read
		or written.
		@param The file name.
		@param Whether the file is to be read or written.
		@throws An exception if the second parameter is invalid.
		@throws An exception when the file is not found.
		@throws An input/output exception.

	*/
	public InventoryProcessing(String fileName, int readOrWrite)
		throws InventoryException, FileNotFoundException, IOException
	{
		if (readOrWrite == READ)
		{
			istream = new DataInputStream
				(new FileInputStream(fileName));
		}
		else if (readOrWrite == WRITE)
		{
			ostream = new DataOutputStream
				(new FileOutputStream(fileName));
		}
		else if ((readOrWrite != READ) && (readOrWrite != WRITE))
		{
			throw(new InventoryException(
				"Sorry, the file is neither an input nor an output file."));
		}
	}

	/** Reads a record from the file and returns an InventoryRecord object.
		@return The InventoryRecord object.
		@throws An exception if the parameter is invalid.
		@throws An exception when the end of the file is reached.
		@throws An input/output exception.
		@throws An exception if the class is not found.
	*/
	public InventoryRecord readRecord(int readOrWrite)
		throws InventoryException, EOFException, IOException, ClassNotFoundException
	{
		if (readOrWrite != READ)
		{
			throw(new InventoryException(
				"Sorry, the file is not an input file."));
		}
		record.inventoryID = istream.readUTF();
		record.stockOnHand = istream.readInt();
		record.cost = istream.readDouble();
		istream.readChar(); // reads the new line character at end of record
		return record;
	}

	/** Writes a record from the file given an InventoryRecord object.
		@param The InventoryRecord object.
		@throws An exception if the parameter is invalid.
		@throws An input/output exception.
	*/
	public void writeRecord(InventoryRecord record, int readOrWrite)
		throws InventoryException, IOException
	{
		if (readOrWrite != WRITE)
		{
			throw(new InventoryException(
				"Sorry, the file is not an output file."));
		}
		ostream.writeUTF(record.inventoryID);
		ostream.writeInt(record.stockOnHand);
		ostream.writeDouble(record.cost);
	}

	/** Closes the input file.
		@param Whether the file is to be read or written.
		@throws An exception if the parameter is invalid.
		@throws An input/output exception.
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