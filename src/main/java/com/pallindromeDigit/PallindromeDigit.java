package com.pallindromeDigit;

import java.util.Scanner;

public class PallindromeDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter input: ");
		
		if(sc.hasNextInt()) {
			int checkDigit = sc.nextInt();
			System.out.println(isPallindrome(checkDigit));
		}
		else {
			System.out.println("Invalid Input!");
		}
	}
	
	public static String isPallindrome(int num)
	{
		int temp = num;
		int newDigit = 0;
		
		while(temp>0)
		{
			int rem = temp % 10;
			newDigit = newDigit * 10 + rem;
			temp/=10;
		}
		
		if(num != newDigit)
			return "No";
		else
			return "Yes";
	}
}
