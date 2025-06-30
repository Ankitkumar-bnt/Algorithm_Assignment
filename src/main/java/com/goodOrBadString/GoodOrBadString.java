package com.goodOrBadString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GoodOrBadString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		
		System.out.println(isGoodorBad(str));
	}
	
	public static int isGoodorBad(String str)
	{
		if(str.length() == 0)
		{
			System.out.println("Invalid input");
			return 0;
		}
		str = str.toLowerCase();
		List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
		
		for(int i=0;i<str.length()-1;i++)
		{
			if(vowels.contains(str.charAt(i))) {
				int count = 1;
				for(int j=i+1;j<str.length();j++)
				{
					if(vowels.contains(str.charAt(j)) || str.charAt(j) == '?')
					{
						count++;
					}
					else
						break;
				}
				if(count > 5)
					return 0;
			}
			
			if(!vowels.contains(str.charAt(i))) {
				int count = 1;
				for(int j=i+1;j<str.length();j++)
				{
					if(!vowels.contains(str.charAt(j)) || str.charAt(j) == '?')
					{
						count++;
					}
					else
						break;
				}
				if(count > 3)
					return 0;
			}
		}
		return 1;
	}
}
