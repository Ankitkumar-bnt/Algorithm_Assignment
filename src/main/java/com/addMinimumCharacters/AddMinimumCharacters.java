package com.addMinimumCharacters;

import java.util.Scanner;

public class AddMinimumCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
	
		System.out.println(addMinChar(str));
		sc.close();
	}
	
	  public static int addMinChar(String str) {
	        int n = str.length();
	        int max = 0;
	        for (int i = 0; i < n; i++) {
	        	String substring = str.substring(0, i+1);
	            if (isPalindrome(substring) && max < substring.length()) {
	                max = substring.length();
	            }
	        }
	        return str.length() - max;
	    }

	    private static boolean isPalindrome(String str) {
	       
	    	for(int i = 0,j = str.length()-1; i < j; i++, j--)
	    	{
	    		if(str.charAt(i) != str.charAt(j))
	    			return false;
	    	}
	        return true;
	    }
}
