package com.secondLargest;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		if(size<=0) {
			System.out.println("Invalid input");
			return;
		}
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		int print2largest = print2largest(arr);
		System.out.println(print2largest);
	}

	public static int print2largest(int arr[])
	{
		if(arr.length<2)
			return -1;
		
		int max = Integer.MIN_VALUE;
		int secMax = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secMax = max;
				max = arr[i];
			}
			else if(arr[i]<max && arr[i]>secMax) {
				secMax = arr[i];
			}
		}
		return secMax;
	}
}
