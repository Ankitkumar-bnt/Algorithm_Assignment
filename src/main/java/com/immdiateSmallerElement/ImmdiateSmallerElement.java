package com.immdiateSmallerElement;

import java.util.Scanner;

public class ImmdiateSmallerElement {

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
		
		int[] immediateSmaller = immediateSmaller(arr);
		for(int i=0;i<size;i++)
			System.out.print(immediateSmaller[i]+" ");
	}
	
	public static int[] immediateSmaller(int arr[])
	{
		int result[] = new int[arr.length];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1] > arr[i])
			{
				result[i-1] = arr[i];
			}
			else
				result[i-1] = -1;
				
		}
		if(result.length>0)
		result[arr.length-1] = -1;
		return result;
	}

}
