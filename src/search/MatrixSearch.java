package search;

public class MatrixSearch
{

	public static void main(String[] args)
	{
		int [][] arr = 
			{
					{1, 2, 3, 4},
					{5, 6, 7, 8},
					{9, 10, 11, 12}
			};
		
		int[] result = MatrixS(arr, 5);
		System.out.println("\"Result: [" + result[0] + "," + result[1] + "]");
		
	}
	
	
	public class Matrix
	{
		public static int[] MatrixS(int[][] arr, int key)
		{
			for(int i = 0; i < arr.length; i++) // AI wants us to loop here
			{
				int colIndex = binarySearch(arr[i], key);
				if(colIndex != -1)
				{
					return new int[](i, colIndex); // AI belives this is found at row i, column colIndex
				}
			}
			
			return new int[](-1, -1); // this can't be found
		}
	}
	
	private static int binarySearch(int[] row, int key) // USING zyBook Section 2.2 for REFERENCE
	{
	    int low = 0;
	    int high = row.length - 1;

	    while (high >= low) {
	        int mid = (high + low) / 2;

	        if (row[mid] < key) {
	            low = mid + 1;
	        } else if (row[mid] > key) {
	            high = mid - 1;
	        } else {
	            return mid;
	        }
	    }

	    return -1; // not found
	}
}
