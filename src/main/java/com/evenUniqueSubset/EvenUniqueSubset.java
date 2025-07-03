package com.evenUniqueSubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EvenUniqueSubset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		if(size<0)
		{
			System.out.println("Invalid size");
			return;
		}
		int arr[] = new int[size];
		
		System.out.println("Enter element");
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		getSubset(arr, size);
		sc.close();
	}

	public static void getSubset(int[] arr, int size) {
		
	    List<List<Integer>> listOfSets = new ArrayList<>();
	    listOfSets.add(new ArrayList<>());
	    int count = 0;
	    for (int num : arr) {
	        List<List<Integer>> newSubsets = new ArrayList<>();
	        for (List<Integer> subset : listOfSets) {
	        	boolean flag = false;
	        	
	            List<Integer> newSubset = new ArrayList<>(subset);
	            newSubset.add(num);
	            
	            for(List<Integer> l: listOfSets)
	            {
	            	if(l.equals(newSubset))
	            		flag = true;
	            }
	            if(!flag) {
	            	boolean isEven = true;
	            	if (newSubset.get(0) % 2 != 0) {
	            	    isEven = false;
	            	}
	            	for(int x=1;x<newSubset.size();x++) {
	            		if(newSubset.get(x)%2!=0)
	            		{
	            			isEven = false;
	            			break;
	            		}
	            		
	            		if(newSubset.get(x) == newSubset.get(x-1))
	            		{
	            			isEven = false;
	            			break;
	            		}
	            	}
	            	if(isEven)
	            	{
	            		count ++;
	            		newSubsets.add(newSubset);
	            	}
	            }
	            
	        }
	        listOfSets.addAll(newSubsets);
	    }

	    System.out.println(count);
	    for (List<Integer> subset : listOfSets) {
	    	
	        System.out.println(subset);
	    }
	}

}
