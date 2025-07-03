package com.factorial;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = 0;
		if(sc.hasNextInt()) {
			num = sc.nextInt();
			System.out.println(factorial(num));
		}
		else {
			System.out.println("Invalid input");
		}
		sc.close();
	}

	public static int factorial(int num)
	{
		if(num<0)
			return 0;
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
}
