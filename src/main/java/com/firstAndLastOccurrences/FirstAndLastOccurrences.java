package com.firstAndLastOccurrences;

public class FirstAndLastOccurrences {

	public static void main(String[] args) {

		int arr[] = {1,2,2,4,7,2,5,2,6};
		int[] firstAndLast = firstAndLast(arr, 7);
		
		if(firstAndLast.length == 2)
			System.out.println("First index: "+firstAndLast[0]+"\nLast index: "+firstAndLast[1]);
		else
			System.out.println(firstAndLast[0]);
	}
	
	public static int[] firstAndLast(int arr[], int value)
	{
		int first = -1, last = -1;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == value)
			{
				if(first == -1) 
					first = i;
				
				last = i;
			}
		}
		return first == -1 ? new int[]{-1} : new int[]{first, last};
	}

}
