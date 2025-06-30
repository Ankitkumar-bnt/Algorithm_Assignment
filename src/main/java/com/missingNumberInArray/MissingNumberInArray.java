package com.missingNumberInArray;

import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		Integer arr[] = new Integer[size-1];
		for(int i=0;i<size-1;i++)
			arr[i] = sc.nextInt();
		
		System.out.println(missingNumber(arr,size));
	}
	
	public static int missingNumber(Integer arr[],int size){

		int expectedSum = size * (size + 1) / 2;
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		
		return expectedSum-sum;
	}

}
