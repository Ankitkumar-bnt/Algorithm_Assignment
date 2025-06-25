package com.thirdLargestElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ThirdLargestElement {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		System.out.println(inputHelper(size));
	}
	
	public static int inputHelper(int size)
	{
		if(size<=0) {
			System.out.println("Invalid input");
			return 0;
		}
		if(size<3)
			return -1;
		
		Integer arr[] = new Integer[size];
		System.out.println("Enter array: ");
		for(int i=0;i<size;i++)
			arr[i]= sc.nextInt();
		
		return thirdLargest(arr);
	}

	public static int thirdLargest(Integer arr[])
	{
		Set<Integer> sortedSet = new TreeSet<>(Arrays.asList(arr));
		
		return new ArrayList<>(sortedSet).get(sortedSet.size()-3);
	}
}
