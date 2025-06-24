package com.pallindromeString;

import java.util.Scanner;

public class CheckPallindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter input: ");
		String checkString = sc.nextLine();
		System.out.println(isPallindrome(checkString));
	}
	
	public static String isPallindrome(String str)
	{
		char ch[] = str.toCharArray();
		
		for(int i=0, j=ch.length-1;i<j;i++,j--) {
			if(ch[i] != ch[j])
				return "No";
		}
		return "Yes";
	}

}
