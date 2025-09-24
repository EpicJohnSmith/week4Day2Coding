package search;

public class MatrixSearch
{

    public static int[] MatrixS(int[][] arr, int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int colIndex = binarySearch(arr[i], key); // AI wanted me to do this here
            if (colIndex != -1)
            {
                return new int[]{i, colIndex};
            }
        }
        return new int[]{-1, -1}; // this is so that it's not found, I think
    }

    private static int binarySearch(int[] row, int key) // USED Section 2.2 in zyBook for REFERENCE
    {
        int low = 0;
        int high = row.length - 1;

        while (high >= low)
        {
            int mid = (high + low) / 2;

            if (row[mid] < key)
            {
                low = mid + 1;
            } else if (row[mid] > key)
            {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) // Is main always at the end in java?
    {
        int[][] arr =
        	{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int[] result = MatrixS(arr, 5);

        System.out.println("arr[1][0] = " + arr[1][0]); // prints 5
        System.out.println("Result: [" + result[0] + "," + result[1] + "]"); // What is AI cooking here?
    }
}