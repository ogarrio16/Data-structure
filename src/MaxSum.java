// Java program to find the array
// element that appears only once
class MaxSum
{
	// Return the maximum Sum of difference
	// between consecutive elements.
	static int findSingle(int ar[], int ar_size)
	{
		// Do XOR of all elements and return
		//{1,2,3,4,3,2,1}
		int res = ar[0];
		for (int i = 1; i < ar_size; i++)
			res = res ^ ar[i];
	
		return res;
	}

	// Driver code
	public static void main (String[] args)
	{
		int ar[] = {1,2,3,4,3,2,1};
		int n = ar.length;
		System.out.println("Element occurring once is " +
							findSingle(ar, n) + " ");
	}
}
// This code is contributed by Prakriti Gupta
