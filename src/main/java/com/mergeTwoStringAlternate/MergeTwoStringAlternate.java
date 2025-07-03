package com.mergeTwoStringAlternate;

import java.util.Scanner;

public class MergeTwoStringAlternate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings: ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(s1.length()>=s2.length())	
			s1 = merge(s1, s2);
		else
			s1 = merge(s2, s1);
		
		System.out.println(s1);
		sc.close();
	}

	public static String merge(String s1, String s2)
	{
		if(s1.length()==0 || s2.length()==0)
			return "Invalid input";
		
		StringBuilder b = new StringBuilder();
		for(int i=0;i<s2.length();i++)
		{
			b.append(s1.charAt(i));
			b.append(s2.charAt(i));
		}
		
		return new String(b.append(s1.substring(s2.length(), s1.length())));
	}
}
