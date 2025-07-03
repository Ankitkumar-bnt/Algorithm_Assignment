package com.kthSmallestElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class KthSmallestElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		Integer arr[] = new Integer[size];
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter index: ");
		int kthSmallest = sc.nextInt();
		
		System.out.println(kthSmallest(arr, kthSmallest));
		sc.close();
	}

	public static int kthSmallest(Integer arr[], int kthSmallest) {
		if(kthSmallest > arr.length || kthSmallest == 0)
			return -1;
		
		Set<Integer> sortedArray = new TreeSet<>(Arrays.asList(arr));
		return new ArrayList<>(sortedArray).get(kthSmallest-1);
	}
}
