package com.uniqueSubset;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
public class UniqueSubset {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter element");
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		getSubset(arr, size);
		
	}
 
	public static void getSubset(int[] arr, int size) {
	    List<List<Integer>> listOfSets = new ArrayList<>();
	    listOfSets.add(new ArrayList<>());
 
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
	            if(!flag)
	            newSubsets.add(newSubset);
	        }
	        listOfSets.addAll(newSubsets);
	    }
 
	    for (List<Integer> subset : listOfSets) {
	        System.out.println(subset);
	    }
	}
}