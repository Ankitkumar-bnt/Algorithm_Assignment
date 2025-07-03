package com.fibonacci;

import java.util.Scanner;

public class FibonacciByPosition {

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
			System.out.println(series(limit));
		}
		else
			System.out.println("Invaild input");

		sc.close();
	}

	public static int series(int limit) {
		
		int f1=0;
		int f2=1;
		int fib = 0;
		
		for(int i=0;i<=limit-2;i++) {

			fib = f1 + f2;
			f1 = f2;
			f2 = fib;
		}
		return fib%1000000007;
	}
}
