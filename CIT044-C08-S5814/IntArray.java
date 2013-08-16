// 5814
// CIT044 Assignment 8 Exercise 1
/* Sorts an array of five integers from first to last, then from last to first.
*/

/** Sorts an array of five integers from first to last, then from last to first.
*/
public class IntArray
{
	/** Sorts an array of five integers from first to last, then from last to first.
	*/
	public static void main(String[] args)
	{
		int[] intArray = {1, 3, 26, 45, 54};
		int temp = 0;

		System.out.print("Original Array: ");
		for (int x = 0; x < intArray.length; x++)
			System.out.print(intArray[x] + " ");
		System.out.print("\n");

		for (int x = 0; x < intArray.length - 1; x++)
		{
			for (int y = 0; y < intArray.length - 1; y++)
			{
				if (intArray[y] > intArray[y + 1])
				{
					temp = intArray[y];
					intArray[y] = intArray[y + 1];
					intArray[y + 1] = temp;
				}
			}
		}

		System.out.print("Sorted in ascending numerical order: ");
		for (int x = 0; x < intArray.length; x++)
		{
			System.out.print(intArray[x] + " ");
		}
		System.out.print("\n");

		for (int x = 0; x < intArray.length - 1; x++)
		{
			for (int y = 0; y < intArray.length - 1; y++)
			{
				if (intArray[y] < intArray[y + 1])
				{
					temp = intArray[y];
					intArray[y] = intArray[y + 1];
					intArray[y + 1] = temp;
				}
			}
		}

		System.out.print("Sorted in descending numerical order: ");
		for (int x = 0; x < intArray.length; x++)
		{
			System.out.print(intArray[x] + " ");
		}
		System.out.print("\n");
	}
}