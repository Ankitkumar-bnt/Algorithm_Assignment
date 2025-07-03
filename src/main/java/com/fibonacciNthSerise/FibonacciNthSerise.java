package com.fibonacciNthSerise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNthSerise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter limit: ");

		int limit = 0 ;
		if(sc.hasNextInt()) {
			limit = sc .nextInt();
			
			if(limit<0) {
				System.out.println("Invaild input");
				return;
			}
			List<Integer> seriesList = seriesList(limit);
			for(Integer i:seriesList)
				System.out.print(i+" ");
		}
		else
			System.out.println("Invaild input");
		sc.close();
	}

	
	public static List<Integer> seriesList(int limit) {
		
		int f1=0;
		int f2=1;
		int fib = 0;
		
		List<Integer> fiboList = new ArrayList<>();
		fiboList.add(1);

		for(int i=0;i<=limit-2;i++) {
			fib = f1 + f2;
			fiboList.add(fib);
			f1 = f2;
			f2 = fib;
		}
		return fiboList;
	}

}
