package com.smallestAndSecondSmallest;

import java.util.Scanner;

public class SmallestAndSecondSmallest {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		inputHelper(size);
	}
	
	public static void inputHelper(int size)
	{
		if(size<=0) {
			System.out.println("Invalid input");
			return;
		}

		int arr[] = new int[size];
		System.out.println("Enter array: ");
		for(int i=0;i<size;i++)
			arr[i]= sc.nextInt();
		
		minAnd2ndMin(arr);
	}
	
	public static void minAnd2ndMin(int arr[]) {
		
		if(arr.length<2)
		{
			System.out.println("{-1,-1}");
			return;
		}
		
		int min = Integer.MAX_VALUE;
		int secMin = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				secMin = min;
				min = arr[i];
			}
		}
		
		System.out.println("{"+min+", "+secMin+"}");
	}

}
