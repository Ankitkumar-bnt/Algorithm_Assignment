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
		
		immediateSmaller(arr);
	}
	
	public static void immediateSmaller(int arr[])
	{
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1] > arr[i])
			{
				System.out.print(arr[i]+" ");
			}
			else
				System.out.print("-1 ");
			
			if(i==arr.length-1)
				System.out.print("-1 ");
		}
	}

}
