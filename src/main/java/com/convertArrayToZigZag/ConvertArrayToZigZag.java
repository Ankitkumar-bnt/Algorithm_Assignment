package com.convertArrayToZigZag;

import java.util.Scanner;

public class ConvertArrayToZigZag {

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
		
		zigZag(arr);
	}
	
	public static void zigZag(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1] && i%2==0)
			{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			
			if(i%2!=0  && arr[i]<arr[i+1])
			{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		for(int i:arr)
			System.out.print( i+" ");
	}

}
