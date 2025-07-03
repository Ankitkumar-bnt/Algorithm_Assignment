package com.countPairsWithGivenSum;

import java.util.Scanner;

public class CountPairsWithGivenSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		if(size<=0) {
			System.out.println("Invalid input");
			return;
		}
		int arr[] = new int[size];
		for(int i = 0; i< size; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter the sum: ");
		int k = sc.nextInt();
		System.out.println(getPairsCount(arr,k));
		sc.close();
	}
	public static int getPairsCount(int arr[], int k)
	{
		int count = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int sum=arr[i]+arr[j];
				if(sum == k)
					count++;
			}
		}
		if(count == 0)
			return -1;
		
		return count;
	}

}
