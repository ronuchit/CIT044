// 5814
// CIT044 Assignment 12 Exercise 4
/* Updates the current inventory file.
*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;
import inventory.InventoryRecord;
import inventory.InventoryProcessing;
import inventory.InventoryException;

/** Updates the current inventory file.
*/
public class InventoryUpdate
{
	/** Updates the current inventory file.
	*/
	public static void main(String[] args)
	{
		final String IN_FILE = "CIT044C12_Inventory.in";
		final String OUT_FILE = "CIT044C12_Inventory.out";
		final int EOF = -1;
		boolean keepReading = true;
		InventoryProcessing inputProcessing = null;
		InventoryProcessing outputProcessing = null;

		try
		{
			inputProcessing = new InventoryProcessing(IN_FILE, InventoryProcessing.READ);
		}
		catch(InventoryException e)
		{
			System.out.println("Inventory input exception.");
			System.exit(1);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found exception.");
			System.exit(1);
		}
		catch(IOException e)
		{
			System.out.println("Input/output exception.");
			System.exit(1);
		}

		try
		{
			outputProcessing = new InventoryProcessing(OUT_FILE, InventoryProcessing.WRITE);
		}
		catch(InventoryException e)
		{
			System.out.println("Inventory output exception.");
			System.exit(1);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found exception.");
			System.exit(1);
		}
		catch(IOException e)
		{
			System.out.println("Input/output exception.");
			System.exit(1);
		}

		InventoryRecord record;

		while (keepReading)
		{
			try
			{
				record = inputProcessing.readRecord(InventoryProcessing.READ);
				record.cost *= 1.1;
				outputProcessing.writeRecord(record, InventoryProcessing.WRITE);
			}
			catch(InventoryException e)
			{
				System.out.println("Invalid parameter.");
				keepReading = false;
			}
			catch(EOFException e)
			{
				System.out.println("Reached end of file.");
				keepReading = false;
			}
			catch(IOException e)
			{
				System.out.println("Input/output exception.");
				keepReading = false;
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("Class not found exception.");
				keepReading = false;
			}
		}

		try
		{
			inputProcessing.closeFile(InventoryProcessing.READ);
		}
		catch(InventoryException e)
		{
			System.out.println("Invalid argument exception while closing file.");
			System.exit(1);
		}
		catch(IOException e)
		{
			System.out.println("Input/output exception.");
			System.exit(1);
		}

		try
		{
			outputProcessing.closeFile(InventoryProcessing.WRITE);
		}
		catch(InventoryException e)
		{
			System.out.println("Invalid argument exception while closing file.");
			System.exit(1);
		}
		catch(IOException e)
		{
			System.out.println("Input/output exception.");
			System.exit(1);
		}
	}
}