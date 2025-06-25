package com.sieveOfEratosthenesPrime;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenesPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter limit: ");
		int size = sc.nextInt();
		 
        boolean[] isPrime = sieveOfEratosthenes(size);

        System.out.println("Prime numbers up to " + size + ":");
        for (int i = 2; i <= size; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
	}
	
	public static boolean[] sieveOfEratosthenes(int limit)
	{
		boolean[] prime = new boolean[limit + 1];
        Arrays.fill(prime, true); 
        prime[0] = prime[1] = false; 
        
        for (int p = 2; p * p <= limit; p++) {
            if (prime[p]) {

            	for (int i = p * p; i <= limit; i += p) {
                    prime[i] = false;
                }
            }
        }

        return prime;
	}
}
