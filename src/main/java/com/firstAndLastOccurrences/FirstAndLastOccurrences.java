package com.firstAndLastOccurrences;

import java.util.Scanner;

public class FirstAndLastOccurrences {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter array: ");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Enter number to find: ");
		int num = sc.nextInt();
		
		int[] firstAndLast = firstAndLast(arr, num);
		
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
