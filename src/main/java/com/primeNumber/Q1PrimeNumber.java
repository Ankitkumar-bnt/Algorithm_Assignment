package com.primeNumber;

import java.util.Scanner;

public class Q1PrimeNumber {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num;

        if (sc.hasNextInt()) {
            num = sc.nextInt();
            System.out.println(isPrime(num));
        } else {
            System.out.println("Invalid number");
        }

        sc.close();
    }
	
	public static int isPrime(int number) {
		
		if(number <= 1)
			return 0;
		
		for(int i=2; i<=number/2; i++) {
			if(number%i==0) {
				return 0;
			}
		}
		return 1;
	}
}

